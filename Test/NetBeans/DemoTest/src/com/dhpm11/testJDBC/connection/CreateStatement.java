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
public class CreateStatement {

    public static void createTable() {
        Connection connection = JDBCConnection.getJDBConnection();

        try {
            Statement statement = connection.createStatement();

            String sql = "create table person(id int, name varchar(255))";

            int rs = statement.executeUpdate(sql);

            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CreateStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteTable(){
        Connection connection = JDBCConnection.getJDBConnection();

        try {
            Statement statement = connection.createStatement();

            String sql = "drop table person";

            int rs = statement.executeUpdate(sql);

            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CreateStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        createTable();
//        deleteTable();
    }

}
