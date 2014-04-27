/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
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
public class Child implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private Person person;
    private String tagNumber; 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "child_id")
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
    
    public Long getId() {
        return id;
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Child)) {
            return false;
        }
        Child other = (Child) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

  

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Child[ id=" + id + " ]";
    }
    
}
