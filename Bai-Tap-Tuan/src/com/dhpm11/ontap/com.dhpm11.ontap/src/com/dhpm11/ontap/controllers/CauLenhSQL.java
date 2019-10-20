/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.ontap.controllers;

import com.dhpm11.ontap.models.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suong
 */
public class CauLenhSQL {

    public static void insertRecords(int maSV, String ten,String lop, String ngaySinh, String gioiTinh, String sdt, String diaChi, boolean trangThai) throws SQLException {
        Connection connection = KetNoiCSDL.getJDBCConnection();

        String sql = "INSERT INTO `sinh_vien`(`ma_sv`, `ten`, `lop`, `ngay_sinh`, `gioi_tinh`, `sdt`, `dia_chi`, `trang_thai`) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, maSV);
        preparedStatement.setString(2, ten);
        preparedStatement.setString(3, lop);
        preparedStatement.setString(4, ngaySinh);
        preparedStatement.setString(5, gioiTinh);
        preparedStatement.setString(6, sdt);
        preparedStatement.setString(7, diaChi);
        preparedStatement.setBoolean(8, trangThai);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static void updateRecords(int maSV, String ten,String lop, String ngaySinh, String gioiTinh, String sdt, String diaChi, boolean trangThai) throws SQLException {
        Connection connection = KetNoiCSDL.getJDBCConnection();

        String sql = "UPDATE `sinh_vien` SET `ten`=?,`lop`=?,`ngay_sinh`=?,`gioi_tinh`=?,`sdt`=?,`dia_chi`=?,`trang_thai`=? WHERE `ma_sv`=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ten);
        preparedStatement.setString(2, lop);
        preparedStatement.setString(3, ngaySinh);
        preparedStatement.setString(4, gioiTinh);
        preparedStatement.setString(5, sdt);
        preparedStatement.setString(6, diaChi);
        preparedStatement.setBoolean(7, trangThai);
        preparedStatement.setInt(8, maSV);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static void deleteRecords(int maSV) throws SQLException {
        Connection connection = KetNoiCSDL.getJDBCConnection();

        String sql = "DELETE FROM `sinh_vien` WHERE ma_sv = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, maSV);
        int rs = preparedStatement.executeUpdate();
        System.out.println(rs);
    }

    public static List<SinhVien> getInfo() throws SQLException {
        List<SinhVien> infos = new ArrayList<>();
        Connection connection = KetNoiCSDL.getJDBCConnection();

        String sql = "SELECT * FROM `sinh_vien` WHERE 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            SinhVien info = new SinhVien();
            info.setMaSV(rs.getInt("ma_sv"));
            info.setTen(rs.getString("ten"));
            info.setLop(rs.getString("lop"));
            info.setNgaySinh(rs.getString("ngay_sinh"));
            info.setGioiTinh(rs.getString("gioi_tinh"));
            info.setSdt(rs.getString("sdt"));
            info.setDiaChi(rs.getString("dia_chi"));
            info.setTrangThai(rs.getBoolean("trang_thai"));

            infos.add(info);
        }
        return infos;
    }

}
