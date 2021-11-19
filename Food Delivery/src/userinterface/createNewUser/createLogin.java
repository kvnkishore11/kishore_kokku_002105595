/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.createNewUser;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.MainJFrame;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Kishore KVN
 */
public class createLogin extends javax.swing.JPanel {

    /**
     * Creates new form createLogin
     */
    EcoSystem ecosystem;
    JPanel userProcessContainer;
    RestaurantDirectory rd;
    Restaurant restaurant;
    UserAccount ua;
    Customer customer;
    DeliveryMan delivery;
    CustomerDirectory cd;
    DeliveryManDirectory dd;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public createLogin(JPanel userProcessContainer,EcoSystem ecosystem) {
       this.ecosystem = ecosystem;
       this.userProcessContainer = userProcessContainer;
       
       if(ecosystem.getRestaurantDirectory() == null)
           ecosystem.setRestaurantDirectory(new RestaurantDirectory());
       if(ecosystem.getCustomerDirectory() == null)
           ecosystem.setCustomerDirectory(new CustomerDirectory());
       if(ecosystem.getDeliveryManDirectory() == null)
           ecosystem.setDeliveryManDirectory(new DeliveryManDirectory());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUName = new javax.swing.JTextField();
        txtPasswd = new javax.swing.JTextField();
        txtCnfrmPwd = new javax.swing.JTextField();
        roleCmb = new javax.swing.JComboBox<>();
        btnCreateUser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 76, -1));

        jLabel2.setText("Password:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 109, -1));

        jLabel3.setText("Role:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel4.setText("Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel5.setText("Confirm Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 103, -1));
        add(txtUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 103, -1));
        add(txtPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 103, -1));
        add(txtCnfrmPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 103, -1));

        roleCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurant Admin", "Customer", "Delivery Man" }));
        roleCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleCmbActionPerformed(evt);
            }
        });
        add(roleCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 180, -1));

        btnCreateUser.setText("create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });
        add(btnCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));

        jLabel6.setText("Create new user");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, -1));

        btnHome.setText("Back");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel7.setText("Restaurant name:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 98, -1));

        txtRestaurantName.setEditable(false);
        add(txtRestaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 129, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory usersList = ecosystem.getUserAccountDirectory();
        String role = (String) roleCmb.getSelectedItem();
        Employee employee = new Employee();
        employee.setName(txtName.getText());
        boolean userDoNotExists = true;
        ArrayList<UserAccount> users = usersList.getUserAccountList();
        for(UserAccount ua : users)
        {
            if(ua.getUsername().equals(txtUName.getText()))
                userDoNotExists = false;
        }
        
        if(userDoNotExists)
        {
        if(txtPasswd.getText().equals(txtCnfrmPwd.getText()))
        {
            switch (role) {
                case "Restaurant Admin":
                    usersList.createUserAccount(txtUName.getText(),txtPasswd.getText(), employee, new AdminRole());
                    ua = usersList.getUserAccount(txtUName.getText());
                     restaurant = new Restaurant(ua);
                    restaurant.setName(txtRestaurantName.getText());
                    rd = ecosystem.getRestaurantDirectory();
                    rd.addResto(restaurant);
                    ecosystem.setRestaurantDirectory(rd);
                    break;
                case "Customer":
                    usersList.createUserAccount(txtUName.getText(),txtPasswd.getText(), employee, new CustomerRole());
                    ua = usersList.getUserAccount(txtUName.getText());
                    customer = new Customer(ua);
                    cd = ecosystem.getCustomerDirectory();
                    cd.addCusto(customer);
                    break;
                case "Delivery Man":
                    usersList.createUserAccount(txtUName.getText(),txtPasswd.getText(), employee, new DeliverManRole());
                    ua = usersList.getUserAccount(txtUName.getText());
                    delivery = new DeliveryMan(ua);
                    dd = ecosystem.getDeliveryManDirectory();
                    dd.addDelivery(delivery);
                    break;
                default:
                    break;
            }
        
            JOptionPane.showMessageDialog(this,"User created");
            txtUName.setText("");
            txtPasswd.setText("");
            txtCnfrmPwd.setText("");
            txtName.setText("");
            txtRestaurantName.setText("");
        }
        
        else
            JOptionPane.showMessageDialog(this,"Password and confirm password does not match");
        }
        else
            JOptionPane.showMessageDialog(this,"UserName already exist");
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void roleCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleCmbActionPerformed
        // TODO add your handling code here:
        if(roleCmb.getSelectedItem().equals("Restaurant Admin"))
            txtRestaurantName.setEnabled(true);
            txtRestaurantName.setEditable(true);
    }//GEN-LAST:event_roleCmbActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"Sysadmin");
        
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> roleCmb;
    private javax.swing.JTextField txtCnfrmPwd;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPasswd;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtUName;
    // End of variables declaration//GEN-END:variables
}
