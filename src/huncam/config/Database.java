package huncam.config;

import java.sql.*;

public class Database {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/huncam_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            // Muat driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL tidak ditemukan!");
            e.printStackTrace();
        }

        // Buat koneksi ke database
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
