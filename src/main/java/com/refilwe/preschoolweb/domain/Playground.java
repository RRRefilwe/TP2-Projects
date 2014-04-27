/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fifi
 */
@Entity
public class Playground implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
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
    
    public Long getId() {
        return id;
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
  }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Playground)) {
            return false;
        }
        Playground other = (Playground) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Playground[ id=" + id + " ]";
    }
    
}
