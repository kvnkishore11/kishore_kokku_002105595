/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KishoreKVN
 */
public class VitalSign {
    
    private int respiratoryRate;
    private int bloodPressure;
    private int heartRate;

    public VitalSign(int respiratoryRate, int bloodPressure, int heartRate) {
        this.respiratoryRate = respiratoryRate;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
    }
    
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    
    
}
