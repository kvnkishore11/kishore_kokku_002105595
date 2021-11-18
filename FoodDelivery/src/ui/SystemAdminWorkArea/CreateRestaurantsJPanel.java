
package ui.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateRestaurantsJPanel extends javax.swing.JPanel {

   
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public CreateRestaurantsJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasswordJLabel = new javax.swing.JLabel();
        PhoneNumberJLabel = new javax.swing.JLabel();
        NameJTxtField = new javax.swing.JTextField();
        NameJLabel = new javax.swing.JLabel();
        UsernameJTxtField = new javax.swing.JTextField();
        PasswordJTxtField = new javax.swing.JTextField();
        AddressJTxtField = new javax.swing.JTextField();
        AddressJLabel = new javax.swing.JLabel();
        UsernameJLabel = new javax.swing.JLabel();
        PhoneNumberJTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));

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

        UsernameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameJLabel.setText("Username:");

        PhoneNumberJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberJTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Restaurant");

        addJButton.setBackground(new java.awt.Color(255, 59, 63));
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(addJButton)))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
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
                .addGap(32, 32, 32)
                .addComponent(addJButton)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordJTxtFieldActionPerformed

    private void PhoneNumberJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberJTxtFieldActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:

        if (NameJTxtField.getText().isEmpty()
                || PasswordJTxtField.getText().isEmpty()
                || UsernameJTxtField.getText().isEmpty()
                || AddressJTxtField.getText().isEmpty()
                || PhoneNumberJTxtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide all the details of the Customer");
            return;
        } else {
            if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(UsernameJTxtField.getText())) {
                Restaurant restaurant = new Restaurant(NameJTxtField.getText(), AddressJTxtField.getText(), PhoneNumberJTxtField.getText(), UsernameJTxtField.getText(), PasswordJTxtField.getText(), new Menu());
                UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(UsernameJTxtField.getText(), PasswordJTxtField.getText(), new AdminRole());

                System.out.println(ecosystem.getUserAccountDirectory());
                ecosystem.getUserAccountDirectory().addNewUser(ua);
                ecosystem.getRestaurantDirectory().addRestaurant(restaurant);

                JOptionPane.showMessageDialog(null, "Restaurant has been added");
                NameJTxtField.setText("");
                PasswordJTxtField.setText("");
                UsernameJTxtField.setText("");
                AddressJTxtField.setText("");
                PhoneNumberJTxtField.setText("");
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);

                Component[] comps = this.userProcessContainer.getComponents();
                for (Component comp : comps) {
                    if (comp instanceof SystemAdminWorkAreaJPanel) {
                        SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = (SystemAdminWorkAreaJPanel) comp;
                        systemAdminWorkAreaJPanel.populateTree();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "username is not unique");
            }
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof SystemAdminWorkAreaJPanel) {
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = (SystemAdminWorkAreaJPanel) comp;
                systemAdminWorkAreaJPanel.populateTree();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton addJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
