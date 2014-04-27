/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fifi
 */
@Entity
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private String itemName;
    private String itemRef;
    private String type;
    private double costPerItem;
    private int numberOfItem;

    public String getItemName() {
        return itemName;
    }
    
    public String getType(){
        return type;
    }
    
    public String getItemRef() {
        return itemRef;
    }

    public double getCostPerItem() {
        return costPerItem;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }
    
    public Long getId() {
        return id;
    }

    
    private Item(){
        
    }
    private Item(Builder builder){
        
          type = builder.type;
          itemName = builder.itemName;
          itemRef = builder.itemRef;
          costPerItem = builder.costPerItem;
          numberOfItem = builder.numberOfItem;
        
    }
    
    public static class Builder{
        
        
        private String itemName;
        private String type;
        private String itemRef;
        private double costPerItem;
        private int numberOfItem;
        
       public Builder(String value){
           itemName = value;
            
       }
        
       public Builder Type(String t){
           type = t;
           return this;
       }
       
       public Builder ItemRef(String ref){
           itemRef = ref;
           return this;
       }
       
       public Builder CostPerItem(double cost){
           costPerItem = cost;
           return this;
       }
        
       public Builder NumberOfItem(int no){
           numberOfItem = no;
           return this;
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
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Item[ id=" + id + " ]";
    }
    
}
