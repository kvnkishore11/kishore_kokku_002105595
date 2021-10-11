/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class FleetOfCars {
    
    private ArrayList<Car> allCars;
    public String lastUpdated;
    
    
    
    public FleetOfCars(){
        
        this.allCars = new ArrayList<Car>();
        this.lastUpdated = String.valueOf(new Date());
    }

    public ArrayList<Car> getAllCars() {
        return allCars;
    }

    public void setAllCars(ArrayList<Car> allCars) {
        this.allCars = allCars;
    }
    
     public Car addNewCar(){
        Car newCar = new Car();
        allCars.add(newCar);
        this.lastUpdated = String.valueOf(new Date());
        return newCar;
            
    }
     
       public void deleteCar(Car c){
    
        allCars.remove(c);
        this.lastUpdated = String.valueOf(new Date());
    }
         
    public void updateCar(int index,Car cd)
    {
        
        allCars.set(index,cd);
    
    }

    public String firstCar() {
        //To change body of generated methods, choose Tools | Templates.
        Car first = allCars.get(0);
        return first.nameOfCar + first.modelName ;

        
    }
    
    public int NumberofCars(){
    
        for (Car c : allCars.)
    }
    
    
    
}
