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
import javax.persistence.OneToOne;

/**
 *
 * @author Fifi
 */
@Entity
public class Activity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  
    private String actName;
    private String objective;
    private String description;
    @OneToMany
    @JoinColumn(name = "activity_id")
    private List<Toy> toy;
    @OneToMany
    @JoinColumn(name = "activity_id")
    private List<Schedule> schedule;
    @OneToOne
    @JoinColumn(name = "activity_id")
    private Playground playground;

    public String getActName() {
        return actName;
    }
    
    public List getSchedule (){
        return schedule;
    }

    public String getObjective() {
        return objective;
    }

    public String getDescription() {
        return description;
    }

    public List getToy() {
        return toy;
    }
    
    public Long getId() {
        return id;
    }


    public Playground getPlayground() {
        return playground;
    }
    
    private Activity(){
        
    }
    
    private Activity(Builder builder){
        actName = builder.actName;
        description = builder.description;
        objective = builder.objective;
        toy = builder.toy;
        schedule = builder.schedule;
        playground = builder.playground;
    }
    
    public static class Builder{
        
        private String actName;
        private String objective;
        private String description;
        private List<Toy> toy;
        private List<Schedule> schedule;
        private Playground playground;
        
        public Builder(String actName){
            this.actName = actName;
        }
        
        public Builder Objective(String objective){
            this.objective = objective;
            return this;
        }
        
        public Builder Description(String description){
            this.description = description;
            return this;
        }
        
        public Builder Toy(List toy){
            this.toy = toy;
            return this;
        }
        public Builder Playground(Playground playground){
            this.playground = playground;
            return this;
        }
        
        public Builder Schedule(List s){
            this.schedule = s;
            return this;
        }
        
        public Activity build(){
            return new Activity(this);
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
        if (!(object instanceof Activity)) {
            return false;
        }
        Activity other = (Activity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Activity[ id=" + id + " ]";
    }
    
}
