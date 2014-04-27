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
public class Person {
    
    private String firstname;
    private String surname;
    private String id;
    private Demography demography;
    
    private Person(){
        
    }
    
     private Person(Builder builder){
         
         
         firstname = builder.firstname;
         surname = builder.surname;
         demography = builder.demography;
         id = builder.id;
         
    }
     
    public static class Builder{
        
        private String firstname;
        private String surname;
        private String id;
        private Demography demography;
        
        public Builder(String value){
            
            firstname = value;
        }
        
        
        public Builder surname(String value){
            surname = value;
            return this;
        }
   
       public Builder id(String id){
            this.id = id;
            return this;
       }

       public Builder Demography(Demography demo){
           demography = demo;
           return this;
       }
       
       public Person built(){
           return new Person(this);
       }
       
    }

    public Demography getDemography() {
        return demography;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.demography, other.demography)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    

    
    
}
