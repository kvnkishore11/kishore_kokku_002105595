/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Kishore KVN
 */
public class RestaurantInfo extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantInfo
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount ua;
    Restaurant resto;
    public RestaurantInfo(JPanel userProcessContainer,Restaurant resto) {
        this.userProcessContainer = userProcessContainer;
        this.resto = resto;
        initComponents();
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserResto = new javax.swing.JTextField();
        txtPwdResto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddResto = new javax.swing.JTextField();
        txtCityResto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Restaurant info");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 196, 120, 20));

        jLabel2.setText("username:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 239, 82, -1));

        jLabel3.setText("password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, 51, -1));

        txtUserResto.setEditable(false);
        txtUserResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserRestoActionPerformed(evt);
            }
        });
        add(txtUserResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 92, -1));

        txtPwdResto.setEditable(false);
        add(txtPwdResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 92, -1));

        jLabel5.setText("Address:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 317, -1, -1));

        txtAddResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddRestoActionPerformed(evt);
            }
        });
        add(txtAddResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 92, -1));
        add(txtCityResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 92, -1));

        jLabel6.setText("City:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 351, 51, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1225, 31, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserRestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserRestoActionPerformed

    private void txtAddRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddRestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddRestoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        resto.setCity(txtCityResto.getText());
        resto.setAddress(txtAddResto.getText());
        populateData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"RestaurantAdmin");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddResto;
    private javax.swing.JTextField txtCityResto;
    private javax.swing.JTextField txtPwdResto;
    private javax.swing.JTextField txtUserResto;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
       txtAddResto.setText(resto.getAddress());
       txtCityResto.setText(resto.getCity());
       txtUserResto.setText(resto.getUserAccount().getUsername());
       txtPwdResto.setText(resto.getUserAccount().getPassword());
    }
}