/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan4;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Suong
 */
public class QueryPrepareStatement {

    public static void insertRecords(int id, String name, String type, String address, String contact, String email, String remarks) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO `booksuppliers`(`ID`, `Name`, `Type`, `Address`, `ContactNo`, `EmailID`, `Remarks`) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, type);
        preparedStatement.setString(4, address);
        preparedStatement.setString(5, contact);
        preparedStatement.setString(6, email);
        preparedStatement.setString(7, remarks);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static void updateRecords(int id, String name, String type, String address, String contact, String email, String remarks) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE `booksuppliers` SET `Name`=?,`Type`=?,`Address`=?,`ContactNo`=?,`EmailID`=?,`Remarks`=? WHERE ID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, type);
        preparedStatement.setString(3, address);
        preparedStatement.setString(4, contact);
        preparedStatement.setString(5, email);
        preparedStatement.setString(6, remarks);
        preparedStatement.setInt(7, id);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static void deleteRecords(int id) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM `booksuppliers` WHERE ID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static ArrayList<ThongTin> getInfo() throws SQLException {
        ArrayList<ThongTin> infos = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT `ID`, `Name`, `Type`, `Address`, `ContactNo`, `EmailID`, `Remarks` FROM `booksuppliers` WHERE 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            ThongTin info = new ThongTin();
            info.setId(rs.getInt("ID"));
            info.setName(rs.getString("Name"));
            info.setName(rs.getString("Type"));
            info.setName(rs.getString("Address"));
            info.setName(rs.getString("ContactNo"));
            info.setName(rs.getString("EmailID"));
            info.setName(rs.getString("Remarks"));

            infos.add(info);
        }
        return infos;
    }

}
