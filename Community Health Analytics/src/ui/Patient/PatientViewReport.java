/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Patient;

import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KishoreKVN
 */
public class PatientViewReport extends javax.swing.JPanel {
    
    JPanel workArea;
    Patient patient;
    /**
     * Creates new form PatientViewReport
     */
    public PatientViewReport(JPanel workArea, Patient patient) {
        initComponents();
        this.workArea = workArea;
        this.patient = patient;
        
        refreshTable();
    }
    
    public void refreshTable() {
        EncounterHistory encounterHistory = patient.getEncounterHistory() ;
        
        DefaultTableModel model = (DefaultTableModel)tblEncounterDetails.getModel();
        model.setRowCount(0);
        
        for(Encounter e : encounterHistory.getEncounterHistory()){
            Object row[] = new Object[3];
            row[0] = e;   
            row[1] = e.getVitalSign().getBloodPressure();
            row[2] = e.getCurrentHealthStatus();    
            model.addRow(row);
        }
        
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
        tblEncounterDetails = new javax.swing.JTable();
        btnViewMoreDetails = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tblEncounterDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Encounter Date", "Blood pressure", "Results"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncounterDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 708, 188));

        btnViewMoreDetails.setBackground(new java.awt.Color(255, 255, 204));
        btnViewMoreDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewMoreDetails.setForeground(new java.awt.Color(0, 51, 255));
        btnViewMoreDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_view_35px.png"))); // NOI18N
        btnViewMoreDetails.setText("View Details");
        btnViewMoreDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMoreDetailsActionPerformed(evt);
            }
        });
        add(btnViewMoreDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("My Reports");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(lblTitle1)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewMoreDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMoreDetailsActionPerformed
        
        int selectedRow = tblEncounterDetails.getSelectedRow();
        if(selectedRow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Encounter selectedEncounter = (Encounter) tblEncounterDetails.getValueAt(selectedRow, 0);
        
        ViewEncounterDetails vd = new ViewEncounterDetails(workArea, selectedEncounter);
        workArea.add("ViewEncounterDetails", vd);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewMoreDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewMoreDetails;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblEncounterDetails;
    // End of variables declaration//GEN-END:variables
}
