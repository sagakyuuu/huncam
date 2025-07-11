package huncam.config;

import java.sql.*;

public class Database {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/huncam_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private static Connection connection;

    private Database() {}

    
    public static Connection getConnection() {
        try {
            // Hanya buat koneksi baru jika belum ada atau sudah ditutup
            if (connection == null || connection.isClosed()) {
                // Muat driver MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Buat koneksi ke database dan simpan di variabel statis
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Koneksi ke database gagal: " + e.getMessage());
        }
        return connection;
    }

}
