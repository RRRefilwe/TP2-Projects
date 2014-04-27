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
public class Lesson {
    
    private String lessonName;
    private String objective;
    private int lessonID;
    private List <Schedule> schedule;
    private Room room;

    public String getLessonName() {
        return lessonName;
    }
    
    public List getSchedule (){
        return schedule;
    }

    public String getObjective() {
        return objective;
    }

    public int getLessonID() {
        return lessonID;
    }

    public Room getRoom() {
        return room;
    }
    
    private Lesson(){
        
    }
    
    private Lesson(Builder builder){
        lessonName = builder.lessonName;
        objective = builder.objective;
        lessonID = builder.lessonID;
        room = builder.room;
        
    }
    
    public static class Builder{
        
        private String lessonName;
        private String objective;
        private int lessonID;
        private List<Schedule> schedule;
        private Room room;
        
        public Builder(int lessonID){
            
            this.lessonID = lessonID; 
        }
        
        public Builder LessonName(String lessonName){
            this.lessonName = lessonName;
            return this;
        }
        public Builder Objective(String objective){
            this.objective = objective;
            return this;
        }
        
        public Builder Schedule(List s){
            this.schedule = s;
            return this;
        }
        
        public Builder Room(Room room){
            this.room = room;
            return this;
        }
        
        public Lesson build(){
            return new Lesson(this);
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
        final Lesson other = (Lesson) obj;
        if (!Objects.equals(this.lessonName, other.lessonName)) {
            return false;
        }
        if (!Objects.equals(this.objective, other.objective)) {
            return false;
        }
        if (this.lessonID != other.lessonID) {
            return false;
        }
        if (this.schedule != other.schedule) {
            return false;
        }
        if (!Objects.equals(this.room, other.room)) {
            return false;
        }
        return true;
    }
    

    
    
    
}
