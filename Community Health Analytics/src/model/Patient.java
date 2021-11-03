/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author KishoreKVN
 */
public class Patient extends Person{
    
    int patientId=0;
    EncounterHistory encounterHistory;  
    
    String healthStatus; 
    
    //private static int patientCounter = 0;

    public Patient(String name, long phone, String email, int age, String houseNumber, String streetName, String communityName, int zipCode, int patientId) {
        super(name, phone, email, age, houseNumber, streetName, communityName, zipCode);
        //this.patientId = patientId;
        this.encounterHistory = new EncounterHistory();
        this.healthStatus = "Normal";
    }
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    public void updateHealthStatus(){
        int lastEncounterCount = encounterHistory.getEncounterHistory().size();
        setHealthStatus(encounterHistory.getEncounterHistory().get(lastEncounterCount - 1).getCurrentHealthStatus());
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
