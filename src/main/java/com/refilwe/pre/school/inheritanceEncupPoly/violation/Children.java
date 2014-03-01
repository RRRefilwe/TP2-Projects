/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.inheritanceEncupPoly.violation;

import java.util.ArrayList;

/**
 *
 * @author Fifi
 */
public class Children extends Person{
    
    private int age;
    private String address;
    private ArrayList menu;
    private ArrayList activity;
    
    public ArrayList getMenu() {
        return menu;
    }

    public void setMenu(ArrayList menu) {
        this.menu = menu;
    }

    public ArrayList getActivity() {
        return activity;
    }

    public void setActivity(ArrayList activity) {
        this.activity = activity;
    }
    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
