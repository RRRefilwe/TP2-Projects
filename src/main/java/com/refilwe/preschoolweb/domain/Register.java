/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Fifi
 */
@Entity
public class Register implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String grade;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    @OneToOne
    @JoinColumn(name = "register_id")
    private Lesson lesson;
    @OneToMany
    @JoinColumn(name = "register_id")
    private List<Child> child;

    public String getGrade() {
        return grade;
    }

    public Date getDate() {
        return date;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public List getChild() {
        return child;
    }
    
    public Long getId() {
        return id;
    }
    
    private Register(){
        
    }
    
    private Register(Builder builder){
        grade = builder.grade;
        date = builder.date;
        lesson = builder.lesson;
        child = builder.child;
           
        
    }
    
    public static class Builder{
        
        private String grade;
        private Date date;
        private Lesson lesson;
        private List<Child> child;
        
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
        public Builder Child(List c){
            child = c;
            return this;
        }
        public Register build(){
            return new Register(this);
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
        if (!(object instanceof Register)) {
            return false;
        }
        Register other = (Register) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Register[ id=" + id + " ]";
    }
    
}
