package TeacherPanels;

import java.awt.CardLayout;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 072584980
 */
public class TMenu extends javax.swing.JPanel {

    JPanel home;

    /**
     * Creates new form TMenu
     */
    public TMenu() {
        initComponents();
    }

    public TMenu(JPanel p) {
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

        btnAddItem = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();
        cbHistory = new javax.swing.JComboBox();
        lblHello = new javax.swing.JLabel();
        btnAddStudents = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 750));

        btnAddItem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnRemoveItem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRemoveItem.setText("Decommission Item");
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });

        btnViewHistory.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnViewHistory.setText("View Signout History");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        cbHistory.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbHistory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "By Most Recent", "By Student", "By Item" }));

        lblHello.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHello.setText("Hello Teacher! What would you like to do?");

        btnAddStudents.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddStudents.setText("Add Students");
        btnAddStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentsActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblHello))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(btnAddItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(btnRemoveItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnViewHistory)
                        .addGap(18, 18, 18)
                        .addComponent(cbHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(btnAddStudents))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHello, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(btnAddItem)
                .addGap(73, 73, 73)
                .addComponent(btnRemoveItem)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewHistory)
                    .addComponent(cbHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(btnAddStudents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //bring them where they want to go
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "login");
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "addItem");
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "removeItem");
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        //check combo box to see where they want to go and bring them there
        if (cbHistory.getSelectedItem().equals("By Most Recent")) {
            CardLayout cl = (CardLayout) home.getLayout();
            cl.show(home, "dateHist");
        } else if (cbHistory.getSelectedItem().equals("By Student")) {
            CardLayout cl = (CardLayout) home.getLayout();
            cl.show(home, "pickStud");
        } else if (cbHistory.getSelectedItem().equals("By Item")) {
            CardLayout cl = (CardLayout) home.getLayout();
            cl.show(home, "pickItem");
        }
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void btnAddStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentsActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "addStuds");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddStudentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddStudents;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JComboBox cbHistory;
    private javax.swing.JLabel lblHello;
    // End of variables declaration//GEN-END:variables
}