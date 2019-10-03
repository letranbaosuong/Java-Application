/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostudentmanagerment;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Suong
 */
public class DemoStudentManagerment extends javax.swing.JFrame {

    /**
     * Creates new form DemoStudentManagerment
     */
    public DemoStudentManagerment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnRoot = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        lblKnowdge = new javax.swing.JLabel();
        chkJava = new javax.swing.JCheckBox();
        chkPython = new javax.swing.JCheckBox();
        lblSubject = new javax.swing.JLabel();
        cboSubject = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo Student Management");
        setResizable(false);

        lblName.setText("Name");

        lblAddress.setText("Address");

        lblGender.setText("Gender");

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        lblKnowdge.setText("Knowdge");

        chkJava.setText("Java");

        chkPython.setText("Python");

        lblSubject.setText("Subject");

        cboSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Management", "Computer Sciences", "Education", "Bussiness" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblAddress)
                    .addComponent(lblKnowdge)
                    .addComponent(lblGender)
                    .addComponent(lblSubject))
                .addGap(26, 26, 26)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(rdMale)
                                .addGap(45, 45, 45)
                                .addComponent(rdFemale))
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName)
                                .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addComponent(cboSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(chkJava)
                        .addGap(43, 43, 43)
                        .addComponent(chkPython)
                        .addGap(76, 76, 76))))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(66, 66, 66))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addGap(15, 15, 15)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKnowdge)
                    .addComponent(chkJava)
                    .addComponent(chkPython))
                .addGap(15, 15, 15)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubject)
                    .addComponent(cboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        
        String url, user, password, sql = "", strName = "", strAddress = "", strGender = "", strKnowledge = "", strSubject = "";
        int row=0;
//        url = "jdbc:mysql://localhost:3306/dbemployee";
//        user = "root";
//        password = "";

        strName = txtName.getText();
        strAddress = txtAddress.getText();
        strSubject = cboSubject.getSelectedItem().toString();

        if (rdMale.isSelected()) {
            strGender = "Nam";
        } else {
            strGender = rdFemale.getText();
        }

        if (chkJava.isSelected()) {
            strKnowledge = "Java";
        } else if (chkPython.isSelected()) {
            strKnowledge = "Python";
        } else {
            strKnowledge = "Java + Python";
        }

        PreparedStatement preStmt;
//        try {
//            sql = "INSERT INTO `employee` (`name`, `address`, `gender`, `knowlege`, `subject`) VALUES (?, ?, ?, ?, ?)";
//
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(DemoStudentManagerment.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            conn = (Connection) DriverManager.getConnection(url, user, password);
//            preStmt = conn.prepareStatement(sql);
//            preStmt.setString(1, strName);
//            preStmt.setString(2, strAddress);
//            preStmt.setString(3, strGender);
//            preStmt.setString(4, strKnowledge);
//            preStmt.setString(5, strSubject);
//            row = preStmt.executeUpdate();
//            System.out.print("Số dong inserted: " + row);
//
//            conn.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(DemoStudentManagerment.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        try {
            sql = "INSERT INTO `employee` (`name`, `address`, `gender`, `knowlege`, `subject`) VALUES (?, ?, ?, ?, ?)";
            Class.forName("com.mysql.jdbc.Driver");
//            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee", "root", "");
            conn = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DBemployee;integratedSecurity=true;", "sa", "suong123");
            System.out.println("kết nối r");
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, strName);
            preStmt.setString(2, strAddress);
            preStmt.setString(3, strGender);
            preStmt.setString(4, strKnowledge);
            preStmt.setString(5, strSubject);
            row = preStmt.executeUpdate();
            System.out.print("Số dong inserted: " + row);

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }


//        Connection conn = null;
//        String url = "", user = "", password = "";
//        url = "jdbc:jtds:sqlserver://localhost:1433/DBEmployee";
//        String sql = "";
//        user = "sa";
//        password = "suong123";
//        String strKnowLedge = "";
//        String strAddress = "";
//        String strName = "";
//        String strSubject = "";
//        String strGender = "";
//        PreparedStatement preStmt;
//        strName = txtName.getText();
//        strAddress = txtAddress.getText();
//        if (rdMale.isSelected()) {
//            strGender = "Male";
//
//        } else if (rdFemale.isSelected()) {
//            strGender = "Female";
//        }
//
//        if (chkJava.isSelected()) {
//            strKnowLedge = "Java";
//
//        } else if (chkPython.isSelected()) {
//            strKnowLedge = "Python";
//        } else {
//            strKnowLedge = "Java , Python";
//        }
//        strSubject = cboSubject.getSelectedItem().toString();
//        int row = 0;
//        try {
//            sql = "insert into" + "Employee values(?,?,?,?,?)";
//            conn = DriverManager.getConnection(url, user, password);
//            preStmt = conn.prepareStatement(sql);
//            preStmt.setString(1, strName);
//            preStmt.setString(2, strAddress);
//            preStmt.setString(3, strGender);
//            preStmt.setString(4, strKnowLedge);
//            preStmt.setString(5, strSubject);
//            row = preStmt.executeUpdate();
//            System.out.println("so dofg inserted:" + row);
//            conn.close();
//        } catch (SQLException ex) {
//            // Logger.getLogger(AppTest.class.getName()).log(Level.SEVERE,null,ex);
//        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(DemoStudentManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoStudentManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoStudentManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoStudentManagerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoStudentManagerment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboSubject;
    private javax.swing.JCheckBox chkJava;
    private javax.swing.JCheckBox chkPython;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblKnowdge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
