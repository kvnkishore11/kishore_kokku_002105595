/*
 * AdminJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package ui.Admin;

import model.HealthcareSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.LoginPanel;

/**
 *
 * @author  KishoreKVN
 */
public class AdminJPanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    HealthcareSystem healthcareSystem;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminJPanel(JPanel mainWorkArea, HealthcareSystem healthcareSystem) {
        
        this.mainWorkArea = mainWorkArea;
        this.healthcareSystem = healthcareSystem;
        
        initComponents();
        lblWelcome.setText("Hello Admin!!! Welcome Back...");
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuBar = new javax.swing.JPanel();
        btnManagePatients = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnManageCommunity = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 255));
        setPreferredSize(new java.awt.Dimension(1000, 250));
        setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(50);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitPane.setPreferredSize(new java.awt.Dimension(1000, 100));

        menuBar.setBackground(new java.awt.Color(102, 102, 255));
        menuBar.setPreferredSize(new java.awt.Dimension(1050, 100));

        btnManagePatients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnManagePatients.setForeground(new java.awt.Color(0, 0, 204));
        btnManagePatients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_being_sick_50px.png"))); // NOI18N
        btnManagePatients.setText(" Manage Patients");
        btnManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientsActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(255, 204, 204));
        btnLogOut.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(204, 0, 0));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_shutdown_25px.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("<WelcomeMsg>");

        btnManageCommunity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnManageCommunity.setForeground(new java.awt.Color(0, 0, 204));
        btnManageCommunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_community_grants_50px.png"))); // NOI18N
        btnManageCommunity.setText("Manage Communities");
        btnManageCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageCommunity)
                .addGap(32, 32, 32)
                .addComponent(btnManagePatients)
                .addGap(69, 69, 69)
                .addComponent(btnLogOut)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManagePatients)
                    .addComponent(btnLogOut)
                    .addComponent(lblWelcome)
                    .addComponent(btnManageCommunity))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuBar);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        add(splitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientsActionPerformed
        
        ManagePatients managePatients = new ManagePatients(workArea, healthcareSystem);
        workArea.add("ManagePatients", managePatients);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
     
    }//GEN-LAST:event_btnManagePatientsActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        
        mainWorkArea.remove(this);
        
        Component[] components = mainWorkArea.getComponents();
        Component component = components[components.length - 1];
        
        LoginPanel loginScreenPanel = (LoginPanel) component;
        loginScreenPanel.populatePatientsCombo();
        
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);   
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnManageCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCommunityActionPerformed
        
        ManageCommunity manageCommunity = new ManageCommunity(workArea, healthcareSystem);
        workArea.add("ManageCommunity", manageCommunity);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageCommunityActionPerformed

    @Override
    public String toString(){
        return "Admin";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageCommunity;
    private javax.swing.JButton btnManagePatients;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
    
}
