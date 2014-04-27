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
    
    private int empNumber;
    private String position;
    private Person person;
    private Contact contact;
    private Address address;
   
    
    private Employee(){
        
    }
    
    private Employee(Builder builder){
        
        empNumber = builder.empNumber;
        position = builder.position;
        person = builder.person;
        contact = builder.contact;
        address = builder.address;
        
    }
    
    public static class Builder{
        
       private int empNumber;
       private String position;
       private Person person;
       private Contact contact;
       private Address address;
    
    
       public Builder(String value){
           position = value;
            
       }
        
       public Builder Address(Address a){
           address =a;
           return this;
       }
       
       public Builder EmpNumber(int empNo){
           empNo = empNumber;
           return this;
       }
       
       public Builder Person(Person p){
           person = p;
           return this;
       }
       
       public Builder Contact(Contact c){
           contact = c;
           return this;
       }
       

       
       public Employee build(){
           
           return new Employee(this);
       }
       
    }

    public String getPosition() {
        return position;
    }
    public int getEmpNumber(){
        return empNumber;
    }

    public Person getPerson() {
        return person;
    }

    public Contact getContact() {
        return contact;
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
        if (!Objects.equals(this.empNumber, other.empNumber)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        if (!Objects.equals(this.contact, other.contact)) {
            return false;
        }

        return true;
    }
    
    
}
