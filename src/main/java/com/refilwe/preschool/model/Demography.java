/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.Objects;

/**
 *
 * @author stud
 */
public class Demography {

    private int age;
    private String race;
    private String gender;
    
    private Demography(){
        
    }
    
    private Demography(Builder builder){
        age = builder.age;
        gender = builder.gender;
        race = builder.gender;
    }
    
    
    
    public static class Builder{
        
        private int age;
        private String race;
        private String gender;
        
        public Builder(int value){
            age = value;
        }
        
        public Builder Race(String value){
            race = value;
            return this;
        }
        public Builder Gender(String value){
            gender = value;
            return this;
        }
        
        public Demography build(){
            return new Demography(this);
        }
        
    }
    
    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }
   
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Demography other = (Demography) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }
    
}
