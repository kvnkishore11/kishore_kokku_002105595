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
public class Community {
    
    private String name;
    private int id;
    private String cityName;
    private List<House> houses;
    
    private static int communityCounter = 0;

    public Community(String name, String cityName) {
        this.name = name;
        this.id = communityCounter++;
        this.cityName = cityName;
        this.houses = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<House> getHouses() {
        return houses;
    }
    
    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
    
    public void addHouseToCommunity(House house){
        houses.add(house);
    }
    
//    public void removeHouseFromCommunity(House house){
//        houses.remove(house);
////        houses.
//    }
    
    public void removeHouseFromCommunity(int index){
        houses.remove(index);
        
    }
    
    public int getNoOfHouses(){
        return houses.size();
    }
    @Override
    public String toString(){
        return name;
    }
    
}
