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
public class Activity {
    
    private String actName;
    private String objective;
    private String description;
    private List<Toy> toy;
    private Playground playground;

    public String getActName() {
        return actName;
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
        playground = builder.playground;
    }
    
    public static class Builder{
        
        private String actName;
        private String objective;
        private String description;
        private List<Toy> toy;
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
        
        public Activity build(){
            return new Activity(this);
        }
                
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Activity other = (Activity) obj;
        if (!Objects.equals(this.actName, other.actName)) {
            return false;
        }
        if (!Objects.equals(this.objective, other.objective)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.toy, other.toy)) {
            return false;
        }
        if (!Objects.equals(this.playground, other.playground)) {
            return false;
        }
        return true;
    }
    

    
    
    
    
}
