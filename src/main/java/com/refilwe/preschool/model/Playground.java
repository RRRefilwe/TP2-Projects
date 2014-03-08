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
public class Playground {
    
    private String groundName;
    private int seats;
    private String onFieldToy;
    private String maintenanceDay;

    public String getGroundName() {
        return groundName;
    }

    public int getSeats() {
        return seats;
    }

    public String getOnFieldToy() {
        return onFieldToy;
    }

    public String getMaintenanceDay() {
        return maintenanceDay;
    }
    
    private Playground(){
        
    }
    private Playground(Builder builder){
        groundName = builder.groundName;
        maintenanceDay = builder.maintenanceDay;
        seats = builder.seats;
        onFieldToy = builder.onFieldToy;
    
     }
        
    

    
    public static class Builder{
        private String groundName;
        private int seats;
        private String onFieldToy;
        private String maintenanceDay;
        
        public Builder(String groundName){
            
            this.groundName = groundName;
        }
        
        public Builder Seats(int seats){
            this.seats = seats;
            return this;
        }
        
        public Builder OnFieldToy(String onFieldToy){
            this.onFieldToy = onFieldToy;
            return this;
        }
        
        public Builder MaintenanceDay(String maintenanceDay){
            this.maintenanceDay = maintenanceDay;
            return this;
        }
        
     public Playground build(){
        
         return new Playground(this);
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
        final Playground other = (Playground) obj;
        if (!Objects.equals(this.groundName, other.groundName)) {
            return false;
        }
        if (this.seats != other.seats) {
            return false;
        }
        if (!Objects.equals(this.onFieldToy, other.onFieldToy)) {
            return false;
        }
        if (!Objects.equals(this.maintenanceDay, other.maintenanceDay)) {
            return false;
        }
        return true;
        }
    
    }
    
}  

