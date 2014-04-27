/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Fifi
 */
@Entity
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    @Temporal(javax.persistence.TemporalType.DATE)
     private Date date;
     private String startTime;
     private String endTime;
     private String timeOfDay;
     private String food;
     private int numberOfItem;
        

    public Date getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public String getFood() {
        return food;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }
    
    public Long getId() {
        return id;
    }
    
    private Menu(){
        
    }
        
    private Menu(Builder builder){
        date = builder.date;
        startTime = builder.startTime;
        endTime = builder.endTime;
        timeOfDay = builder.timeOfDay;
        food= builder.food;
        numberOfItem = builder.numberOfItem;
    }   
        
    public static class Builder{
        
        private Date date;
        private String startTime;
        private String endTime;
        private String timeOfDay;
        private String food;
        private int numberOfItem;
            
       public Builder(String value){
           startTime = value;   
        }
       public Builder Date(Date d){
           date = d;
           return this;
       }
       public Builder StartTime(String start){
           startTime = start;
           return this;
       }
       public Builder EndTime(String end){
           endTime = end;
           return this;
       }
       public Builder TimeOfDay(String time){
           timeOfDay = time;
           return this;
       }
       public Builder Food(String f){
           food = f;
           return this;
       }
       public Builder NumberOfItem(int no){
           numberOfItem = no;
           return this;
       }
       public Menu build(){
           return new Menu(this);
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
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Menu[ id=" + id + " ]";
    }
    
}
