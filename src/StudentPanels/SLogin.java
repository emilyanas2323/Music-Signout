package StudentPanels;

import static StudentPanels.Database.connectDB;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Emily Anas
 */
public class SLogin extends javax.swing.JPanel {

    JPanel home;
    private static String fNam, lNam, id;

    /**
     * Creates new form SLogin
     */
    public SLogin() {
        initComponents();
    }

    public SLogin(JPanel p) {
        initComponents();
        home = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        tfBarcode = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHeader.setText("Please scan student card to log in");

        tfBarcode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBarcodeActionPerformed(evt);
            }
        });

        btnSignIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSignIn.setText("Sign in");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(lblHeader)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tfBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignIn)
                .addGap(437, 437, 437))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader)
                .addGap(230, 230, 230)
                .addComponent(tfBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSignIn)
                .addContainerGap(386, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        System.out.println("CLICKED");
        boolean exists = false;
        String key = "";
        //check to make sure barcode is correct length
        if (tfBarcode.getText().length() == 10) {
            key = tfBarcode.getText().substring(1, 10);
        } else {
            JOptionPane.showMessageDialog(this, "Sorry, this was not the correct length, please try scanning the barcode on your student card", "Inane error", JOptionPane.ERROR_MESSAGE);
        }
        Connection c = Database.connectDB();
        if (c == null) {
            System.exit(-1);
        }
        System.out.println("Connected!");
        Statement stmt;
        ResultSet rs;
        //check that student number exists in system
        try {
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next() == true && exists == false) {
                id = rs.getString("id");
                System.out.println(id + "," + key);
                if (key.equals(id)) {
                    exists = true;
                }
            }
            //if the student exists in DB
            if (exists == true) {
                //prints out student info
                System.out.println("student exists in DB");
                SLogin.fNam = rs.getString("fname");
                SLogin.lNam = rs.getString("lname");
                System.out.println(fNam + " " + lNam);
                tfBarcode.setText("");
                CardLayout cl = (CardLayout) home.getLayout();
                cl.show(home, "menu");
                //JOptionPane.showMessageDialog(null,"Welcome "+s.toString()+"!");
                //JOptionPane.showMessageDialog(null,"Welcome "+lNam+", "+fNam+"!");
            } //if student doesn't exist, gives user message to enter valid student number
            else {
                JOptionPane.showMessageDialog(null, "Please scan a valid student ID.");
                tfBarcode.setText("");
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Something went wrong and you cannot sign in", "Inane error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void tfBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBarcodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField tfBarcode;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the fNam
     */
    public static String getfNam() {
        return fNam;
    }

    /**
     * @return the lNam
     */
    public static String getlNam() {
        return lNam;
    }

    public static String getid() {
        return id;
    }
}
