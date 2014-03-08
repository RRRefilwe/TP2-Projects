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
public class Payroll {
    
    private List<Employee> employee;
    private int rate;
    private double hourlyRate;
    private double salary;
    private double fees;

    public double getSalary() {
        return salary;
    }
 

    public List<Employee> getEmployee() {
        return employee;
    }

    public int getRate() {
        return rate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getFees() {
        return fees;
    }
    private Payroll(){
        
    }
    private Payroll(Builder builder){
        
        employee = builder.employee;
        rate = builder.rate;
        hourlyRate = builder.hourlyRate;
        salary = builder.salary;
        fees = builder.fees;
    }
    
    public static class Builder{
        
        private List<Employee> employee;
        private int rate;
        private double hourlyRate;
        private double salary;
        private double fees;
        
        public Builder(int rate){
            this.rate = rate;
        }
        public Builder Employee(List employee){
            this.employee = employee;
            return this;
        }
        public Builder HourlyRate(int hourlyRate){
            this.hourlyRate = hourlyRate;
            return this;
        }
        public Builder Salary(double salary){
            this.salary = salary;
            return this;
        }
        public Builder Fees(double fees){
            this.fees = fees;
            return this;
        }
        
        public Payroll build(){
            return new Payroll(this);
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
        final Payroll other = (Payroll) obj;
        if (!Objects.equals(this.employee, other.employee)) {
            return false;
        }
        if (this.rate != other.rate) {
            return false;
        }
        if (Double.doubleToLongBits(this.hourlyRate) != Double.doubleToLongBits(other.hourlyRate)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fees) != Double.doubleToLongBits(other.fees)) {
            return false;
        }
        return true;
    }
    

    
    
}
