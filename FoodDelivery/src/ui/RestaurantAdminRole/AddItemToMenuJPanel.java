
package ui.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AddItemToMenuJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Restaurant restaurant;

    public AddItemToMenuJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, Restaurant restaurant) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.restaurant = restaurant;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddItemToMenuJLabel = new javax.swing.JLabel();
        ItemNameJLabel = new javax.swing.JLabel();
        ItemPriceJLabel = new javax.swing.JLabel();
        ItemNameJTxtField = new javax.swing.JTextField();
        ItemPriceJTxtField = new javax.swing.JTextField();
        AddJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));

        AddItemToMenuJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddItemToMenuJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddItemToMenuJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemToMenuJLabel.setText("Add Item to Menu ");

        ItemNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ItemNameJLabel.setText("Item Name:");

        ItemPriceJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ItemPriceJLabel.setText("Item Price:");

        AddJButton.setBackground(new java.awt.Color(255, 59, 63));
        AddJButton.setForeground(new java.awt.Color(255, 255, 255));
        AddJButton.setText("Add");
        AddJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddJButtonActionPerformed(evt);
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
                        .addGap(146, 146, 146)
                        .addComponent(AddItemToMenuJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(AddJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItemNameJLabel)
                                    .addComponent(ItemPriceJLabel))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ItemNameJTxtField)
                                    .addComponent(ItemPriceJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(AddItemToMenuJLabel)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemNameJLabel)
                    .addComponent(ItemNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemPriceJLabel)
                    .addComponent(ItemPriceJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddJButton)
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddJButtonActionPerformed
        // TODO add your handling code here:

        if (ItemNameJTxtField.getText().isEmpty() || ItemPriceJTxtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all details of the Menu Item");
            return;
        } else {
            MenuItem mi = new MenuItem(ItemNameJTxtField.getText(), Double.parseDouble(ItemPriceJTxtField.getText()));
            this.restaurant.getMenu().addMenuItem(mi);
            ItemNameJTxtField.setText("");
            ItemPriceJTxtField.setText("");
            JOptionPane.showMessageDialog(null, "Item added successfully");
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
    }//GEN-LAST:event_AddJButtonActionPerformed
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItemToMenuJLabel;
    private javax.swing.JButton AddJButton;
    private javax.swing.JLabel ItemNameJLabel;
    private javax.swing.JTextField ItemNameJTxtField;
    private javax.swing.JLabel ItemPriceJLabel;
    private javax.swing.JTextField ItemPriceJTxtField;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
