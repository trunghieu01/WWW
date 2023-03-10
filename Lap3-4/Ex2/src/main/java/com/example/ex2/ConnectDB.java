package com.example.ex2;

import java.sql.*;

public class ConnectDB {
    private Connection con;

    public ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb", "root", "admin");
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
    }
}
