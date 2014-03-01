/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.isp.obey.Impl;

import com.refilwe.pre.school.lsp.obey.ChildService;

/**
 *
 * @author Fifi
 */
public class ChildServiceImpl implements ChildService{
    
    private int age;
    private int time;
    private String name;
    private String surname;
    private String idNumber;
    private String contact;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    
    
    public int getTime() {
        return this.time;
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
         this.time = time;
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
