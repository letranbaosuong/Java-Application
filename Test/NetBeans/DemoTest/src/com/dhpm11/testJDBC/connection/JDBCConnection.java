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
public class JDBCConnection {

    public static Connection getJDBConnection() {
//        final String url = "jdbc:mysql://localhost:3306/hello";
//        final String user = "root";
//        final String password = "";
        
        final String url = "jdbc:mysql://myshoponlinelaptopdienthoai.000webhostapp.com/id9372209_myshoponlinelaptopdienthoai";
        final String user = "id9372209_suongrau";
        final String password = "suongrau2019";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        Connection connection = getJDBConnection();
        if (connection != null) {
            System.out.println("Thanh cong");
        } else {
            System.out.println("That bai");
        }
    }

}
