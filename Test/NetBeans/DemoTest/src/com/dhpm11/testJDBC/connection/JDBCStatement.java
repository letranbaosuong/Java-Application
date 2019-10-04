/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.testJDBC.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suong
 */
public class JDBCStatement {

    public static void main(String[] args) {
//        try {
//            Connection con = JDBCConnection.getJDBConnection();
//            Statement statement = con.createStatement(); // tao cau lenh sql
//
//            String sql = "SELECT * FROM `demo`";
//            ResultSet rs = statement.executeQuery(sql); // tra ve thuc thi cau lenh sql
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//
//                System.out.println(id + " " + name);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(JDBCStatement.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            Connection con = JDBCConnection.getJDBConnection();
            Statement statement = con.createStatement(); // tao cau lenh sql

            String sql = "SELECT * FROM `demo`";
            ResultSet rs = statement.executeQuery(sql); // tra ve thuc thi cau lenh sql
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " " + name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
