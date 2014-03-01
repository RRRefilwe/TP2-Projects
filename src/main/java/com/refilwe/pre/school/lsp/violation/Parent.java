/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.lsp.violation;

/**
 *
 * @author Fifi
 */
public class Parent implements Person{
    
    private double dueAmount;
    private double balance;
    
    private int time;
    private String name;
    private String surname;
    private String idNumber;
    private String contact;

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public int getTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
        
    }

    public String getContact() {
        return this.contact;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setTime(int time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    
    }
    
   
}
