/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Doctor;

import java.awt.CardLayout;
import model.Community;
import model.HealthcareSystem;
import model.Patient;
import model.PatientDirectory;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.Admin.ManagePatients;
import ui.LoginPanel;

/**
 *
 * @author KishoreKVN
 */
public class AnalyticsReport extends javax.swing.JPanel {
    
    JPanel mainWorkArea;
    HealthcareSystem healthcareSystem;
    /**
     * Creates new form AnalyticsReport
     */
    public AnalyticsReport(JPanel mainWorkArea, HealthcareSystem healthcareSystem) {
        initComponents();
        this.healthcareSystem = healthcareSystem;
        this.mainWorkArea = mainWorkArea;
        populateReportTable();
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
        tblCommunityHealthDetails = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tblCommunityHealthDetails.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblCommunityHealthDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community ", "Patients Count", "Abnormal Cases"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCommunityHealthDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 562, 188));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Community Health Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(lblTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 50));

        btnBack.setBackground(new java.awt.Color(255, 153, 153));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_shutdown_25px.png"))); // NOI18N
        btnBack.setText("Exit");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       mainWorkArea.remove(this);
        
        Component[] components = mainWorkArea.getComponents();
        Component component = components[components.length - 1];
        
        LoginPanel loginScreenPanel = (LoginPanel) component;
        loginScreenPanel.populatePatientsCombo();
        
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea); 
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblCommunityHealthDetails;
    // End of variables declaration//GEN-END:variables
    
    class ReportObj {
        String communityName;
        int patientCount;
        int abnormalCaseCount;
        
    };
    
    private List<ReportObj> getReportTableResultSet(){
        List<ReportObj> reportResultSet = new ArrayList<>();
        List<Community> communities = healthcareSystem.getCity().getCommunities();
        PatientDirectory patientDirectory = healthcareSystem.getPatientDirectory();
        
        //compare houses in each patient obj to match the houses in each community
        for(Community community : communities){
            ReportObj reportObj = new ReportObj();
            reportObj.communityName = community.getName();
            int patientCount = 0;
            int abnormalCaseCount = 0;
            for(Patient patient : patientDirectory.getPatientDirectory()){
                if(patient.getHouse().getCommunityName().equalsIgnoreCase(community.getName())){
                    patientCount++;
                    if(patient.getHealthStatus().equalsIgnoreCase("Abnormal"))
                        abnormalCaseCount++;
                }
            }
            reportObj.patientCount = patientCount;
            reportObj.abnormalCaseCount = abnormalCaseCount;
            reportResultSet.add(reportObj);
        }
        return reportResultSet;
    }
   
    private void populateReportTable() {
        List<ReportObj> reportResultSet = getReportTableResultSet();
        
        DefaultTableModel model = (DefaultTableModel)tblCommunityHealthDetails.getModel();
        model.setRowCount(0);
        
        for(ReportObj r : reportResultSet){
            Object row[] = new Object[3];
            row[0] = r.communityName;   
            row[1] = r.patientCount;
            row[2] = r.abnormalCaseCount;
            model.addRow(row);
        }
    }
    
    
    
}
