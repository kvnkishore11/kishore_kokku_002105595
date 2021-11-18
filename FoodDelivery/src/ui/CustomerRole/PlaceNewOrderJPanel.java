
package ui.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderItemTotal;
import Business.WorkQueue.NewOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class PlaceNewOrderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Restaurant restaurant;
    String name;
    RestaurantDirectory rd;
    Customer customer;
    WorkRequest workrequest;
    int i = -1;
    List<OrderItemTotal> orderItemList = new ArrayList<OrderItemTotal>();

    public PlaceNewOrderJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, Restaurant restaurant, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.restaurant = restaurant;
        rd = ecosystem.getRestaurantDirectory();
        populateRestaurantComboBox(rd);
        this.customer = customer;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewOrderJLabel = new javax.swing.JLabel();
        RestaurantJLabel = new javax.swing.JLabel();
        MenuItemJLabel = new javax.swing.JLabel();
        MenuItemJComboBox = new javax.swing.JComboBox<>();
        QuantityJLabel = new javax.swing.JLabel();
        QuantityJTxtField = new javax.swing.JTextField();
        RestaurantJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderJTable = new javax.swing.JTable();
        TotalJLabel = new javax.swing.JLabel();
        TotalJTxtField = new javax.swing.JTextField();
        ConfirmJButton = new javax.swing.JButton();
        DeleteJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentsTxtArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(48, 65, 93));
        setForeground(new java.awt.Color(255, 255, 255));

        NewOrderJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewOrderJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewOrderJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderJLabel.setText("New Order");

        RestaurantJLabel.setForeground(new java.awt.Color(255, 255, 255));
        RestaurantJLabel.setText("Restaurant");

        MenuItemJLabel.setForeground(new java.awt.Color(255, 255, 255));
        MenuItemJLabel.setText("Item");

        MenuItemJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemJComboBoxActionPerformed(evt);
            }
        });

        QuantityJLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuantityJLabel.setText("Quantity");

        RestaurantJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurantJComboBoxActionPerformed(evt);
            }
        });

        OrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Menu Item ", "Price", "Quantity"
            }
        ));
        OrderJTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                OrderJTableComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(OrderJTable);

        TotalJLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalJLabel.setText("Total:");

        TotalJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalJTxtFieldActionPerformed(evt);
            }
        });

        ConfirmJButton.setBackground(new java.awt.Color(255, 59, 63));
        ConfirmJButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmJButton.setText("Confim");
        ConfirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmJButtonActionPerformed(evt);
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

        jButton1.setBackground(new java.awt.Color(255, 59, 63));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Additional Comments:");

        CommentsTxtArea.setColumns(20);
        CommentsTxtArea.setRows(5);
        jScrollPane2.setViewportView(CommentsTxtArea);

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
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TotalJLabel)
                        .addGap(26, 26, 26)
                        .addComponent(TotalJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(ConfirmJButton)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(NewOrderJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RestaurantJLabel)
                                    .addComponent(MenuItemJLabel)
                                    .addComponent(QuantityJLabel))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MenuItemJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(QuantityJTxtField)
                                    .addComponent(RestaurantJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)
                                .addComponent(DeleteJButton)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(209, 209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(NewOrderJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RestaurantJLabel)
                            .addComponent(RestaurantJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MenuItemJLabel)
                            .addComponent(MenuItemJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuantityJLabel)
                            .addComponent(QuantityJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(DeleteJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalJLabel)
                    .addComponent(TotalJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmJButton))
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RestaurantJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurantJComboBoxActionPerformed
        // TODO add your handling code here:
        MenuItemJComboBox.removeAllItems();
        DefaultTableModel dtm = (DefaultTableModel) OrderJTable.getModel();
        dtm.setRowCount(0);
        int selectedValue = RestaurantJComboBox.getSelectedIndex();
        if (selectedValue >= 0) {
            name = RestaurantJComboBox.getItemAt(selectedValue);
            this.populateMenuItems(name);
        }
    }//GEN-LAST:event_RestaurantJComboBoxActionPerformed

    private void MenuItemJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemJComboBoxActionPerformed
        // TODO add your handling code here:
        //int index = MenuItemJComboBox.getSelectedIndex();
        //clear of the selected items
        int selectedValue = MenuItemJComboBox.getSelectedIndex();
        name = MenuItemJComboBox.getItemAt(selectedValue);
        populateMenuItems(name);
    }//GEN-LAST:event_MenuItemJComboBoxActionPerformed

    private void ConfirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmJButtonActionPerformed
        // TODO add your handling code here:
        Boolean flag = true;
        if (orderItemList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Cart is Empty!");
            flag = false;
        } else {
            NewOrderWorkRequest placeNewOrderWorkRequest = new NewOrderWorkRequest();
            placeNewOrderWorkRequest.setOrderTotal(orderItemList);
            placeNewOrderWorkRequest.setMessage(CommentsTxtArea.getText());
            if (customer != null) {
                System.out.println(customer.getName());
                placeNewOrderWorkRequest.setSender(customer);
            } else {
                System.out.println("Customer is null");
            }
            int selectedValue = RestaurantJComboBox.getSelectedIndex();
            Restaurant restaurant = rd.getRestaurantList().get(selectedValue);
            if (restaurant != null) {
                System.out.println(restaurant.getName());
                placeNewOrderWorkRequest.setReceiver(restaurant);
            } else {
                System.out.println("Restaurant is null");
            }
            placeNewOrderWorkRequest.setRequestDate(new Date());
            placeNewOrderWorkRequest.setStatus("Ordered");
            ecosystem.getWorkQueue().addWorkRequest(placeNewOrderWorkRequest);
        }
        if (flag) {
            JOptionPane.showMessageDialog(null, "Ordered Placed Successfully");
            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
            System.out.println("prev");
            CustomerAreaJPanel cust = new CustomerAreaJPanel(userProcessContainer, userAccount, ecosystem, customer);
            userProcessContainer.add("CustomerAreaJPanel", cust);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_ConfirmJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
        TotalJTxtField.setText(getTotal());
        int rowCount = OrderJTable.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            int quantity = Integer.parseInt(OrderJTable.getValueAt(i, 2).toString());
            MenuItem item = (MenuItem) OrderJTable.getValueAt(i, 0);
            if (quantity > 0) {
                OrderItemTotal orderItemTotal = new OrderItemTotal(item, quantity);
                orderItemList.add(orderItemTotal);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TotalJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalJTxtFieldActionPerformed

    private void OrderJTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_OrderJTableComponentAdded
        // TODO add your handling code here:
        TotalJTxtField.setText(getTotal());
    }//GEN-LAST:event_OrderJTableComponentAdded

    private void DeleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = OrderJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            DefaultTableModel dtm = (DefaultTableModel) OrderJTable.getModel();
            dtm.removeRow(OrderJTable.getSelectedRow());
            TotalJTxtField.setText(getTotal());
            QuantityJTxtField.setText("");
//            populateTable();
        }
    }//GEN-LAST:event_DeleteJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentsTxtArea;
    private javax.swing.JButton ConfirmJButton;
    private javax.swing.JButton DeleteJButton;
    private javax.swing.JComboBox<String> MenuItemJComboBox;
    private javax.swing.JLabel MenuItemJLabel;
    private javax.swing.JLabel NewOrderJLabel;
    private javax.swing.JTable OrderJTable;
    private javax.swing.JLabel QuantityJLabel;
    private javax.swing.JTextField QuantityJTxtField;
    private javax.swing.JComboBox<String> RestaurantJComboBox;
    private javax.swing.JLabel RestaurantJLabel;
    private javax.swing.JLabel TotalJLabel;
    private javax.swing.JTextField TotalJTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) OrderJTable.getModel();
//        dtm.setRowCount(0);
        int selectedValue = RestaurantJComboBox.getSelectedIndex();
        int quantity = Integer.parseInt(QuantityJTxtField.getText());
        Restaurant restaurant = rd.getRestaurantList().get(selectedValue);

        for (MenuItem mi : restaurant.getMenu().getMenuList()) {
            if (mi.getItemName().equalsIgnoreCase(MenuItemJComboBox.getSelectedItem().toString())) {
                Object[] row = new Object[3];
                row[0] = mi;
                row[1] = mi.getItemPrice();
                row[2] = QuantityJTxtField.getText();
                dtm.addRow(row);
            }

//        DefaultTableModel dtm = (DefaultTableModel) OrderJTable.getModel();
//        dtm.setRowCount(0);
//        //createAddToCartButton();
//        Restaurant restaurant = rd.getRestaurantList().get(-1);
//        Menu menu = restaurant.getMenu();
//        List<MenuItem> items = menu.getMenuList();
//        for (MenuItem item : items) {
//            Object[] row = new Object[OrderJTable.getColumnCount()];
//            row[0] = item;
//            row[1] = item.getItemPrice();
//            dtm.addRow(row);
        }
    }

    private void populateMenuItems(String name) {

        for (Restaurant r : rd.getRestaurantList()) {
            if (r.getName().equals(name)) {
                Restaurant r1 = r;
                for (MenuItem mi : r1.getMenu().getMenuList()) {
                    MenuItemJComboBox.addItem(mi.getItemName());
                }
                break;
            }
        }

    }

    private void populateRestaurantComboBox(RestaurantDirectory rd) {

        for (Restaurant r : rd.getRestaurantList()) {
            System.out.println(r.getName());
            RestaurantJComboBox.addItem(r.getName());
            System.out.println(RestaurantJComboBox.getItemAt(0));
        }
    }

    private String getTotal() {
        int rowCount = OrderJTable.getRowCount();
        Double total = 0.0;
        for (int i = 0; i < rowCount; i++) {
            total = total + ((Integer.parseInt(OrderJTable.getValueAt(i, 2).toString())) * (Double.parseDouble(OrderJTable.getValueAt(i, 1).toString())));
        }
        System.out.println(total);
        return total.toString();

    }

}
