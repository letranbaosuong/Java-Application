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
public class SelectStatement {

    public static void main(String[] args) {
        Connection conn = JDBCConnection.getJDBConnection();

        try {
            Statement statement = conn.createStatement();

            final String sql = "SELECT * FROM `demo` WHERE id = 2";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " " + name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectStatement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
