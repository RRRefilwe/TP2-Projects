/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Fifi
 */
@Entity
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private double monthlyAmount;
    private int paymentRef;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dayOfPayment;
     
    
    private Account(){
        
    }
    
    private Account(Builder builder){
        
        monthlyAmount = builder.monthlyAmount;
        paymentRef = builder.paymentRef;
        dayOfPayment = builder.dayOfPayment;
     
    }
     
    
    public static class Builder{
        
        private double monthlyAmount;
        private int paymentRef;
        private Date dayOfPayment;
        
        public Builder(int paymentRef){
            this.paymentRef = paymentRef;
        }
        
        public Builder DayOfPayment(Date dayOfPayment){
            this.dayOfPayment = dayOfPayment;
            return this;
        }
        
        public Builder MonthlyAmount(double monthlyAmount){
            this.monthlyAmount = monthlyAmount;
            return this;
        }
    
    }

    
    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public int getPaymentRef() {
        return paymentRef;
    }

    public Date getDayOfPayment() {
        return dayOfPayment;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Account[ id=" + id + " ]";
    }
    
}
