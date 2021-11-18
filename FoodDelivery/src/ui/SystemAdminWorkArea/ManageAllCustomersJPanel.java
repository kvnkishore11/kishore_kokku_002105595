
package ui.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageAllCustomersJPanel extends javax.swing.JPanel {

    UserAccountDirectory userAccountList;
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public ManageAllCustomersJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllCustomersJLabel = new javax.swing.JLabel();
        btnViewCustomers = new javax.swing.JButton();
        btnAddNewCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));

        AllCustomersJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AllCustomersJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AllCustomersJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AllCustomersJLabel.setText("Manage All Customers");

        btnViewCustomers.setBackground(new java.awt.Color(255, 59, 63));
        btnViewCustomers.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCustomers.setText("View All Customers");
        btnViewCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomersActionPerformed(evt);
            }
        });

        btnAddNewCustomer.setBackground(new java.awt.Color(255, 59, 63));
        btnAddNewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewCustomer.setText("Add New Customer");
        btnAddNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewCustomerActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddNewCustomer)
                            .addComponent(btnViewCustomers))
                        .addGap(0, 325, Short.MAX_VALUE))
                    .addComponent(AllCustomersJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addGap(44, 44, 44)
                .addComponent(AllCustomersJLabel)
                .addGap(108, 108, 108)
                .addComponent(btnViewCustomers)
                .addGap(18, 18, 18)
                .addComponent(btnAddNewCustomer)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomersActionPerformed
        
        ViewCustomersJPanel cust = new ViewCustomersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ViewCustomersJPanel", cust);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewCustomersActionPerformed

    private void btnAddNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewCustomerActionPerformed
        
        CreateCustomersJPanel cust = new CreateCustomersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("CreateCustomersJPanel", cust);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAddNewCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
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
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllCustomersJLabel;
    private javax.swing.JButton btnAddNewCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewCustomers;
    // End of variables declaration//GEN-END:variables

}
