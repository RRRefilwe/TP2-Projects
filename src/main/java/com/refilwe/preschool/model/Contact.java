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
public class Contact {
    
    private String homeTelephone;
    private String workNumber;
    private String cellphone;
    
    private Contact(){
        
    }
    
    private Contact(Builder builder){
     
        homeTelephone = builder.homeTelephone;
        workNumber = builder.workNumber;
        cellphone = builder.cellphone;      
    }
    
    public static class Builder{
        
        private String homeTelephone;
        private String workNumber;
        private String cellphone;
        
        public Builder(String value){
            cellphone = value;
        }
        
        public Builder HomeTelephone(String value){
            
            homeTelephone = value;
            return this;
        }
        public Builder WorkNumber(String value){
            workNumber = value;
            return this;
        }
        
        public Contact build(){
            return new Contact(this);
        }
    }
    
    public String getHomeTelephone() {
        return homeTelephone;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public String getCellphone() {
        return cellphone;
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
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.homeTelephone, other.homeTelephone)) {
            return false;
        }
        if (!Objects.equals(this.workNumber, other.workNumber)) {
            return false;
        }
        if (!Objects.equals(this.cellphone, other.cellphone)) {
            return false;
        }
        return true;
    }
    
 
}
