package huncam.controller;

import huncam.config.Database;
import huncam.model.CartItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionController {

    public boolean processTransaction(java.util.List<CartItem> cartItems, double totalAmount, int userId) {
        Connection conn = null;
        try {
            conn = Database.getConnection();
            conn.setAutoCommit(false);

            String transactionSQL = "INSERT INTO transactions (user_id, transaction_date, total_amount, payment_amount, change_amount) VALUES (?, NOW(), ?, ?, ?)";
            PreparedStatement pstmtTransaction = conn.prepareStatement(transactionSQL, Statement.RETURN_GENERATED_KEYS);

            pstmtTransaction.setInt(1, userId);
            pstmtTransaction.setDouble(2, totalAmount);
            pstmtTransaction.setDouble(3, totalAmount);
            pstmtTransaction.setDouble(4, 0);
            pstmtTransaction.executeUpdate();

            ResultSet generatedKeys = pstmtTransaction.getGeneratedKeys();
            int transactionId;
            if (generatedKeys.next()) {
                transactionId = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Gagal membuat transaksi, tidak ada ID yang didapat.");
            }

            String detailSQL = "INSERT INTO transaction_details (transaction_id, product_id, quantity, subtotal) VALUES (?, ?, ?, ?)";
            String updateStockSQL = "UPDATE products SET stock = stock - ? WHERE id = ?";

            PreparedStatement pstmtDetail = conn.prepareStatement(detailSQL);
            PreparedStatement pstmtUpdateStock = conn.prepareStatement(updateStockSQL);

            for (CartItem item : cartItems) {
                pstmtDetail.setInt(1, transactionId);
                pstmtDetail.setInt(2, item.getProduct().getId());
                pstmtDetail.setInt(3, item.getQuantity());
                pstmtDetail.setDouble(4, item.getSubtotal());
                pstmtDetail.addBatch();

                pstmtUpdateStock.setInt(1, item.getQuantity());
                pstmtUpdateStock.setInt(2, item.getProduct().getId());
                pstmtUpdateStock.addBatch();
            }

            pstmtDetail.executeBatch();
            pstmtUpdateStock.executeBatch();

            conn.commit();
            return true;

        } catch (SQLException e) {
            System.err.println("Transaksi Gagal! Melakukan Rollback.");
            e.printStackTrace();
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            return false;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
