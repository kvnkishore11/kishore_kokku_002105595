/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
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
public class ViewDeliverymenJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeliverymenJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    DeliveryMan selectedDeliveryMan;
    
    public ViewDeliverymenJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
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
        DeliveryMenJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NameJLabel = new javax.swing.JLabel();
        AddressJTxtField = new javax.swing.JTextField();
        AddressJLabel = new javax.swing.JLabel();
        PhoneNumberJTxtField = new javax.swing.JTextField();
        PhoneNumberJLabel = new javax.swing.JLabel();
        NameJTxtField = new javax.swing.JTextField();
        deleteJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        lblUpdate = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));
        setForeground(new java.awt.Color(255, 255, 255));

        DeliveryMenJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Address", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DeliveryMenJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeliveryMenJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DeliveryMenJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delivery Associate Information");

        NameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameJLabel.setText("Delivery Man Name:");

        AddressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressJLabel.setText("Address:");

        PhoneNumberJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberJTxtFieldActionPerformed(evt);
            }
        });

        PhoneNumberJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberJLabel.setText("Phone number:");

        deleteJButton.setBackground(new java.awt.Color(255, 59, 63));
        deleteJButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        updateJButton.setBackground(new java.awt.Color(255, 59, 63));
        updateJButton.setForeground(new java.awt.Color(255, 255, 255));
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        lblUpdate.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdate.setText("Update Delivery Associate");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateJButton)
                        .addGap(27, 27, 27)
                        .addComponent(deleteJButton)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PhoneNumberJLabel)
                                    .addGap(150, 150, 150))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(AddressJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(AddressJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnSubmit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteJButton)
                    .addComponent(updateJButton))
                .addGap(59, 59, 59)
                .addComponent(lblUpdate)
                .addGap(18, 18, 18)
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
                .addComponent(btnSubmit)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberJTxtFieldActionPerformed

    private void DeliveryMenJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeliveryMenJTableMouseClicked
        // TODO add your handling code here:
//        DefaultTableModel dtm = (DefaultTableModel) DeliveryMenJTable.getModel();
//
//        String Name = dtm.getValueAt(DeliveryMenJTable.getSelectedRow(), 0).toString();
//        String Address = dtm.getValueAt(DeliveryMenJTable.getSelectedRow(), 1).toString();
//        String Phone = dtm.getValueAt(DeliveryMenJTable.getSelectedRow(), 2).toString();
//        String Username = dtm.getValueAt(DeliveryMenJTable.getSelectedRow(), 3).toString();
//        String Password = dtm.getValueAt(DeliveryMenJTable.getSelectedRow(), 4).toString();
//
//        NameJTxtField.setText(Name);
//        AddressJTxtField.setText(Address);
//        PhoneNumberJTxtField.setText(Phone);

    }//GEN-LAST:event_DeliveryMenJTableMouseClicked

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        int selectedRow = DeliveryMenJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            System.out.println("I am here");

            selectedDeliveryMan = (DeliveryMan) DeliveryMenJTable.getValueAt(selectedRow, 0);
            System.out.println("item : " + selectedDeliveryMan.getName());
            
            updateDeliveryMan();
            
        }

    }//GEN-LAST:event_updateJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = DeliveryMenJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            DeliveryMan deli = (DeliveryMan) DeliveryMenJTable.getValueAt(selectedRow, 0);
            DeliveryManDirectory customerDirectory = ecosystem.getDeliveryManDirectory();
            customerDirectory.deleteDeliveryMan(deli);
            JOptionPane.showMessageDialog(null, "Delivery Man   " + deli + " deleted");
            populateTable();

        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

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

        selectedDeliveryMan.setName(NameJTxtField.getText());
        selectedDeliveryMan.setPhoneNumber(PhoneNumberJTxtField.getText());
        selectedDeliveryMan.setAddress(AddressJTxtField.getText());
        populateTable();
        resetTextFields();
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressJLabel;
    private javax.swing.JTextField AddressJTxtField;
    private javax.swing.JTable DeliveryMenJTable;
    private javax.swing.JLabel NameJLabel;
    private javax.swing.JTextField NameJTxtField;
    private javax.swing.JLabel PhoneNumberJLabel;
    private javax.swing.JTextField PhoneNumberJTxtField;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) DeliveryMenJTable.getModel();
        model.setRowCount(0);
        
        for (DeliveryMan d : ecosystem.getDeliveryManDirectory().getDeliveryManList()) {
            Object[] row = new Object[5];
            row[0] = d;
            row[1] = d.getAddress();
            row[2] = d.getPhoneNumber();
            row[3] = d.getUsername();
            row[4] = d.getPassword();
            model.addRow(row);

        }
    }

    private void resetTextFields() {
        lblUpdate.setVisible(false);
        NameJLabel.setVisible(false);
        NameJTxtField.setVisible(false);
        AddressJLabel.setVisible(false);
        AddressJTxtField.setVisible(false);
        PhoneNumberJLabel.setVisible(false);
        PhoneNumberJTxtField.setVisible(false);
        btnSubmit.setVisible(false);
    }

    private void updateDeliveryMan() {
        NameJTxtField.setText("");
        AddressJTxtField.setText("");
        PhoneNumberJTxtField.setText("");
        lblUpdate.setVisible(true);
        NameJLabel.setVisible(true);
        NameJTxtField.setVisible(true);
        AddressJLabel.setVisible(true);
        AddressJTxtField.setVisible(true);
        PhoneNumberJLabel.setVisible(true);
        PhoneNumberJTxtField.setVisible(true);
        btnSubmit.setVisible(true);
    }
}
