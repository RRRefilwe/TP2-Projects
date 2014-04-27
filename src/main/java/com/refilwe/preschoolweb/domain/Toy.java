/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Fifi
 */
@Entity
public class Toy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String toyName;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date broughtDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date warrantyEnd;
    private String toyReference;
    private int numberOfItems;

    public String getToyName() {
        return toyName;
    }

    public Date getBroughtDate() {
        return broughtDate;
    }

    public Date getWarrantyEnd() {
        return warrantyEnd;
    }

    public String getToyReference() {
        return toyReference;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
    
    public Long getId() {
        return id;
    }
    
    private Toy(){
        
    }
    private Toy(Builder builder){
        toyName = builder.toyName;
        broughtDate = builder.broughtDate;
        warrantyEnd = builder.warrantyEnd;
        toyReference = builder.toyReference;
        numberOfItems = builder.numberOfItems;
        
    }
    
    public static class Builder{
        
        private String toyName;
        private Date broughtDate;
        private Date warrantyEnd;
        private String toyReference;
        private int numberOfItems;
        
        public Builder(String toyReference){
            this.toyReference = toyReference;
        }
        public Builder ToyName(String toyName){
            this.toyName = toyName;
            return this;
        }
        
        public Builder BroughtDate(Date broughtDate){
            this.broughtDate = broughtDate;
            return this;
        }
        
        public Builder WarrantyEnd(Date warrantyEnd){
            this.warrantyEnd = warrantyEnd;
            return this;
        }
        
        public Builder NumberOfItems(int numberOfItems){
            this.numberOfItems = numberOfItems;
            return this;
        }
        
        public Toy build(){
            return new Toy(this);
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
        if (!(object instanceof Toy)) {
            return false;
        }
        Toy other = (Toy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Toy[ id=" + id + " ]";
    }
    
}
