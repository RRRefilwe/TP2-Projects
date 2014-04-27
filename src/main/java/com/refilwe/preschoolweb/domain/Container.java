/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Fifi
 */
@Entity
public class Container implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
     private int compartments;
    private String containerRef;
    private int size;
    @OneToMany
    @JoinColumn(name = "container_id")
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
    
    public Long getId() {
        return id;
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Container)) {
            return false;
        }
        Container other = (Container) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Container[ id=" + id + " ]";
    }
    
}
