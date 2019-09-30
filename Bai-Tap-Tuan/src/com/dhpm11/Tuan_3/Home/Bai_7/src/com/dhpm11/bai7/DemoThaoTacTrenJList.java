/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.bai7;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Suong
 */
public class DemoThaoTacTrenJList extends javax.swing.JFrame {
    
    DefaultListModel listModel = new DefaultListModel<>();

    /**
     * Creates new form DemoThaoTacTrenJList
     */
    public DemoThaoTacTrenJList() {
        initComponents();
        addItem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnDong = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnEven = new javax.swing.JButton();
        btnOdd = new javax.swing.JButton();
        btnPrime = new javax.swing.JButton();
        btnSpace = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnEnter = new javax.swing.JButton();
        txtEnter = new javax.swing.JTextField();
        ckbSelectMinus = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo JList");
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Thao tác trên JList - Checkbox");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        btnDong.setText("Đóng chương trình");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });
        jPanel3.add(btnDong);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Chọn tác vụ"));

        btnEven.setText("Tô đen số chẵn");
        btnEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvenActionPerformed(evt);
            }
        });

        btnOdd.setText("Tô đen số lẻ");
        btnOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOddActionPerformed(evt);
            }
        });

        btnPrime.setText("Tô đen số nguyên tố");
        btnPrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeActionPerformed(evt);
            }
        });

        btnSpace.setText("Bỏ tô đen");
        btnSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpaceActionPerformed(evt);
            }
        });

        btnRemove.setText("Xóa các giá trị đang tô đen");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSum.setText("Tổng giá trị trong JList");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEven)
                    .addComponent(btnOdd)
                    .addComponent(btnPrime)
                    .addComponent(btnSpace)
                    .addComponent(btnRemove)
                    .addComponent(btnSum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSpace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Nhập thông tin:"));

        btnEnter.setText("Nhập");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        txtEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterActionPerformed(evt);
            }
        });

        ckbSelectMinus.setText("Cho nhập số âm");

        jScrollPane1.setViewportView(jList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbSelectMinus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnter)
                    .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbSelectMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterActionPerformed
        addItem();
    }//GEN-LAST:event_txtEnterActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        addItem();
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Đóng", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvenActionPerformed
        selectNum(true);
    }//GEN-LAST:event_btnEvenActionPerformed

    private void btnOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOddActionPerformed
        selectNum(false);
    }//GEN-LAST:event_btnOddActionPerformed

    private void btnPrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeActionPerformed
        ArrayList<Integer> selectPrime = new ArrayList<>();
        int[] mSelected;

        for (int i = 0; i < listModel.getSize(); i++) {
            if (isPrimeNumber((int) listModel.get(i))) {
                selectPrime.add(i);
            }
        }

        mSelected = convertIntegers(selectPrime);
        jList.setSelectedIndices(mSelected);
    }//GEN-LAST:event_btnPrimeActionPerformed

    private void btnSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpaceActionPerformed
        jList.clearSelection();
    }//GEN-LAST:event_btnSpaceActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (jList.getSelectedIndices().length > 0) {
            int[] selectedIndices = jList.getSelectedIndices();
            for (int i = selectedIndices.length - 1; i >= 0; i--) {
                listModel.removeElementAt(selectedIndices[i]);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        int sum = 0;
        for (int i = 0; i < listModel.getSize(); i++) {
            sum += (int) listModel.get(i);
        }

        JOptionPane.showMessageDialog(null, "Tổng = " + sum);
    }//GEN-LAST:event_btnSumActionPerformed

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
            java.util.logging.Logger.getLogger(DemoThaoTacTrenJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoThaoTacTrenJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoThaoTacTrenJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoThaoTacTrenJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoThaoTacTrenJList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEven;
    private javax.swing.JButton btnOdd;
    private javax.swing.JButton btnPrime;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSpace;
    private javax.swing.JButton btnSum;
    private javax.swing.JCheckBox ckbSelectMinus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEnter;
    // End of variables declaration//GEN-END:variables

    private void addItem() {
//        DefaultListModel listModel = new DefaultListModel<>();
        try {
            String text = txtEnter.getText().trim();
            if (!text.equals("")) {
                int num = Integer.parseInt(text);
                if (ckbSelectMinus.isSelected()) {
                    listModel.addElement(num);
                } else {
                    if (num < 0) {
                        JOptionPane.showMessageDialog(null, "Bạn chưa cho phép nhập số âm kìa @@");
                        txtEnter.requestFocus();
                        txtEnter.selectAll();
                    } else {
                        listModel.addElement(num);
                    }
                }
            }
            jList.setModel(listModel);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ!");
            txtEnter.selectAll();
            txtEnter.requestFocus();
        }
    }

    private void selectNum(boolean op) {
        ArrayList<Integer> selectEven = new ArrayList<>();
        ArrayList<Integer> selectOdd = new ArrayList<>();
        int[] mSelected;

        for (int i = 0; i < listModel.getSize(); i++) {
            if (((int) listModel.get(i) % 2) == 0) {
                selectEven.add(i);
            } else {
                selectOdd.add(i);
            }
        }

        if (op) {
            mSelected = convertIntegers(selectEven);
            jList.setSelectedIndices(mSelected);
        } else {
            mSelected = convertIntegers(selectOdd);
            jList.setSelectedIndices(mSelected);
        }
    }

    private int[] convertIntegers(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    private boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
