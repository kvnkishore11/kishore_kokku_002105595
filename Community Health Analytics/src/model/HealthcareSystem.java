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
public class HealthcareSystem {
    
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    City city;

    public HealthcareSystem() {
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        city = new City("Boston");
    }
    
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
}
