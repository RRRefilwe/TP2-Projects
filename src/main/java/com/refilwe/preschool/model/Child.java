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
public class Child {
    
    private Person person;
    private String tagNumber;
    private Parent parent;

    public Person getPerson() {
        return person;
    }

    public String getTagNumber() {
        return tagNumber;
    }
     
    public Parent getParent() {
        return parent;
    }   
     private Child(){
         
     }
     private Child(Builder builder){
         
         person = builder.person;
         tagNumber = builder.tagNumber;
         parent = builder.parent;
         
     }  
     
    public static class Builder{
        private Person person;
        private Parent parent;
        private String tagNumber;
        
        public Builder(String t){
            tagNumber = t;
        }
        
        public Builder Person(Person p){
            person = p;
            return this;
        }
        
        public Builder Parent(Parent p){
            parent = p;
            return this;
        }
        public Child build(){
            return new Child(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Child other = (Child) obj;
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        
        if (!Objects.equals(this.parent, other.parent)) {
            return false;
        }
        if (!Objects.equals(this.tagNumber, other.tagNumber)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
}
