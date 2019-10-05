/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suong
 */
public class DemoBookSupplies extends javax.swing.JFrame {

    /**
     * Creates new form DemoBookSupplies
     */
    public DemoBookSupplies() throws SQLException {
        initComponents();
//        tblThongTin.getColumnModel().getColumn(0).setPreferredWidth(300);
//        tblThongTin.getColumnModel().getColumn(1).setPreferredWidth(400);
//        tblThongTin.getColumnModel().getColumn(2).setPreferredWidth(300);
//        tblThongTin.getColumnModel().getColumn(3).setPreferredWidth(300);
//        tblThongTin.getColumnModel().getColumn(4).setPreferredWidth(300);
//        tblThongTin.getColumnModel().getColumn(6).setPreferredWidth(300);
//        tblThongTin.getColumnModel().getColumn(7).setPreferredWidth(300);
//        tblThongTin.getColumnModel().getColumn(8).setPreferredWidth(300);
//        tblThongTin.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnBottom = new javax.swing.JPanel();
        scTable = new javax.swing.JScrollPane();
        tblThongTin = new javax.swing.JTable();
        pnCenter = new javax.swing.JPanel();
        pnNhapThongTin = new javax.swing.JPanel();
        lblSupplierID = new javax.swing.JLabel();
        txtSupplierID = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        lblSupplierType = new javax.swing.JLabel();
        ckbBooks = new javax.swing.JCheckBox();
        ckbNewsPapers = new javax.swing.JCheckBox();
        ckbJournalsandMagazines = new javax.swing.JCheckBox();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblRemarks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        pnThaoTac = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo Books Suppliers");

        pnMain.setLayout(new java.awt.BorderLayout());

        pnTop.setBackground(new java.awt.Color(0, 51, 51));
        pnTop.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Books Supplies");
        pnTop.add(jLabel1);

        pnMain.add(pnTop, java.awt.BorderLayout.PAGE_START);

        scTable.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblThongTin.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        tblThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Supplier ID", "Supplier Name", "Books", "News Papers", "Journals and Magazines", "Address", "Contact No", "Email ID", "Remarks"
            }
        ));
        scTable.setViewportView(tblThongTin);

        javax.swing.GroupLayout pnBottomLayout = new javax.swing.GroupLayout(pnBottom);
        pnBottom.setLayout(pnBottomLayout);
        pnBottomLayout.setHorizontalGroup(
            pnBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBottomLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(scTable, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        pnBottomLayout.setVerticalGroup(
            pnBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBottomLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scTable, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnMain.add(pnBottom, java.awt.BorderLayout.PAGE_END);

        pnNhapThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSupplierID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierID.setText("Supplier ID");

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierName.setText("Supplier Name");

        lblSupplierType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblSupplierType.setText("Supplier Type");

        ckbBooks.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckbBooks.setText("Books");

        ckbNewsPapers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckbNewsPapers.setText("News Papers");

        ckbJournalsandMagazines.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckbJournalsandMagazines.setText("Journals and Magazines");

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAddress.setText("Address");

        lblContactNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblContactNo.setText("Contact No");

        lblEmailID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblEmailID.setText("Email ID");

        lblRemarks.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblRemarks.setText("Remarks");

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRemarks);

        javax.swing.GroupLayout pnNhapThongTinLayout = new javax.swing.GroupLayout(pnNhapThongTin);
        pnNhapThongTin.setLayout(pnNhapThongTinLayout);
        pnNhapThongTinLayout.setHorizontalGroup(
            pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                        .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplierName)
                            .addComponent(lblSupplierID))
                        .addGap(39, 39, 39)
                        .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                                .addComponent(ckbBooks)
                                .addGap(18, 18, 18)
                                .addComponent(ckbNewsPapers)))
                        .addGap(18, 18, 18)
                        .addComponent(ckbJournalsandMagazines))
                    .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                        .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplierType)
                            .addComponent(lblAddress)
                            .addComponent(lblContactNo)
                            .addComponent(lblEmailID)
                            .addComponent(lblRemarks))
                        .addGap(44, 44, 44)
                        .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress)
                            .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(11, 11, 11))
        );
        pnNhapThongTinLayout.setVerticalGroup(
            pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierID)
                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierName)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierType)
                    .addComponent(ckbBooks)
                    .addComponent(ckbNewsPapers)
                    .addComponent(ckbJournalsandMagazines))
                .addGap(11, 11, 11)
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailID)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnNhapThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                        .addComponent(lblRemarks)
                        .addGap(89, 89, 89))
                    .addGroup(pnNhapThongTinLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pnThaoTac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNew.setBackground(new java.awt.Color(0, 51, 0));
        btnNew.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setMnemonic('N');
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        pnThaoTac.add(btnNew);

        btnSave.setBackground(new java.awt.Color(255, 51, 0));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setMnemonic('S');
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnThaoTac.add(btnSave);

        btnDelete.setBackground(new java.awt.Color(0, 51, 51));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setMnemonic('D');
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnThaoTac.add(btnDelete);

        btnUpdate.setBackground(new java.awt.Color(153, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setMnemonic('U');
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnThaoTac.add(btnUpdate);

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCenterLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnNhapThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnThaoTac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnNhapThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
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
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtSupplierID.setText("");
        txtSupplierName.setText("");
        ckbBooks.setSelected(false);
        ckbJournalsandMagazines.setSelected(false);
        ckbNewsPapers.setSelected(false);
        txtAddress.setText("");
        txtContactNo.setText("");
        txtEmailID.setText("");
        txtRemarks.setText("");
        txtSupplierID.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
//            String type = isCheckbox();
            boolean books = false;
            books = ckbBooks.isSelected();
            boolean newspapers = false;
            newspapers = ckbNewsPapers.isSelected();
            boolean journalsandmagazines = false;
            journalsandmagazines = ckbJournalsandMagazines.isSelected();
            String remarks = txtRemarks.getText().trim();
            String email = txtEmailID.getText().trim();
            String contact = txtContactNo.getText().trim();
            String address = txtAddress.getText().trim();
            String name = txtSupplierName.getText().trim();
            int id = Integer.parseInt(txtSupplierID.getText().trim());
            QueryPrepareStatement.insertRecords(id, name, books, newspapers, journalsandmagazines, address, contact, email, remarks);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(DemoBookSupplies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            System.out.println("lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
//            String type = isCheckbox();
            boolean books = false;
            books = ckbBooks.isSelected();
            boolean newspapers = false;
            newspapers = ckbNewsPapers.isSelected();
            boolean journalsandmagazines = false;
            journalsandmagazines = ckbJournalsandMagazines.isSelected();
            String remarks = txtRemarks.getText().trim();
            String email = txtEmailID.getText().trim();
            String contact = txtContactNo.getText().trim();
            String address = txtAddress.getText().trim();
            String name = txtSupplierName.getText().trim();
            int id = Integer.parseInt(txtSupplierID.getText().trim());
            QueryPrepareStatement.updateRecords(id, name, books, newspapers, journalsandmagazines, address, contact, email, remarks);
            JOptionPane.showMessageDialog(null, "Cập nhật thành công");
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(DemoBookSupplies.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            System.out.println("lỗi");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int id = Integer.parseInt(txtSupplierID.getText().trim());
            QueryPrepareStatement.deleteRecords(id);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(DemoBookSupplies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DemoBookSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoBookSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoBookSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoBookSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DemoBookSupplies().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DemoBookSupplies.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox ckbBooks;
    private javax.swing.JCheckBox ckbJournalsandMagazines;
    private javax.swing.JCheckBox ckbNewsPapers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblSupplierID;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblSupplierType;
    private javax.swing.JPanel pnBottom;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnNhapThongTin;
    private javax.swing.JPanel pnThaoTac;
    private javax.swing.JPanel pnTop;
    private javax.swing.JScrollPane scTable;
    private javax.swing.JTable tblThongTin;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables

    public String isCheckbox() {
        String str = "";
        JCheckBox[] arrCkb = new JCheckBox[]{ckbBooks, ckbNewsPapers, ckbJournalsandMagazines};

        for (JCheckBox arrCkb1 : arrCkb) {
            if (arrCkb1.isSelected()) {
                str = str + arrCkb1.getText().trim() + ", ";
            }
        }

        return str;
    }

    private void loadData() throws SQLException {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.setRowCount(0);
        tblThongTin.setModel(defaultTableModel);
        defaultTableModel.addColumn("Supplier ID");
        defaultTableModel.addColumn("Supplier ID");
        defaultTableModel.addColumn("Books");
        defaultTableModel.addColumn("News Papers");
        defaultTableModel.addColumn("Journals and Magazines");
        defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("Contact No");
        defaultTableModel.addColumn("EmailID");
        defaultTableModel.addColumn("Remarks");

        ArrayList<ThongTin> infos = QueryPrepareStatement.getInfo();
        Object rowData[] = new Object[7];
        for (ThongTin info : infos) {
            System.out.println(info.getId() + info.getName() + info.isBooks() + info.getAddress() + info.getContact() + info.getEmail() + info.getRemarks());
            defaultTableModel.addRow(new Object[]{info.getId(), info.getName(), info.isBooks(), info.isNewspapers(), info.isJournalsandmagazines(), info.getAddress(), info.getContact(), info.getEmail(), info.getRemarks()});
//            rowData[0] = info.getId();
//            rowData[1] = info.getName();
//            rowData[2] = String.valueOf(info.isBooks());
//            rowData[3] = String.valueOf(info.isNewspapers());
//            rowData[4] = String.valueOf(info.isJournalsandmagazines());
//            rowData[5] = info.getAddress();
//            rowData[6] = info.getContact();
//            rowData[7] = info.getEmail();
//            rowData[8] = info.getRemarks();
//            defaultTableModel.addRow(rowData);
        }
    }
}
