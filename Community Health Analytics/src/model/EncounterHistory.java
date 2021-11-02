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
public class EncounterHistory {
    
    List<Encounter> encounterHistory;

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<>();
    }
    
    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(List<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public int size(){
        return encounterHistory.size();
    }
    
    
    
    
}
