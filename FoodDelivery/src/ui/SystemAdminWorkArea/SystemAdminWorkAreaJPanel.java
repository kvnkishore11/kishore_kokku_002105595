
package ui.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

        List<Restaurant> restaurantList;
        List<Customer> customerList;
        List<DeliveryMan> deliverMenList;
        Restaurant restaurant;
        Customer customer;
        DeliveryMan deliveryMan;
       
        DefaultMutableTreeNode restaurants = new DefaultMutableTreeNode("Restaurants");
        DefaultMutableTreeNode customers = new DefaultMutableTreeNode("Customers");
        DefaultMutableTreeNode deliverymen = new DefaultMutableTreeNode("Delivery Men");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(restaurants, 0);
        root.insert(customers, 1);
        root.insert(deliverymen, 2);
        
        DefaultMutableTreeNode restaurantNode;
        DefaultMutableTreeNode CustomersNode;
        DefaultMutableTreeNode DeliveryMenNode;
        
          restaurantList = ecosystem.getRestaurantDirectory().getRestaurantList();
        for (int k = 0; k < restaurantList.size(); k++) {
            restaurant = restaurantList.get(k);
            restaurantNode = new DefaultMutableTreeNode(restaurant.getName());
            restaurants.insert(restaurantNode, k);
        }
        customerList = ecosystem.getCustomerDirectory().getCustomerList();
        for (int k = 0; k < customerList.size(); k++) {
            customer = customerList.get(k);
            CustomersNode = new DefaultMutableTreeNode(customer.getName());
            customers.insert(CustomersNode, k);
        }
        deliverMenList = ecosystem.getDeliveryManDirectory().getDeliveryManList();
        for (int k = 0; k < deliverMenList.size(); k++) {
            deliveryMan = deliverMenList.get(k);
            DeliveryMenNode = new DefaultMutableTreeNode(deliveryMan.getName());
            deliverymen.insert(DeliveryMenNode, k);
        }
        model.reload();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnManageCustomers = new javax.swing.JButton();
        btnManageRestaurants = new javax.swing.JButton();
        btnDeliveryMen = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 393));

        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 321, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        btnManageCustomers.setText("Manage All Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageRestaurants.setText("Manage Restaurants");
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });

        btnDeliveryMen.setText("Manage Deliveryman");
        btnDeliveryMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryMenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageCustomers)
                    .addComponent(btnManageRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeliveryMen))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeliveryMen, btnManageCustomers, btnManageRestaurants});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(btnManageCustomers)
                .addGap(18, 18, 18)
                .addComponent(btnManageRestaurants)
                .addGap(18, 18, 18)
                .addComponent(btnDeliveryMen)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
       
        ManageAllCustomersJPanel cust = new ManageAllCustomersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageAllCustomersJPanel", cust);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        
        ManageRestaurantsJPanel rest = new ManageRestaurantsJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageAllCustomersJPanel", rest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnDeliveryMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryMenActionPerformed
       
        ManageDeliverymanJPanel deli = new ManageDeliverymanJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageAllCustomersJPanel", deli);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeliveryMenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeliveryMen;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    // End of variables declaration//GEN-END:variables
}
