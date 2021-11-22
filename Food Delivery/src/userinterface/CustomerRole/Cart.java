/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Order.CartModel;
import Business.Order.Order;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kishore KVN
 */
public class Cart extends javax.swing.JPanel {

    /**
     * Creates new form Cart
     */
    
    private JPanel userProcessContainer;

     UserAccount userAccount;
    EcoSystem ecosystem;
    RestaurantDirectory rd;
    CustomerDirectory cd;
    Customer customer;
    int count = 0;
    
    public Cart(JPanel userProcessContainer, Customer customer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customer = customer;
        this.ecosystem = ecosystem;
        populateTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        Order = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Restaurant"
            }
        ));
        jScrollPane1.setViewportView(cartTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 200, 740, 230));

        Order.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Order.setForeground(new java.awt.Color(51, 51, 255));
        Order.setText("Order");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });
        add(Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 12, 70, -1));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Cart");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(547, Short.MAX_VALUE)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(497, 497, 497))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1300, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        // TODO add your handling code here:
        ArrayList<CartModel> cartList = customer.getCart();
        ArrayList<Order> orders = customer.getPreviousOrders();
        Order order;
        
        for(CartModel cm: cartList)
        {
           order = new Order();
           order.setItem(cm.getItem());
           order.setRestaurant(cm.getRestaurant());
           order.setEntryDateTime(LocalDateTime.now());
           orders.add(order);
        }
        cartList.clear();
        
        DefaultTableModel dx = (DefaultTableModel) cartTable.getModel();
        dx.setRowCount(0);
        
        JOptionPane.showMessageDialog(this, "Order placed");
    }//GEN-LAST:event_OrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
            CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Customer");
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Order;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable cartTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle1;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel df = (DefaultTableModel) cartTable.getModel();
        df.setRowCount(0);
        
        ArrayList<CartModel> cart = customer.getCart();
        for(CartModel cm : cart)
        {
            String[] row = {cm.getRestaurant(),cm.getItem()};
            df.addRow(row);
            
        }
        
        cartTable.setModel(df);
    }
}
