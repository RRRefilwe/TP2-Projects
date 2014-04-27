/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.List;
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
public class Parent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nextOfKinName;
    private String nextOKinID;
    private String companyName;
    @Embedded
    private List<Contact> contact;
    @Embedded
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
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
    public Account getAccount() {
        return account;
    }

    public List getContact() {
        return contact;
    }
    
    public Address getAddress(){
        return address;
    }

    public Person getPerson() {
        return person;
    }
    
    public Long getId() {
        return id;
    }
    
    private Parent(){
        
    }

    private Parent(Builder builder){
        
        nextOfKinName = builder.nextOfKinName ;
        nextOKinID = builder.nextOfKinName;
        companyName = builder.companyName;
        companyName = builder.companyName;
        address = builder.address;
        contact = builder.contact;
        account = builder.account;
        person = builder.person; 
        
    }
    
    public static class Builder{
        
        private String nextOfKinName;
        private String nextOKinID;
        private String companyName;
        private List <Contact> contact;
        private Address address;
        private Account account;
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
        
        public Builder Address(Address a){
            address = a;
            return this;
        }
        
        public Builder List(List value){
            contact = value;
            return this;
        }
        
        public Builder Account(Account a){
            account = a;
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parent)) {
            return false;
        }
        Parent other = (Parent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Parent[ id=" + id + " ]";
    }
    
}
