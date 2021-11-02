
package ui.Admin;


import model.Community;
import model.HealthcareSystem;
import model.House;
import model.Patient;
import model.PatientDirectory;
import ui.Patient.CreatePatient;
import ui.Patient.ViewPatientProfile;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getPatientId();
            row[2] = p.getAge();
            row[3] = p.getPhone();
            row[4] = p.getEncounterHistory().size() == 0 ? "None" 
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
        btnAddCSV = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tblPatients.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient Id", "Age", "Phone", "Last encounter date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 660, 450));

        btnRemove.setBackground(new java.awt.Color(255, 51, 51));
        btnRemove.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_remove_35px.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 390, 150, 40));

        btnView.setBackground(new java.awt.Color(255, 204, 204));
        btnView.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_view_35px.png"))); // NOI18N
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 160, 40));

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
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 150, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("List of Patients");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(lblTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 60));

        btnAddCSV.setText("Add CSV");
        btnAddCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCSVActionPerformed(evt);
            }
        });
        add(btnAddCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, -1, -1));
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

    private void btnAddCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCSVActionPerformed
        // TODO add your handling code here:


        String path = "C:\\Users\\LENOVO\\Desktop\\patients.csv";
        String line = "";

       try{
        BufferedReader br;
        br = new BufferedReader(new FileReader(path));
        
        int i = 0;
        int patientId=0;
        String name = ""; long phone= 0;
        String email=""; int age = 0;
        String houseNumber = "";
        String streetName = "";
        String communityName = "";
        int zipCode = 0;
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
          
        while((line=br.readLine()) != null){
            String[] values = line.split(",");
            Patient p = new Patient(patientId, name,phone, email, age,houseNumber, streetName,communityName,zipCode);
               
            if (! arrlist.contains(Integer.parseInt(values[0]))){
                p.setPatientId(Integer.parseInt(values[0]));
                p.setName(values[1]);
                p.setAge(Integer.parseInt(values[2]));
                p.setPhone(Long.parseLong(values[3]));
                p.setEmail(values[4]);
              //  p.setHouseNumber(Integer.parseInt(values[5]));
                
                patientDirectory.addPatient(p);
                i++;
                arrlist.add(Integer.parseInt(values[0]));
                 }
                
            }
            
        JOptionPane.showMessageDialog(this, String.valueOf(i) + " Patients are added into Patient Directory");
        refreshTable();
          
       } 
   
        catch ( FileNotFoundException e){
            JOptionPane.showMessageDialog(this, "The error message has been caught");
         } 
         catch (IOException ex)
         {
             
         }

        

    }//GEN-LAST:event_btnAddCSVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCSV;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables

}
