package com.example.ex2;

import java.sql.*;

public class ConnectDB {
    private Connection con;

    public ConnectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mvc;encrypt=true;trustServerCertificate=true;", "sa", "123456");
            System.out.println("Connect successfully!");
        } catch (Exception e) {
            System.out.println("Connect failure!");
            e.printStackTrace();
        }
    }

    public void update(Account acc) throws SQLException {
        Statement stmt = con.createStatement();
        String sqlUpdate = "UPDATE account "
                + "SET password = " + "'"+acc.getPassword()+"'"
                + "WHERE firstName = " + "'"+acc.getFirstName()+"'";
        stmt.executeUpdate(sqlUpdate);
        System.out.println(stmt.executeUpdate(sqlUpdate));
    }
}
