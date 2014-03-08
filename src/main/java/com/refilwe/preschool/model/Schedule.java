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
public class Schedule {
    
    private Lesson lesson;
    private Activity activity;
    private String startTime;
    private String endTime;
    private String weekDay;
    private String group;
    

    public Lesson getLesson() {
        return lesson;
    }
    public Activity getActivity(){
        return activity;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public String getGroup() {
        return group;
    }
    
    private Schedule(){
        
    }
    
    private Schedule(Builder builder){
        
        lesson = builder.lesson;
        activity = builder.activity;
        group = builder.group;
        startTime = builder.startTime;
        endTime = builder.endTime;
        weekDay = builder.weekDay;
    }
    
    public static class Builder{
        
        private Lesson lesson;
        private Activity activity;
        private String startTime;
        private String endTime;
        private String weekDay;
        private String group;
        
        public Builder(String weekDay){
            
        }
        public Builder Lesson(Lesson lesson){
            this.lesson = lesson;
                   return this;
        }
         public Builder Activity(Activity activity){
            this.activity = activity;
                   return this;
        }
        public Builder StartTime(String startTime){
            this.startTime = startTime;
                   return this;
        }
        public Builder EndTime(String endTime){
            this.endTime = endTime;
                   return this;
        }
        public Builder WeekDay(String weekDay){
            this.weekDay = weekDay;
                   return this;
        }
        public Builder Group(String group){
            this.group = group;
                   return this;
        }
        
        public Schedule build(){
            return new Schedule(this);
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
        final Schedule other = (Schedule) obj;
        if (!Objects.equals(this.lesson, other.lesson)) {
            return false;
        }
        if (!Objects.equals(this.startTime, other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.activity, other.activity)) {
            return false;
        }
        if (!Objects.equals(this.endTime, other.endTime)) {
            return false;
        }
        if (!Objects.equals(this.weekDay, other.weekDay)) {
            return false;
        }
        if (!Objects.equals(this.group, other.group)) {
            return false;
        }
        return true;
    }
    

    
    
}
