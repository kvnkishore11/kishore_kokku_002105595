/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KishoreKVN
 */
public class PatientDirectory {
    
    private List<Patient> patientDirectory;

    public PatientDirectory() {
        this.patientDirectory = new ArrayList<>();
    }
    
    public List<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(List<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public void addPatient(Patient p){
        patientDirectory.add(p);
    }
    
    public void removePatient(Patient p) {
        patientDirectory.remove(p);
    }
}
