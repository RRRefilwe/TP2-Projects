/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fifi
 */
@Entity
public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private Date scheduleDate;
    private String startTime;
    private String endTime;
    private String weekDay;
    private String group;

    public String getStartTime() {
        return startTime;
    }

    public Date getScheduleDate() {
        return scheduleDate;
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
        
        scheduleDate = builder.scheduleDate;
        group = builder.group;
        startTime = builder.startTime;
        endTime = builder.endTime;
        weekDay = builder.weekDay;
        
    }
    
    public static class Builder{
        
        private Date scheduleDate;
        private String startTime;
        private String endTime;
        private String weekDay;
        private String group;
        
        public Builder(String weekDay){
            
        }
        
        public Builder ScheduleDate(Date scheduleDate){
            this.scheduleDate = scheduleDate;
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

    public Long getId() {
        return id;
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
        if (!(object instanceof Schedule)) {
            return false;
        }
        Schedule other = (Schedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Schedule[ id=" + id + " ]";
    }
    
}
