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
public class Address {
    
    private String physicalAddress;
    private String postalAddress;
    private int postalCode;


    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public int getPostalCode() {
        return postalCode;
    }
    
    private Address(){
        
    }
    
    private Address(Builder builder){
        
        physicalAddress = builder.physicalAddress;
        postalAddress = builder.postalAddress;
        postalCode = builder.postalCode;
  
    }
    
    public static class Builder{
        
        private String physicalAddress;
        private String postalAddress;
        private int postalCode;
        
        public Builder(int postalC){
            postalCode = postalC;
        }
        
        public Builder PhysicalAddress(String pAddress){
            physicalAddress = pAddress;
            return this;
        }
        public Builder PostalAddress(String postalA){
            postalAddress = postalA;
            return this;
        }
        
        public Address build(){
            return new Address(this);
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.physicalAddress, other.physicalAddress)) {
            return false;
        }
        if (!Objects.equals(this.postalAddress, other.postalAddress)) {
            return false;
        }
        if (this.postalCode != other.postalCode) {
            return false;
        }
        return true;
    }
    
    
    
    
   
}
