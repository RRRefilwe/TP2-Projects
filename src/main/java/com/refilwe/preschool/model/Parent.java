/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author stud
 */
public class Parent {
    
        
    private String nextOfKinName;
    private String nextOKinID;
    private String companyName;
    private List<Contact> contact;
    private Child child;
    private Person person;
    

    public String getNextOfKinName() {
        return nextOfKinName;
    }

    public String getNextOKinID() {
        return nextOKinID;
    }
    
        public String getCompanyName() {
        return companyName;
    }
    public Child getChild(){
        return child;
    }

    public List getContact() {
        return contact;
    }

    public Person getPerson() {
        return person;
    }
    
    private Parent(){
        
    }

    private Parent(Builder builder){
        
        nextOfKinName = builder.nextOfKinName ;
        nextOKinID = builder.nextOfKinName;
        companyName = builder.companyName;
        companyName = builder.companyName;
        contact = builder.contact;
        child = builder.child;
        person = builder.person; 
        
    }
    
    public static class Builder{
        
        private String nextOfKinName;
        private String nextOKinID;
        private String companyName;
        private List <Contact> contact;
        private Child child;
        private Person person;
        
        public Builder(String value){
            companyName = value;
        }
        
        public Builder NextOfKinName(String value){
            nextOfKinName = value;
            return this;
        }
        
        public Builder NextOKinID(String value){
            nextOKinID = value;
            return this;
        }
        
        public Builder List(List value){
            contact = value;
            return this;
        }
        
        public Builder Child(Child value){
            child = value;
            return this;
        }
        
        public Builder Person(Person value){
            person = value;
            return this;
        }
        
        
        public Parent build(){
            return new Parent(this);
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
        final Parent other = (Parent) obj;
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }
        if (!Objects.equals(this.companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        return true;
    }
    
}
