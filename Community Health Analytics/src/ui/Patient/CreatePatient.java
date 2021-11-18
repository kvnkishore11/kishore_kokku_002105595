/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package ui.Patient;

import model.City;
import model.Community;
import model.HealthcareSystem;
import model.House;
import model.Patient;
import model.PatientDirectory;
import ui.Admin.ManagePatients;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author KishoreKVN
 */
public class CreatePatient extends javax.swing.JPanel {

    PatientDirectory patientDirectory;
    City city;
    HealthcareSystem healthcareSystem;
    JPanel workArea;
    
    static String emailCheck = "^(.+)@(.+)$";
     
    /**
     * Creates new form CreateProductJPanel
     */
    public CreatePatient(JPanel workArea, HealthcareSystem healthcareSystem) {
        initComponents();
        this.patientDirectory = healthcareSystem.getPatientDirectory();
        city = healthcareSystem.getCity();
        this.workArea = workArea;
        
        populateCommunityComboBox();
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnlAddressInfo = new javax.swing.JPanel();
        lblHouseNo = new javax.swing.JLabel();
        txtHouseNo = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        cmbCommunity = new javax.swing.JComboBox<>();
        lblStreetName = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBasicInfo = new javax.swing.JPanel();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblProductName2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblHouseNo1 = new javax.swing.JLabel();
        lblHouseNo3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_user_group_man_man_35px_1.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 50, 40));

        btnBack.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_prev_48px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        pnlAddressInfo.setBackground(new java.awt.Color(204, 204, 255));
        pnlAddressInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHouseNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHouseNo.setText("House No");
        pnlAddressInfo.add(lblHouseNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtHouseNo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlAddressInfo.add(txtHouseNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 182, -1));

        lblCommunity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCommunity.setText("Community:");
        pnlAddressInfo.add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cmbCommunity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlAddressInfo.add(cmbCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 182, 20));

        lblStreetName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStreetName.setText("Street");
        pnlAddressInfo.add(lblStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        lblZip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblZip.setText("Zipcode");
        pnlAddressInfo.add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        txtStreetName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlAddressInfo.add(txtStreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 176, -1));

        txtZip.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlAddressInfo.add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 176, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Address Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlAddressInfo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 650, 20));

        add(pnlAddressInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 650, 200));

        pnlBasicInfo.setBackground(new java.awt.Color(153, 255, 204));
        pnlBasicInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPatientId.setText("Paitent Id");
        pnlBasicInfo.add(lblPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 20));

        txtPatientId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        pnlBasicInfo.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, -1));

        lblDateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDateOfBirth.setText("Age");
        pnlBasicInfo.add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, 30));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email");
        pnlBasicInfo.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlBasicInfo.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 182, -1));

        lblPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Mobile");
        lblPhone.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pnlBasicInfo.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        txtAge.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlBasicInfo.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 182, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Basic Info");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBasicInfo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 650, 20));

        lblProductName2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProductName2.setText(" Name");
        pnlBasicInfo.add(lblProductName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        txtPatientName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlBasicInfo.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 182, -1));

        txtPhone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pnlBasicInfo.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 182, -1));

        add(pnlBasicInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 650, 190));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Enter New Patient Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 50));

        lblHouseNo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHouseNo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHouseNo1.setText("Back");
        add(lblHouseNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 40, 20));

        lblHouseNo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHouseNo3.setForeground(new java.awt.Color(0, 51, 255));
        lblHouseNo3.setText("Add Patient");
        add(lblHouseNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        Patient patient = null;
        int patientId = 0;
        String patientName = null;
        long phone = 0;
        String email = null;
        
        String houseNo = null;
        String streetName = null;
        int zip = 0;
        String communityName = null;
        int age = 0;
        
        
        patientName = txtPatientName.getText();
       
        email = txtEmail.getText();
        houseNo = txtHouseNo.getText();
        streetName = txtStreetName.getText();
        
        Community selectedCommunity = (Community) cmbCommunity.getSelectedItem();
        communityName = selectedCommunity.getName();
        
       //validation
        try{
            age= Integer.parseInt(txtAge.getText());
            patientId = Integer.parseInt(txtPatientId.getText());
            phone = Long.parseLong(txtPhone.getText());
            zip = Integer.parseInt(txtZip.getText());
        }catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(this, "Please enter Phone Number / Zip Code / age / patientId in valid format");
            return;
        }
        
        if(!email.matches(emailCheck)){
            JOptionPane.showMessageDialog(this, "Email has to be in the format of email_address@gmail.com");
            return;
        }
        
        patient = new Patient( patientName, phone, email, age, houseNo, streetName, communityName, zip,patientId);
      
        //add this house to selected comunity also
        patientDirectory.addPatient(patient);
        selectedCommunity.addHouseToCommunity(new House(houseNo, streetName, communityName, zip));
        JOptionPane.showMessageDialog(this, "Patient details successfully added", "Information", JOptionPane.INFORMATION_MESSAGE);
        backAction();
}//GEN-LAST:event_btnAddActionPerformed
    private void backAction() {
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagePatients managePatients = (ManagePatients) component;
        managePatients.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<Object> cmbCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblHouseNo1;
    private javax.swing.JLabel lblHouseNo3;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblProductName2;
    private javax.swing.JLabel lblStreetName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JPanel pnlAddressInfo;
    private javax.swing.JPanel pnlBasicInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void populateCommunityComboBox() {
        
        cmbCommunity.removeAllItems();
        
        for(Community c : city.getCommunities()){
            cmbCommunity.addItem(c);
        }
    }
}
