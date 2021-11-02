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
public class PersonDirectory {
    
    List<Person> personDirectory;
    
    public PersonDirectory() {
        this.personDirectory = new ArrayList<>();
    }
    
    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(List<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    
}
