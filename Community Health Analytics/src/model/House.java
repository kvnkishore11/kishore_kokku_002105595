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
public class House {
    
    private int id;
    private String houseNumber;
    private String streetName;
    private String communityName;
    private int zipCode;
    
    private static int houseCounter = 0;

    public House(String houseNumber, String streetName, String communityName, int zipCode) {
        this.id = houseCounter++;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.communityName = communityName;
        this.zipCode = zipCode;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    
}
