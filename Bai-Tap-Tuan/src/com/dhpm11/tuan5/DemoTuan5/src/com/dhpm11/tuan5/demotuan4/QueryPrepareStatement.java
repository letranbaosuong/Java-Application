/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan5.demotuan4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suong
 */
public class QueryPrepareStatement {

    public static void insertRecords(String id, String name, boolean books, boolean newpapers, boolean journalsandmagazine, String address, String contact, String email, String remarks) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO `booksuppliers`(`ID`, `Name`, `Books`, `NewsPapers`, `JournalsandMagazines`, `Address`, `ContactNo`, `EmailID`, `Remarks`) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setBoolean(3, books);
        preparedStatement.setBoolean(4, newpapers);
        preparedStatement.setBoolean(5, journalsandmagazine);
        preparedStatement.setString(6, address);
        preparedStatement.setString(7, contact);
        preparedStatement.setString(8, email);
        preparedStatement.setString(9, remarks);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
        connection.close();
        preparedStatement.close();
    }

    public static void updateRecords(String id, String name, boolean books, boolean newpapers, boolean journalsandmagazine, String address, String contact, String email, String remarks) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE `booksuppliers` SET `Name`=?,`Books`=?,`NewsPapers`=?,`JournalsandMagazines`=?,`Address`=?,`ContactNo`=?,`EmailID`=?,`Remarks`=? WHERE `ID`=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setBoolean(2, books);
        preparedStatement.setBoolean(3, newpapers);
        preparedStatement.setBoolean(4, journalsandmagazine);
        preparedStatement.setString(5, address);
        preparedStatement.setString(6, contact);
        preparedStatement.setString(7, email);
        preparedStatement.setString(8, remarks);
        preparedStatement.setString(9, id);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
        connection.close();
        preparedStatement.close();
        connection.close();
        preparedStatement.close();
    }

    public static void deleteRecords(String id) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM `booksuppliers` WHERE ID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
        connection.close();
        preparedStatement.close();
    }

    public static boolean checkRecords(String id) throws SQLException {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT `ID` FROM `booksuppliers` WHERE ID = \"" + id + "\"";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            String name = rs.getString("ID");
            System.out.println(name);
            return true;
        }
        connection.close();
        rs.close();
        preparedStatement.close();
        return false;
    }

    public static List<ThongTin> getInfo() throws SQLException {
        List<ThongTin> infos = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT `ID`, `Name`, `Books`, `NewsPapers`, `JournalsandMagazines`, `Address`, `ContactNo`, `EmailID`, `Remarks` FROM `booksuppliers` WHERE 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            ThongTin info = new ThongTin();
            info.setId(rs.getString("ID"));
            info.setName(rs.getString("Name"));
            info.setBooks(rs.getBoolean("Books"));
            info.setNewspapers(rs.getBoolean("NewsPapers"));
            info.setJournalsandmagazines(rs.getBoolean("JournalsandMagazines"));
            info.setAddress(rs.getString("Address"));
            info.setContact(rs.getString("ContactNo"));
            info.setEmail(rs.getString("EmailID"));
            info.setRemarks(rs.getString("Remarks"));

            infos.add(info);
        }
        connection.close();
        rs.close();
        preparedStatement.close();
        return infos;
    }

    public static void main(String[] args) {
        try {
            boolean kt = checkRecords("001");
            if (kt) {
                System.out.println("Co ne");
            } else {
                System.out.println("No");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryPrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
