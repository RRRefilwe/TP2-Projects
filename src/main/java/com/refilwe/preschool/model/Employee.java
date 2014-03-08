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
public class Employee {
    
    private String position;
    private Person person;
    private Contact contact;
    private Demography demography;
    
    private Employee(){
        
    }
    
    private Employee(Builder builder){
        position = builder.position;
        person = builder.person;
        contact = builder.contact;
        demography = builder.demography;
    }
    
    public static class Builder{
        
       private String position;
       private Person person;
       private Contact contact;
       private Demography demography;
    
       public Builder(String value){
           position = value;
            
       }
        
       public Builder Person(Person p){
           person =p;
           return this;
       }
       
       public Builder Contact(Contact c){
           contact = c;
           return this;
       }
       
       public Builder Demography(Demography demo){
           demography = demo;
           return this;
       }
       
       public Employee build(){
           
           return new Employee(this);
       }
       
    }

    public String getPosition() {
        return position;
    }

    public Person getPerson() {
        return person;
    }

    public Contact getContact() {
        return contact;
    }

    public Demography getDemography() {
        return demography;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }
        if (!Objects.equals(this.demography, other.demography)) {
            return false;
        }
        return true;
    }
    
    
}
