/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author stud
 */
public class Container {
    
    private int compartments;
    private String containerRef;
    private int size;
    private List <Item> item;

    public int getCompartments() {
        return compartments;
    }

    public String getContainerRef() {
        return containerRef;
    }

    public int getSize() {
        return size;
    }
    public List getItem() {
        return item;
    }
    
    private Container(){
        
    }
    
    private Container(Builder builder){
        
       compartments = builder.compartments;
       containerRef = builder.containerRef;
       item = builder.item;
       size = builder.size;
    }

    public static class Builder{
        
        private int compartments;
        private String containerRef;
        private List<Item> item;
        private int size;
        
        
        public Builder(String ref){
            containerRef = ref;
        }
        
        public Builder Compartments(int com){
            compartments = com;
            return this;
        }
        
        public Builder Item(List i){
            item = i;
            return this;
        }
        
        public Builder Size(int s){
            size = s;
            return this;
        }
        public Container build(){
           
           return new Container(this);
       }
        
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Container other = (Container) obj;
        if (this.compartments != other.compartments) {
            return false;
        }
        if (!Objects.equals(this.containerRef, other.containerRef)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        return true;
    }
    

     
    
}
