
package ui.Patient;

import model.Patient;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.LoginPanel;

/**
 *
 * @author  KishoreKVN
 */
public class PatientJPanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    Patient patient;

    public PatientJPanel(JPanel mainWorkArea, Patient patient) {
        
        this.mainWorkArea = mainWorkArea;
        this.patient = patient;
        
        initComponents();
        if(patient != null)
            lblWelcome.setText("Welcome to NEU Healthcare System " + patient.getName());
        else
            lblWelcome.setText("Welcome to NEU Healthcare System ");
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuBar = new javax.swing.JPanel();
        btnViewProfile = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnReports = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(50);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitPane.setPreferredSize(new java.awt.Dimension(1000, 100));

        menuBar.setBackground(new java.awt.Color(153, 153, 255));
        menuBar.setPreferredSize(new java.awt.Dimension(1000, 100));

        btnViewProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_view_35px.png"))); // NOI18N
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(255, 153, 153));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_shutdown_25px.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblWelcome.setText("<WelcomeMsg>");

        btnReports.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_combo_chart_50px.png"))); // NOI18N
        btnReports.setText("Reports");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnViewProfile)
                .addGap(80, 80, 80)
                .addComponent(btnReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(28, 28, 28))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(lblWelcome)
                    .addComponent(btnReports)
                    .addComponent(btnViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuBar);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        add(splitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        
        ViewPatientProfile vp = new ViewPatientProfile(workArea, patient);
        workArea.add("ViewPatientProfile", vp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
     
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        
        mainWorkArea.remove(this);
        
        Component[] components = mainWorkArea.getComponents();
        Component component = components[components.length - 1];
        
        LoginPanel loginScreenPanel = (LoginPanel) component;
        loginScreenPanel.populatePatientsCombo();
        
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
                
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        
        PatientViewReport patientViewReport = new PatientViewReport(workArea, patient);
        workArea.add("PatientViewReport", patientViewReport);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnReportsActionPerformed

    @Override
    public String toString(){
        return "Patient";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
    
}
