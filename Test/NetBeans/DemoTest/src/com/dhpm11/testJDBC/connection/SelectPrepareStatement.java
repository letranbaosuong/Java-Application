/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.testJDBC.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suong
 */
public class SelectPrepareStatement {

    public static void main(String[] args) {
        Connection connection = JDBCConnection.getJDBConnection();

        String sql = "select * from person where id = ? and name = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2,"A");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectPrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
