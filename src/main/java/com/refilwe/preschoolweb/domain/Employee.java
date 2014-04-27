/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Fifi
 */
@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int empNumber;
    private String position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Person person;
    @Embedded
    private Contact contact;
    @Embedded
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

    public Long getId() {
        return id;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Employee[ id=" + id + " ]";
    }
    
}
