/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.testJDBC.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suong
 */
public class InsertStatement {

    public static void insertRecords(int id, String name) {

        Connection connection = JDBCConnection.getJDBConnection();

        try {
            Statement statement = connection.createStatement();

            String sql = "insert into person(id, name) values(" + id + ", '" + name + "')";

            int rs = statement.executeUpdate(sql);

            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(InsertStatement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateRecords(int id, String newName) {
        Connection connection = JDBCConnection.getJDBConnection();

        try {
            Statement statement = connection.createStatement();

            String sql = "update person set name = '" + newName + "' where id = " + id;

            int rs = statement.executeUpdate(sql);

            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(InsertStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteRecords(int id) {
        Connection connection = JDBCConnection.getJDBConnection();

        try {
            Statement statement = connection.createStatement();

            String sql = "delete from person where id = " + id;

            int rs = statement.executeUpdate(sql);

            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(InsertStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        insertRecords(1, "A");
        insertRecords(2, "B");
        insertRecords(3, "C");
//        updateRecords(1, "B");
//        deleteRecords(1);
    }

}
