
package ui.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateCustomersJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;

    
    public CreateCustomersJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddressJLabel = new javax.swing.JLabel();
        PhoneNumberJLabel = new javax.swing.JLabel();
        AddressJTxtField = new javax.swing.JTextField();
        PhoneNumberJTxtField = new javax.swing.JTextField();
        CustomerNameJLabel = new javax.swing.JLabel();
        UsernameJLabel = new javax.swing.JLabel();
        PasswordJLabel = new javax.swing.JLabel();
        CustomerNameJTxtField = new javax.swing.JTextField();
        UsernameJTxtField = new javax.swing.JTextField();
        PasswordJTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EmailJTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(48, 65, 93));

        AddressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressJLabel.setText("Address:");

        PhoneNumberJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberJLabel.setText("Phone number:");

        PhoneNumberJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberJTxtFieldActionPerformed(evt);
            }
        });

        CustomerNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        CustomerNameJLabel.setText("Customer Name:");

        UsernameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameJLabel.setText("Username:");

        PasswordJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordJLabel.setText("Password:");

        PasswordJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordJTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Customer");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addJButton.setBackground(new java.awt.Color(255, 59, 63));
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");

        EmailJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailJTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsernameJLabel)
                            .addComponent(PasswordJLabel)
                            .addComponent(jLabel2)
                            .addComponent(PhoneNumberJLabel)
                            .addComponent(AddressJLabel)
                            .addComponent(CustomerNameJLabel))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordJTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(UsernameJTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(EmailJTxtField)
                            .addComponent(PhoneNumberJTxtField)
                            .addComponent(AddressJTxtField)
                            .addComponent(CustomerNameJTxtField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addJButton)
                        .addGap(352, 352, 352))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddressJTxtField, CustomerNameJTxtField, EmailJTxtField, PasswordJTxtField, PhoneNumberJTxtField, UsernameJTxtField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameJLabel)
                    .addComponent(CustomerNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberJLabel)
                    .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EmailJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameJTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordJLabel))
                .addGap(18, 18, 18)
                .addComponent(addJButton)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberJTxtFieldActionPerformed

    private void PasswordJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordJTxtFieldActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        if (CustomerNameJTxtField.getText().isEmpty()
                || PasswordJTxtField.getText().isEmpty()
                || UsernameJTxtField.getText().isEmpty()
                || AddressJTxtField.getText().isEmpty()
                || EmailJTxtField.getText().isEmpty()
                || PhoneNumberJTxtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide all the details of the Customer");
            return;
        } else {

            if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(CustomerNameJTxtField.getText())) {
                Customer customer = new Customer(CustomerNameJTxtField.getText(), AddressJTxtField.getText(), PhoneNumberJTxtField.getText(), EmailJTxtField.getText(), UsernameJTxtField.getText(), PasswordJTxtField.getText());

                UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(UsernameJTxtField.getText(), PasswordJTxtField.getText(), new CustomerRole());

                System.out.println(ecosystem.getUserAccountDirectory());
                ecosystem.getUserAccountDirectory().addNewUser(ua);
                System.out.println(ecosystem.getCustomerDirectory());
                ecosystem.getCustomerDirectory().addCustomer(customer);
                JOptionPane.showMessageDialog(null, "Customer added");
                CustomerNameJTxtField.setText("");
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

    private void EmailJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailJTxtFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressJLabel;
    private javax.swing.JTextField AddressJTxtField;
    private javax.swing.JLabel CustomerNameJLabel;
    private javax.swing.JTextField CustomerNameJTxtField;
    private javax.swing.JTextField EmailJTxtField;
    private javax.swing.JLabel PasswordJLabel;
    private javax.swing.JTextField PasswordJTxtField;
    private javax.swing.JLabel PhoneNumberJLabel;
    private javax.swing.JTextField PhoneNumberJTxtField;
    private javax.swing.JLabel UsernameJLabel;
    private javax.swing.JTextField UsernameJTxtField;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
