package huncam.controller;

import huncam.config.Database;
import huncam.model.User;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserController {

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Connection conn = Database.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                userList.add(new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("nama_lengkap"),
                        rs.getString("role")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Gagal mengambil data pengguna: " + e.getMessage());
        }
        return userList;
    }

    public boolean addUser(User user) {
        String sql = "INSERT INTO users(username, password, nama_lengkap, role) VALUES(?, ?, ?, ?)";
        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getNamaLengkap());
            pstmt.setString(4, user.getRole());

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Gagal menambahkan pengguna: " + e.getMessage());
            return false;
        }
    }

    public boolean updateUser(User user) {
        String sql = "UPDATE users SET username = ?,  nama_lengkap = ?, role = ? WHERE id = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getNamaLengkap());
            pstmt.setString(3, user.getRole());
            pstmt.setInt(4, user.getId());

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Gagal memperbarui pengguna: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteUser(int userId) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, userId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Gagal menghapus pengguna: " + e.getMessage());
            return false;
        }
    }

    private boolean isUsernameExists(String username) throws SQLException {
        String sql = "SELECT COUNT(*) FROM users WHERE username = ?";
        try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    public String register(User user) {
        try {
            if (user.getUsername().isEmpty() || user.getPassword().isEmpty() || user.getNamaLengkap().isEmpty()) {
                return "Semua field harus diisi!";
            }
            if (isUsernameExists(user.getUsername())) {
                return "Username sudah digunakan. Silakan pilih yang lain.";
            }

            user.setRole("user");
            if (addUser(user)) {
                return "Registrasi berhasil!";
            } else {
                return "Terjadi kesalahan saat registrasi.";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Error koneksi database.";
        }
    }
}
