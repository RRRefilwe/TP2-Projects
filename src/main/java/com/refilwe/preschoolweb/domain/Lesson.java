/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
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
public class Lesson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
     private String lessonName;
    private String objective;
    private int lessonID;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_id")
    private List <Schedule> schedule;
    @OneToOne
    @JoinColumn(name = "lesson_id")
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
    public Long getId() {
        return id;
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lesson)) {
            return false;
        }
        Lesson other = (Lesson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Lesson[ id=" + id + " ]";
    }
    
}
