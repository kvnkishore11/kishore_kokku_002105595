
package ui.Admin;

import model.Community;
import model.HealthcareSystem;
import model.House;
import model.Patient;
import model.PatientDirectory;
import ui.Patient.CreatePatient;
import ui.Patient.ViewPatientProfile;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author KishoreKVN
 */
public class ManagePatients extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PatientDirectory patientDirectory;
    HealthcareSystem healthcareSystem;
    List<Community> communities;
    /** Creates new form ManageSuppliers */
    public ManagePatients(JPanel upc, HealthcareSystem healthcareSystem) {
        initComponents();
        this.userProcessContainer = upc;
        this.patientDirectory = healthcareSystem.getPatientDirectory();
        this.healthcareSystem = healthcareSystem;
        this.communities = healthcareSystem.getCity().getCommunities();
        refreshTable();
    }
    
    public void refreshTable() {
        
        DefaultTableModel model = (DefaultTableModel)tblPatients.getModel();
        model.setRowCount(0);
        
        for(Patient p : patientDirectory.getPatientDirectory()) {
            Object row[] = new Object[2];
            row[0] = p;
            row[1] = p.getEncounterHistory().size() == 0 ? "None" 
                    : p.getEncounterHistory().getEncounterHistory().get(p.getEncounterHistory().size() - 1).getEncounterDate();
            model.addRow(row);
        }
    }
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tblPatients.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient Name", "Last encounter date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 578, 188));

        btnRemove.setBackground(new java.awt.Color(255, 51, 51));
        btnRemove.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_remove_35px.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, 40));

        btnView.setBackground(new java.awt.Color(255, 204, 204));
        btnView.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_view_35px.png"))); // NOI18N
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 160, 40));

        btnAdd.setBackground(new java.awt.Color(102, 102, 255));
        btnAdd.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_user_group_man_man_35px_1.png"))); // NOI18N
        btnAdd.setText("Add Patient");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 150, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("List of Patients");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addComponent(lblTitle1)
                .addGap(431, 431, 431))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        CreatePatient cp = new CreatePatient(userProcessContainer, healthcareSystem);
        userProcessContainer.add("CreatePatient", cp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        int row = tblPatients.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Patient p  = (Patient)tblPatients.getValueAt(row, 0);
        ViewPatientProfile vp = new ViewPatientProfile(userProcessContainer, p);
        userProcessContainer.add("ViewPatientProfile", vp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        int row = tblPatients.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Patient selectedPatient = (Patient)tblPatients.getValueAt(row, 0);
        House houseToBeDeAssociated = selectedPatient.getHouse();
        String community_selectedPatient_is_associated = houseToBeDeAssociated.getCommunityName();
        Community community = null;
        int houseIndex = 0;
        
        for(int i = 0; i < communities.size(); i++){
            if(communities.get(i).getName().equalsIgnoreCase(community_selectedPatient_is_associated))
                community = communities.get(i);
        }
        
        for(int i = 0; i < community.getNoOfHouses(); i++){
            if(community.getHouses().get(i).getId() == houseToBeDeAssociated.getId()){
                houseIndex = i;
            }
                
        }
        
        community.removeHouseFromCommunity(houseIndex);
        patientDirectory.removePatient(selectedPatient);
        JOptionPane.showMessageDialog(null, "Patient record deleted successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        refreshTable();
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables

}
