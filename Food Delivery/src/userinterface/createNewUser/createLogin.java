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

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel3.setText("Role:");

        jLabel4.setText("Name:");

        jLabel5.setText("Confirm Password:");

        roleCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurant Admin", "Customer", "Delivery Man" }));
        roleCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleCmbActionPerformed(evt);
            }
        });

        btnCreateUser.setText("create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        jLabel6.setText("Create new user");

        btnHome.setText("Back");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel7.setText("Restaurant name:");

        txtRestaurantName.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnCreateUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCnfrmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleCmb, 0, 129, Short.MAX_VALUE)
                            .addComponent(txtRestaurantName))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnHome))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCnfrmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnCreateUser)
                .addContainerGap(91, Short.MAX_VALUE))
        );
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
