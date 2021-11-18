
package ui.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ViewMenuJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Restaurant restaurant;

    public ViewMenuJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.restaurant = restaurant;
        populateTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MenuJTable = new javax.swing.JTable();
        ViewMenuJLabel = new javax.swing.JLabel();
        ItemNameJLabel = new javax.swing.JLabel();
        ItemPriceJLabel = new javax.swing.JLabel();
        ItemNameJTxtField = new javax.swing.JTextField();
        ItemPriceJTxtField = new javax.swing.JTextField();
        UpdateJButton = new javax.swing.JButton();
        DeleteJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));
        setForeground(new java.awt.Color(255, 255, 255));

        MenuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Item Price"
            }
        ));
        MenuJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MenuJTable);

        ViewMenuJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ViewMenuJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewMenuJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewMenuJLabel.setText("View Menu");

        ItemNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ItemNameJLabel.setText("Item Name:");

        ItemPriceJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ItemPriceJLabel.setText("Item Price:");

        ItemPriceJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPriceJTxtFieldActionPerformed(evt);
            }
        });

        UpdateJButton.setBackground(new java.awt.Color(255, 59, 63));
        UpdateJButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateJButton.setText("Update");
        UpdateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateJButtonActionPerformed(evt);
            }
        });

        DeleteJButton.setBackground(new java.awt.Color(255, 59, 63));
        DeleteJButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteJButton.setText("Delete");
        DeleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteJButtonActionPerformed(evt);
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
                        .addGap(38, 38, 38)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(ViewMenuJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemNameJLabel)
                            .addComponent(ItemPriceJLabel))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ItemNameJTxtField)
                            .addComponent(ItemPriceJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(UpdateJButton)
                            .addGap(18, 18, 18)
                            .addComponent(DeleteJButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addGap(14, 14, 14)
                .addComponent(ViewMenuJLabel)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateJButton)
                    .addComponent(DeleteJButton))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemNameJLabel)
                    .addComponent(ItemNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemPriceJLabel)
                    .addComponent(ItemPriceJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MenuJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuJTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) MenuJTable.getModel();

        String ItemName = dtm.getValueAt(MenuJTable.getSelectedRow(), 0).toString();
        String ItemPrice = dtm.getValueAt(MenuJTable.getSelectedRow(), 1).toString();

        ItemNameJTxtField.setText(ItemName);
        ItemPriceJTxtField.setText(ItemPrice);
    }//GEN-LAST:event_MenuJTableMouseClicked

    private void ItemPriceJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPriceJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemPriceJTxtFieldActionPerformed

    private void UpdateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = MenuJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
//            updateJPanel.setVisible(true);
            System.out.println("I am here");

            MenuItem mi = (MenuItem) MenuJTable.getValueAt(selectedRow, 0);
            System.out.println("item : " + mi.getItemName());
            mi.setItemName(ItemNameJTxtField.getText());
            mi.setItemPrice(Double.parseDouble(ItemPriceJTxtField.getText()));
            populateTable();
            ItemNameJTxtField.setText("");
            ItemPriceJTxtField.setText("");
        }
    }//GEN-LAST:event_UpdateJButtonActionPerformed

    private void DeleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = MenuJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            MenuItem mi = (MenuItem) MenuJTable.getValueAt(selectedRow, 0);
            Menu m = restaurant.getMenu();
            m.deleteMenuItem(mi);
            JOptionPane.showMessageDialog(null, "Menu Item " + ItemNameJTxtField.getText() + " deleted");
            populateTable();
            ItemNameJTxtField.setText("");
            ItemPriceJTxtField.setText("");

        }
    }//GEN-LAST:event_DeleteJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteJButton;
    private javax.swing.JLabel ItemNameJLabel;
    private javax.swing.JTextField ItemNameJTxtField;
    private javax.swing.JLabel ItemPriceJLabel;
    private javax.swing.JTextField ItemPriceJTxtField;
    private javax.swing.JTable MenuJTable;
    private javax.swing.JButton UpdateJButton;
    private javax.swing.JLabel ViewMenuJLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) MenuJTable.getModel();
        model.setRowCount(0);
//        
        for (MenuItem mi : restaurant.getMenu().getMenuList()) {
            Object[] row = new Object[5];
            row[0] = mi;
            row[1] = mi.getItemPrice();
            model.addRow(row);
        }
    }
}
