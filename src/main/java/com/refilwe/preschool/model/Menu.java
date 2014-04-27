/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author stud
 */
public class Menu {
    
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
    
    private Menu(){
        
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
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.startTime, other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.endTime, other.endTime)) {
            return false;
        }
        if (!Objects.equals(this.timeOfDay, other.timeOfDay)) {
            return false;
        }
        if (!Objects.equals(this.food, other.food)) {
            return false;
        }
        if (this.numberOfItem != other.numberOfItem) {
            return false;
        }
        return true;
    }
    
        
    }

    
    
    
    
    
    
}
