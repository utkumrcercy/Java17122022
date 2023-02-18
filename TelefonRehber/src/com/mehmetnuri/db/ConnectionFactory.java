package com.mehmetnuri.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final static String url = "jdbc:postgresql://kandula.db.elephantsql.com:5432/nnpdtyax";
    private final static String userName = "nnpdtyax";
    private final static String password = "GHFZB2IN3K3U4Dhfb1Jonxv5deDAvazQ";


    public Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.jdbc.PgResultSet");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("JDBC Driveri Yüklü Değil");
        }


        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("DB Bağlantısı Başarılı");

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        return connection;
    }
}
