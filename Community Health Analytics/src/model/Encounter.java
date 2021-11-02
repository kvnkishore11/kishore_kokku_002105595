
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author KishoreKVN
 */
public class Encounter {
    
    private Patient patient;
    private Date encounterDate;
    private String[] compaints; // make default array size as 3
    private String diagnosis;
    private VitalSign vitalSign;
    private String currentHealthStatus; 
    private int age;
    
    public Encounter() {
        this.compaints = new String[3];
//        this.vitalSign = new VitalSign();
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String[] getCompaints() {
        return compaints;
    }

    public void setCompaints(String[] compaints) {
        this.compaints = compaints;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    public void setCurrentHealthStatus(String currentHealthStatus) {
        this.currentHealthStatus = currentHealthStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
    
    public void setHealthStatus(){

//        calculateAgeAtEncounter();
        
        if(isBloodPressureNormal(this.getAge(), this.vitalSign.getBloodPressure())){
            this.setCurrentHealthStatus("Normal");
        }else{
            this.setCurrentHealthStatus("Abnormal");
        }
        
    }

    public Boolean isBloodPressureNormal(int age, int bloodPressure){
        if (age == 0) {
            if (bloodPressure >= 50 && bloodPressure <= 70) {
                return true;
            }
            return false;
        } else if (age == 1) {
            if (bloodPressure >= 70 && bloodPressure <= 100) {
                return true;
            }
            return false;
        } else if (age > 1 && age <= 3) {
            if (bloodPressure >= 80 && bloodPressure <= 110) {
                return true;
            }
            return false;
        } else if (age > 3 && age <= 5) {
            if (bloodPressure >= 80 && bloodPressure <= 110) {
                return true;
            }
            return false;
        } else if (age >= 6 && age <= 12) {
            if (bloodPressure >= 80 && bloodPressure <= 120) {
                return true;
            }
            return false;
        } else {
            if (bloodPressure >= 110 && bloodPressure <= 120) {
                return true;
            }
            return false;
        }
    }
    
//    public void calculateAgeAtEncounter(){
//        Date firstDate = this.patient.getDateOfBirth();
//        Date secondDate = encounterDate;
//        
//        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
//        long ageInYrs = TimeUnit.MILLISECONDS.toDays(diffInMillies)/ 365l;
//        setAgeAtEncounter((int) ageInYrs);
//    }
    
    @Override
    public String toString(){
        return String.valueOf(new SimpleDateFormat("MM/dd/yyyy").format(encounterDate));
    }
}
