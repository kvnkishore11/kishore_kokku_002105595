
package ui.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ManageRestaurantInfoJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Restaurant restaurant;

    public ManageRestaurantInfoJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.restaurant = restaurant;
        populateInfo(restaurant);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameJLabel = new javax.swing.JLabel();
        PhoneNumberJTxtField = new javax.swing.JTextField();
        PasswordJLabel = new javax.swing.JLabel();
        PhoneNumberJLabel = new javax.swing.JLabel();
        NameJTxtField = new javax.swing.JTextField();
        NameJLabel = new javax.swing.JLabel();
        UsernameJTxtField = new javax.swing.JTextField();
        PasswordJTxtField = new javax.swing.JTextField();
        AddressJTxtField = new javax.swing.JTextField();
        AddressJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));

        UsernameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameJLabel.setText("Username:");

        PhoneNumberJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberJTxtFieldActionPerformed(evt);
            }
        });

        PasswordJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordJLabel.setText("Password:");

        PhoneNumberJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberJLabel.setText("Phone number:");

        NameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameJLabel.setText("Restaurant Name:");

        PasswordJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordJTxtFieldActionPerformed(evt);
            }
        });

        AddressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressJLabel.setText("Address:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Restaurant Information");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameJLabel)
                    .addComponent(UsernameJLabel)
                    .addComponent(PasswordJLabel)
                    .addComponent(PhoneNumberJLabel)
                    .addComponent(AddressJLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PasswordJTxtField)
                    .addComponent(UsernameJTxtField)
                    .addComponent(NameJTxtField)
                    .addComponent(AddressJTxtField)
                    .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton3)
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressJLabel)
                    .addComponent(AddressJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberJLabel)
                    .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameJLabel)
                    .addComponent(UsernameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordJLabel))
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberJTxtFieldActionPerformed

    private void PasswordJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordJTxtFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressJLabel;
    private javax.swing.JTextField AddressJTxtField;
    private javax.swing.JLabel NameJLabel;
    private javax.swing.JTextField NameJTxtField;
    private javax.swing.JLabel PasswordJLabel;
    private javax.swing.JTextField PasswordJTxtField;
    private javax.swing.JLabel PhoneNumberJLabel;
    private javax.swing.JTextField PhoneNumberJTxtField;
    private javax.swing.JLabel UsernameJLabel;
    private javax.swing.JTextField UsernameJTxtField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void populateInfo(Restaurant restaurant) {

        NameJTxtField.setText(restaurant.getName());
        NameJTxtField.setEditable(false);
        AddressJTxtField.setText(restaurant.getAddress());
        AddressJTxtField.setEditable(false);
        PhoneNumberJTxtField.setText(restaurant.getPhoneNumber());
        PhoneNumberJTxtField.setEditable(false);
        UsernameJTxtField.setText(restaurant.getUsername());
        UsernameJTxtField.setEditable(false);
        PasswordJTxtField.setText(restaurant.getPassword());
        PasswordJTxtField.setEditable(false);
    }
}
