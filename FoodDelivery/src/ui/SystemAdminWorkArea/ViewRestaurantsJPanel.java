
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ViewRestaurantsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Restaurant selectedRestaurant;
    
    
    public ViewRestaurantsJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateTable();
        resetTextFields();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RestaurantsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        PhoneNumberJLabel = new javax.swing.JLabel();
        NameJTxtField = new javax.swing.JTextField();
        NameJLabel = new javax.swing.JLabel();
        AddressJTxtField = new javax.swing.JTextField();
        AddressJLabel = new javax.swing.JLabel();
        PhoneNumberJTxtField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));
        setForeground(new java.awt.Color(255, 255, 255));

        RestaurantsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurant Name", "Address", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RestaurantsJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestaurantsJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RestaurantsJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Restaurants");

        PhoneNumberJLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberJLabel.setText("Phone number:");

        NameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameJLabel.setText("Restaurant Name:");

        AddressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressJLabel.setText("Address:");

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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Restaurant");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateJButton)
                                .addGap(40, 40, 40)
                                .addComponent(deleteJButton)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameJLabel)
                                    .addComponent(PhoneNumberJLabel)
                                    .addComponent(AddressJLabel))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NameJTxtField)
                                    .addComponent(AddressJTxtField)
                                    .addComponent(PhoneNumberJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnSubmit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateJButton)
                    .addComponent(deleteJButton))
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void resetTextFields() {
        NameJTxtField.setText("");
        PhoneNumberJTxtField.setText("");
        AddressJTxtField.setText("");
        NameJTxtField.setVisible(false);
        PhoneNumberJTxtField.setVisible(false);
        AddressJTxtField.setVisible(false);
        jLabel2.setVisible(false);
        NameJLabel.setVisible(false);
        AddressJLabel.setVisible(false);
        PhoneNumberJLabel.setVisible(false);
        btnSubmit.setVisible(false);
        
    }
    
    private void updateRestaurant(){
        
        NameJTxtField.setVisible(true);
        PhoneNumberJTxtField.setVisible(true);
        AddressJTxtField.setVisible(true);
        jLabel2.setVisible(true);
        NameJLabel.setVisible(true);
        AddressJLabel.setVisible(true);
        PhoneNumberJLabel.setVisible(true);
        btnSubmit.setVisible(true);
    }
    
    private void RestaurantsJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaurantsJTableMouseClicked
        // TODO add your handling code here:
//        DefaultTableModel dtm = (DefaultTableModel) RestaurantsJTable.getModel();
//
//        String Name = dtm.getValueAt(RestaurantsJTable.getSelectedRow(), 0).toString();
//        String Address = dtm.getValueAt(RestaurantsJTable.getSelectedRow(), 1).toString();
//        String Phone = dtm.getValueAt(RestaurantsJTable.getSelectedRow(), 2).toString();
//        String Username = dtm.getValueAt(RestaurantsJTable.getSelectedRow(), 3).toString();
//        String Password = dtm.getValueAt(RestaurantsJTable.getSelectedRow(), 4).toString();
//
//        NameJTxtField.setText(Name);
//        AddressJTxtField.setText(Address);
//        PhoneNumberJTxtField.setText(Phone);
    }//GEN-LAST:event_RestaurantsJTableMouseClicked

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = RestaurantsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            Restaurant restaurant = (Restaurant) RestaurantsJTable.getValueAt(selectedRow, 0);
            RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
            restaurantDirectory.deleteRestaurant(restaurant);
            JOptionPane.showMessageDialog(null, "Restaurant   " + restaurant+ " deleted");
            populateTable();
            NameJTxtField.setText("");
            AddressJTxtField.setText("");
            PhoneNumberJTxtField.setText("");

        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = RestaurantsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            System.out.println("I am here");

            selectedRestaurant = (Restaurant) RestaurantsJTable.getValueAt(selectedRow, 0);
            System.out.println("item : " + selectedRestaurant.getName());
            
            updateRestaurant();
//            NameJTxtField.setText("");
//            PhoneNumberJTxtField.setText("");
//            AddressJTxtField.setText("");
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

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

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        selectedRestaurant.setName(NameJTxtField.getText());
        selectedRestaurant.setPhoneNumber(PhoneNumberJTxtField.getText());
        selectedRestaurant.setAddress(AddressJTxtField.getText());
        populateTable();
        resetTextFields();
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressJLabel;
    private javax.swing.JTextField AddressJTxtField;
    private javax.swing.JLabel NameJLabel;
    private javax.swing.JTextField NameJTxtField;
    private javax.swing.JLabel PhoneNumberJLabel;
    private javax.swing.JTextField PhoneNumberJTxtField;
    private javax.swing.JTable RestaurantsJTable;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) RestaurantsJTable.getModel();
        model.setRowCount(0);
//        
        for (Restaurant r : ecosystem.getRestaurantDirectory().getRestaurantList()) {
            Object[] row = new Object[5];
            row[0] = r;
            row[1] = r.getAddress();
            row[2] = r.getPhoneNumber();
            row[3] = r.getUsername();
            row[4] = r.getPassword();
            model.addRow(row);
        }
    }

    
}
