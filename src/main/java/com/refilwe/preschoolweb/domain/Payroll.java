/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Fifi
 */
@Entity
public class Payroll implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "payroll_id")
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
    
    public Long getId() {
        return id;
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
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payroll)) {
            return false;
        }
        Payroll other = (Payroll) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Payroll[ id=" + id + " ]";
    }
    
}
