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
public class Toy {
    
    private String toyName;
    private Date broughtDate;
    private Date warrantyEnd;
    private String toyReference;
    private int numberOfItems;

    public String getToyName() {
        return toyName;
    }

    public Date getBroughtDate() {
        return broughtDate;
    }

    public Date getWarrantyEnd() {
        return warrantyEnd;
    }

    public String getToyReference() {
        return toyReference;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
    private Toy(){
        
    }
    private Toy(Builder builder){
        toyName = builder.toyName;
        broughtDate = builder.broughtDate;
        warrantyEnd = builder.warrantyEnd;
        toyReference = builder.toyReference;
        numberOfItems = builder.numberOfItems;
        
    }
    
    public static class Builder{
        
        private String toyName;
        private Date broughtDate;
        private Date warrantyEnd;
        private String toyReference;
        private int numberOfItems;
        
        public Builder(String toyReference){
            this.toyReference = toyReference;
        }
        public Builder ToyName(String toyName){
            this.toyName = toyName;
            return this;
        }
        
        public Builder BroughtDate(Date broughtDate){
            this.broughtDate = broughtDate;
            return this;
        }
        
        public Builder WarrantyEnd(Date warrantyEnd){
            this.warrantyEnd = warrantyEnd;
            return this;
        }
        
        public Builder NumberOfItems(int numberOfItems){
            this.numberOfItems = numberOfItems;
            return this;
        }
        
        public Toy build(){
            return new Toy(this);
        }
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
        final Toy other = (Toy) obj;
        if (!Objects.equals(this.toyName, other.toyName)) {
            return false;
        }
        if (!Objects.equals(this.broughtDate, other.broughtDate)) {
            return false;
        }
        if (!Objects.equals(this.warrantyEnd, other.warrantyEnd)) {
            return false;
        }
        if (!Objects.equals(this.toyReference, other.toyReference)) {
            return false;
        }
        if (this.numberOfItems != other.numberOfItems) {
            return false;
        }
        return true;
    }
    

    
    
    
    
}
