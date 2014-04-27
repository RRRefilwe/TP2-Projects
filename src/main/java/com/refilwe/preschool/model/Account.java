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
 * @author Fifi
 */
public class Account {
    
    private double monthlyAmount;
    private int paymentRef;
    private Date dayOfPayment;
     

    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public int getPaymentRef() {
        return paymentRef;
    }

    public Date getDayOfPayment() {
        return dayOfPayment;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (Double.doubleToLongBits(this.monthlyAmount) != Double.doubleToLongBits(other.monthlyAmount)) {
            return false;
        }
        if (this.paymentRef != other.paymentRef) {
            return false;
        }
        if (!Objects.equals(this.dayOfPayment, other.dayOfPayment)) {
            return false;
        }
        return true;
    }
    
    
}
