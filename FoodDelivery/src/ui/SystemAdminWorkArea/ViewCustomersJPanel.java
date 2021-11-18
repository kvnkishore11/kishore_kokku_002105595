
package ui.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author swaroopgupta
 */
public class ViewCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomersJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Customer selectedCustomer;
    public ViewCustomersJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        resetTextFields();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CustomersJTable = new javax.swing.JTable();
        updateJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        updateJPanel = new javax.swing.JPanel();
        lblUpdateCustomer = new javax.swing.JLabel();
        PhoneNumberJTxtField = new javax.swing.JTextField();
        CustomerNameJLabel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        CustomerNameJTxtField = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        AddressJLabel = new javax.swing.JLabel();
        PhoneNumberJLabel = new javax.swing.JLabel();
        AddressJTxtField = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));

        CustomersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Address", "Phone Number", "Emaill"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomersJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomersJTable);

        updateJButton.setBackground(new java.awt.Color(255, 59, 63));
        updateJButton.setForeground(new java.awt.Color(255, 255, 255));
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setBackground(new java.awt.Color(255, 59, 63));
        deleteJButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customers Information");

        updateJPanel.setBackground(new java.awt.Color(48, 65, 93));
        updateJPanel.setForeground(new java.awt.Color(255, 255, 255));
        updateJPanel.setEnabled(false);
        updateJPanel.setPreferredSize(new java.awt.Dimension(315, 100));

        lblUpdateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateCustomer.setText("Update Customer");

        CustomerNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        CustomerNameJLabel.setText("Customer Name:");

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        AddressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressJLabel.setText("Address:");

        PhoneNumberJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberJLabel.setText("Phone number:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateJPanelLayout = new javax.swing.GroupLayout(updateJPanel);
        updateJPanel.setLayout(updateJPanelLayout);
        updateJPanelLayout.setHorizontalGroup(
            updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateJPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnSubmit)
                .addGap(0, 242, Short.MAX_VALUE))
            .addGroup(updateJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateJPanelLayout.createSequentialGroup()
                        .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateJPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(PhoneNumberJLabel))
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddressJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerNameJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34)
                        .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(AddressJTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerNameJTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)))
                    .addComponent(lblUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateJPanelLayout.setVerticalGroup(
            updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateJPanelLayout.createSequentialGroup()
                .addComponent(lblUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(updateJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(572, Short.MAX_VALUE)
                        .addComponent(updateJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteJButton)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateJButton)
                    .addComponent(deleteJButton))
                .addGap(21, 21, 21)
                .addComponent(updateJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = CustomersJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            System.out.println("I am here");
            selectedCustomer = (Customer) CustomersJTable.getValueAt(selectedRow, 0);
            System.out.println("selectedCustomer : " + selectedCustomer.getName());
            updateCustomer();
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
       

        int selectedRow = CustomersJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        } else {
            Customer customer = (Customer) CustomersJTable.getValueAt(selectedRow, 0);
            CustomerDirectory customerDirectory = ecosystem.getCustomerDirectory();
            customerDirectory.deleteCustomer(customer);
            JOptionPane.showMessageDialog(null, "Customer   " + txtEmail.getText() + " deleted");
            populateTable();
//            CustomerNameJTxtField.setText("");
//            AddressJTxtField.setText("");
//            PhoneNumberJTxtField.setText("");
//            txtEmail.setText("");

        }
    }//GEN-LAST:event_deleteJButtonActionPerformed
    
    private void updateCustomer(){

        CustomerNameJLabel.setVisible(true);
        AddressJLabel.setVisible(true);
        PhoneNumberJLabel.setVisible(true);
        lblEmail.setVisible(true);
        lblUpdateCustomer.setVisible(true);
        CustomerNameJTxtField.setVisible(true);
        AddressJTxtField.setVisible(true);
        PhoneNumberJTxtField.setVisible(true);
        txtEmail.setVisible(true);
        btnSubmit.setVisible(true);
    }
    
    private void resetTextFields(){
        CustomerNameJTxtField.setText("");
        AddressJTxtField.setText("");
        PhoneNumberJTxtField.setText("");
        txtEmail.setText("");
        CustomerNameJLabel.setVisible(false);
        AddressJLabel.setVisible(false);
        PhoneNumberJLabel.setVisible(false);
        lblEmail.setVisible(false);
        lblUpdateCustomer.setVisible(false);
        CustomerNameJTxtField.setVisible(false);
        AddressJTxtField.setVisible(false);
        PhoneNumberJTxtField.setVisible(false);
        txtEmail.setVisible(false);
        btnSubmit.setVisible(false);
    }
    
    private void CustomersJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersJTableMouseClicked
        // TODO add your handling code here:
//        DefaultTableModel dtm = (DefaultTableModel) CustomersJTable.getModel();
//
//        String Name = dtm.getValueAt(CustomersJTable.getSelectedRow(), 0).toString();
//        String Address = dtm.getValueAt(CustomersJTable.getSelectedRow(), 1).toString();
//        String Phone = dtm.getValueAt(CustomersJTable.getSelectedRow(), 2).toString();
//        String Email = dtm.getValueAt(CustomersJTable.getSelectedRow(), 3).toString();
//        String Password = dtm.getValueAt(CustomersJTable.getSelectedRow(), 4).toString();
//
//        CustomerNameJTxtField.setText(Name);
//        AddressJTxtField.setText(Address);
//        PhoneNumberJTxtField.setText(Phone);
//        txtEmail.setText(Email);
        
    }//GEN-LAST:event_CustomersJTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
          
        selectedCustomer.setName(CustomerNameJTxtField.getText());
        selectedCustomer.setPhoneNumber(PhoneNumberJTxtField.getText());
        selectedCustomer.setAddress(AddressJTxtField.getText());
        selectedCustomer.setEmail(txtEmail.getText());
        populateTable();
        resetTextFields();
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressJLabel;
    private javax.swing.JTextField AddressJTxtField;
    private javax.swing.JLabel CustomerNameJLabel;
    private javax.swing.JTextField CustomerNameJTxtField;
    private javax.swing.JTable CustomersJTable;
    private javax.swing.JLabel PhoneNumberJLabel;
    private javax.swing.JTextField PhoneNumberJTxtField;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblUpdateCustomer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JButton updateJButton;
    private javax.swing.JPanel updateJPanel;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) CustomersJTable.getModel();
        model.setRowCount(0);

        for (Customer c : ecosystem.getCustomerDirectory().getCustomerList()) {
            Object[] row = new Object[4];
            row[0] = c;
            row[1] = c.getAddress();
            row[2] = c.getPhoneNumber();
            row[3] = c.getEmail();
            model.addRow(row);
        }

    }
}