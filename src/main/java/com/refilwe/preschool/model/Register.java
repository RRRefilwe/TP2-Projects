/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author stud
 */
public class Register {
    
    private String grade;
    private Date date;
    private Lesson lesson;
    private Child child;

    public String getGrade() {
        return grade;
    }

    public Date getDate() {
        return date;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Child getChild() {
        return child;
    }
    
    private Register(){
        
    }
    
    private Register(Builder builder){
        
    }
    
    public static class Builder{
        
        private String grade;
        private Date date;
        private Lesson lesson;
        private Child child;
        
        public Builder (String g){
            grade = g;
        }
        
        public Builder CurrentDate(Date d){
            date = d;
            return this;
        }
        public Builder Lesson(Lesson l){
            lesson = l;
            return this;
        }
        public Builder Child(Child c){
            child = c;
            return this;
        }
        public Register build(){
            return new Register(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Register other = (Register) obj;
        if (!Objects.equals(this.grade, other.grade)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.lesson, other.lesson)) {
            return false;
        }
        return true;
    }
    

    
    
}
