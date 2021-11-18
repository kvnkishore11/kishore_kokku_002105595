
package ui.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateDeliverymenJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public CreateDeliverymenJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NameJLabel = new javax.swing.JLabel();
        UsernameJTxtField = new javax.swing.JTextField();
        PasswordJTxtField = new javax.swing.JTextField();
        AddressJTxtField = new javax.swing.JTextField();
        AddressJLabel = new javax.swing.JLabel();
        UsernameJLabel = new javax.swing.JLabel();
        PhoneNumberJTxtField = new javax.swing.JTextField();
        PasswordJLabel = new javax.swing.JLabel();
        PhoneNumberJLabel = new javax.swing.JLabel();
        NameJTxtField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Delivery Associate");

        NameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameJLabel.setText("Delivery Man Name:");

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

        PasswordJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordJLabel.setText("Password:");

        PhoneNumberJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberJLabel.setText("Phone number:");

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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
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
                        .addGap(81, 81, 81)
                        .addComponent(addJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressJLabel)
                    .addComponent(AddressJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberJLabel)
                    .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameJLabel)
                    .addComponent(UsernameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordJLabel))
                .addGap(29, 29, 29)
                .addComponent(addJButton)
                .addContainerGap(201, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "Please provide all the details of the Delivery Man");
            return;
        } else {

            if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(UsernameJTxtField.getText())) {
                DeliveryMan deli = new DeliveryMan(NameJTxtField.getText(), AddressJTxtField.getText(), PhoneNumberJTxtField.getText(), UsernameJTxtField.getText(), PasswordJTxtField.getText());
                UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(UsernameJTxtField.getText(), PasswordJTxtField.getText(), new DeliverManRole());

                System.out.println(ecosystem.getUserAccountDirectory());
                ecosystem.getUserAccountDirectory().addNewUser(ua);
//              System.out.println(ecosystem.getCustomerDirectory());
                ecosystem.getDeliveryManDirectory().addDeliveryMan(deli);
                
                
                NameJTxtField.setText("");
                PasswordJTxtField.setText("");
                UsernameJTxtField.setText("");
                AddressJTxtField.setText("");
                PhoneNumberJTxtField.setText("");
                JOptionPane.showMessageDialog(null, "Delivery Associate added");
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
                JOptionPane.showMessageDialog(null, "Username is not unique");
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
