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
public class Item {
    
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }

        if (!Objects.equals(this.itemRef, other.itemRef)) {
            return false;
        }
        
        if (Double.doubleToLongBits(this.costPerItem) != Double.doubleToLongBits(other.costPerItem)) {
            return false;
        }
        if (this.numberOfItem != other.numberOfItem) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
       
        return true;
    }
    

          
    
}
