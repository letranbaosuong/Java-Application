/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.ontap.views;

import com.dhpm11.ontap.controllers.CauLenhSQL;
import com.dhpm11.ontap.models.SinhVien;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Suong
 */
public class DemoOnTap extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    /**
     * Creates new form DemoOnTap
     */
    public DemoOnTap() throws SQLException {
        initComponents();
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        pnMain = new javax.swing.JPanel();
        pnTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnBottom = new javax.swing.JPanel();
        jScrollPaneThongTin = new javax.swing.JScrollPane();
        tblThongTin = new javax.swing.JTable();
        pnCenter = new javax.swing.JPanel();
        lblMaSV = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        lblTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lblNgaySinh = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblSdt = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblTrangThai = new javax.swing.JLabel();
        dtNgaySinh = new com.toedter.calendar.JDateChooser();
        chkTrangThai = new javax.swing.JCheckBox();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        pnThaoTac = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        lbLop = new javax.swing.JLabel();
        cbLop = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMain.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Sinh Viên");
        pnTop.add(jLabel1);

        pnMain.add(pnTop, java.awt.BorderLayout.PAGE_START);

        tblThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Tên", "Lớp", "Ngày Sinh", "Giới Tính", "SĐT", "Địa chỉ", "Trạng Thái"
            }
        ));
        tblThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinMouseClicked(evt);
            }
        });
        jScrollPaneThongTin.setViewportView(tblThongTin);

        javax.swing.GroupLayout pnBottomLayout = new javax.swing.GroupLayout(pnBottom);
        pnBottom.setLayout(pnBottomLayout);
        pnBottomLayout.setHorizontalGroup(
            pnBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnBottomLayout.setVerticalGroup(
            pnBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMain.add(pnBottom, java.awt.BorderLayout.PAGE_END);

        lblMaSV.setText("Mã SV");

        lblTen.setText("Tên");

        lblNgaySinh.setText("Ngày Sinh");

        lblGioiTinh.setText("Giới Tính");

        lblSdt.setText("SĐT");

        lblDiaChi.setText("Địa Chỉ");

        lblTrangThai.setText("Trạng Thái");

        chkTrangThai.setText("Còn học");

        btnGroup.add(rdNam);
        rdNam.setText("Nam");

        btnGroup.add(rdNu);
        rdNu.setText("Nữ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXoaTrang.setText("Xóa Trắng");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThaoTacLayout = new javax.swing.GroupLayout(pnThaoTac);
        pnThaoTac.setLayout(pnThaoTacLayout);
        pnThaoTacLayout.setHorizontalGroup(
            pnThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoaTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        pnThaoTacLayout.setVerticalGroup(
            pnThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThaoTacLayout.createSequentialGroup()
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnXoaTrang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbLop.setText("Lớp");

        cbLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11DHPM", "11DHMMT" }));

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCenterLayout.createSequentialGroup()
                        .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGioiTinh)
                            .addComponent(lblSdt)
                            .addComponent(lblDiaChi))
                        .addGap(29, 29, 29)
                        .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCenterLayout.createSequentialGroup()
                                .addComponent(rdNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdNu))
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnCenterLayout.createSequentialGroup()
                            .addComponent(lblMaSV)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnCenterLayout.createSequentialGroup()
                            .addComponent(lblTrangThai)
                            .addGap(18, 18, 18)
                            .addComponent(chkTrangThai))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCenterLayout.createSequentialGroup()
                            .addComponent(lblTen)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbLop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))
                    .addGroup(pnCenterLayout.createSequentialGroup()
                        .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgaySinh)
                            .addComponent(lbLop))
                        .addGap(21, 21, 21)
                        .addComponent(dtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(pnThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSV)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCenterLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbLop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCenterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNgaySinh)
                    .addComponent(dtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSdt)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai)
                    .addComponent(chkTrangThai))
                .addGap(33, 33, 33))
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnThaoTac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnMain.add(pnCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        // TODO add your handling code here:
        removeTxt();
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            int ma_sv = Integer.parseInt(txtMaSV.getText().trim());
            String ten = txtTen.getText().trim();
            String lop = cbLop.getSelectedItem().toString();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngay_sinh = dateFormat.format(dtNgaySinh.getDate());
            String gioi_tinh = "";
            if (rdNam.isSelected()) {
                gioi_tinh = rdNam.getText();
            } else {
                gioi_tinh = rdNu.getText();
            }
            String sdt = txtSdt.getText().trim();
            String dia_chi = txtDiaChi.getText().trim();
            boolean trang_thai = false;
            if (chkTrangThai.isSelected()) {
                trang_thai = true;
            }
            CauLenhSQL.insertRecords(ma_sv, ten, lop, ngay_sinh, gioi_tinh, sdt, dia_chi, trang_thai);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            showData();
        } catch (NumberFormatException e) {
            System.out.println("lỗi ma_sv");
        } catch (SQLException ex) {
            Logger.getLogger(DemoOnTap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinMouseClicked
        try {
            // TODO add your handling code here:
            int selectedRow = tblThongTin.getSelectedRow();

            displayDetails(selectedRow);

            if (evt.getClickCount() == 2) {
                int selectedCol = tblThongTin.getSelectedColumn();
                JOptionPane.showMessageDialog(null, defaultTableModel.getValueAt(selectedRow, selectedCol));
            }
        } catch (ParseException ex) {
            Logger.getLogger(DemoOnTap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblThongTinMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try {
            int ma_sv = Integer.parseInt(txtMaSV.getText().trim());
            String ten = txtTen.getText().trim();
            String lop = cbLop.getSelectedItem().toString();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngay_sinh = dateFormat.format(dtNgaySinh.getDate());
            String gioi_tinh = "";
            if (rdNam.isSelected()) {
                gioi_tinh = rdNam.getText();
            } else {
                gioi_tinh = rdNu.getText();
            }
            String sdt = txtSdt.getText().trim();
            String dia_chi = txtDiaChi.getText().trim();
            boolean trang_thai = false;
            if (chkTrangThai.isSelected()) {
                trang_thai = true;
            }
            CauLenhSQL.updateRecords(ma_sv, ten, lop, ngay_sinh, gioi_tinh, sdt, dia_chi, trang_thai);
            JOptionPane.showMessageDialog(null, "Sửa thành công");
            showData();
        } catch (NumberFormatException e) {
            System.out.println("lỗi ma_sv");
        } catch (SQLException ex) {
            Logger.getLogger(DemoOnTap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Muốn xóa hả?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(txtMaSV.getText().trim());
                CauLenhSQL.deleteRecords(id);
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                showData();
                removeTxt();
            } catch (SQLException ex) {
                Logger.getLogger(DemoOnTap.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DemoOnTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoOnTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoOnTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoOnTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DemoOnTap().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DemoOnTap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JComboBox<String> cbLop;
    private javax.swing.JCheckBox chkTrangThai;
    private com.toedter.calendar.JDateChooser dtNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPaneThongTin;
    private javax.swing.JLabel lbLop;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaSV;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSdt;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnBottom;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnThaoTac;
    private javax.swing.JPanel pnTop;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblThongTin;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void showData() throws SQLException {
        defaultTableModel = (DefaultTableModel) tblThongTin.getModel();
        tblThongTin.setDefaultEditor(Object.class, null);
        defaultTableModel.setRowCount(0);

        List<SinhVien> infos = CauLenhSQL.getInfo();
        for (SinhVien info : infos) {
            System.out.println(info.getMaSV() + info.getTen() + info.getLop() + info.getNgaySinh() + info.getGioiTinh() + info.getSdt() + info.getDiaChi() + info.isTrangThai());
            defaultTableModel.addRow(new Object[]{info.getMaSV(), info.getTen(), info.getLop(), info.getNgaySinh(), info.getGioiTinh(), info.getSdt(), info.getDiaChi(), info.isTrangThai()});
        }
    }

    private void displayDetails(int selectedRow) throws ParseException {
        TableModel model = tblThongTin.getModel();

        int ma_sv = (int) defaultTableModel.getValueAt(selectedRow, 0);
        txtMaSV.setText(String.valueOf(ma_sv));
        String ten = (String) defaultTableModel.getValueAt(selectedRow, 1);
        txtTen.setText(ten);
        String lop = (String) model.getValueAt(selectedRow, 2);
        switch (lop) {
            case "11DHPM":
                cbLop.setSelectedIndex(0);
                break;
            case "11DHMMT":
                cbLop.setSelectedIndex(1);
                break;
        }
        String ngay_sinh = (String) defaultTableModel.getValueAt(selectedRow, 3);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(ngay_sinh);
        dtNgaySinh.setDate(date);
        String gioi_tinh = (String) model.getValueAt(selectedRow, 4);
        if (gioi_tinh.equals("Nam")) {
            rdNam.setSelected(true);
            rdNu.setSelected(false);
        } else {
            rdNam.setSelected(false);
            rdNu.setSelected(true);
        }
        String sdt = (String) defaultTableModel.getValueAt(selectedRow, 5);
        txtSdt.setText(sdt);
        String dia_chi = (String) defaultTableModel.getValueAt(selectedRow, 6);
        txtDiaChi.setText(dia_chi);
        boolean trang_thai = (boolean) defaultTableModel.getValueAt(selectedRow, 7);
        if (trang_thai) {
            chkTrangThai.setSelected(trang_thai);
        } else {
            chkTrangThai.setSelected(trang_thai);
        }
    }

    private void removeTxt() {
        txtMaSV.setText("");
        txtTen.setText("");
        txtSdt.setText("");
        txtDiaChi.setText("");
        rdNam.setSelected(true);
        chkTrangThai.setSelected(true);
        dtNgaySinh.setCalendar(Calendar.getInstance());
        txtMaSV.requestFocus();
    }
}