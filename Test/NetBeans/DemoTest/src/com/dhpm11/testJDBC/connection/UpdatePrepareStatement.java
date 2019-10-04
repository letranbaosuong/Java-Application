/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.testJDBC.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suong
 */
public class UpdatePrepareStatement {

    public static void insertRecords(int id, String name) {
        Connection connection = JDBCConnection.getJDBConnection();

        String sql = "insert into person(id, name) values(?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateRecords(int id, String newName) {
        Connection connection = JDBCConnection.getJDBConnection();

        String sql = "update person set name = ? where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteRecords(int id) {
        Connection connection = JDBCConnection.getJDBConnection();

        String sql = "delete from person where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        insertRecords(4, "D");
        updateRecords(3, "A");
        deleteRecords(1);
    }

}
