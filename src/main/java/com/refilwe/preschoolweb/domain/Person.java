/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fifi
 */
@Entity
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    

    private String firstname;
    private String surname;
    @Embedded
    private Demography demography;
    
    private Person(){
        
    }
    
     private Person(Builder builder){
         
         
         firstname = builder.firstname;
         surname = builder.surname;
         demography = builder.demography;
        
         
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Person[ id=" + id + " ]";
    }
    
}
