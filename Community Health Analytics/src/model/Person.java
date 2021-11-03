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
public class Person {
    
    String name=null;
    long phone=0;
    String email=null;
    int age=0;
    House house=null;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Person(String name, long phone, String email, int age,
            String houseNumber, String streetName, String communityName, int zipCode) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.house = new House(houseNumber, streetName, communityName, zipCode);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
