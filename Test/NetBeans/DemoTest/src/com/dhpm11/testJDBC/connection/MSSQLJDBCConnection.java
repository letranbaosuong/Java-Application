/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.testJDBC.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suong
 */
public class MSSQLJDBCConnection {

    public static Connection getJDBCConnection() {
        final String user = "sa";
        final String password = "suong123";
        final String url = "jdbc:sqlserver://localhost:1433;databaseName=DBEmployee;user=" + user + "password=" + password;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MSSQLJDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        Connection connection = getJDBCConnection();
        if (connection != null) {
            System.out.println("Thanh cong");
        } else {
            System.out.println("That bai");
        }
    }

}
