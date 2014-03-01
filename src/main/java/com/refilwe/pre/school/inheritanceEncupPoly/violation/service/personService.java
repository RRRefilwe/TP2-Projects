/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.inheritanceEncupPoly.violation.service;

import com.refilwe.pre.school.inheritanceEncupPoly.violation.Employee;
import java.util.List;

/**
 *
 * @author Fifi
 */
public interface personService {
    
    //public List GetChildrenActivies();
    public Menu GetChildrensMenu(String dayOfweek);
    public double getTotalSalary(Employee emp);
    public String getClassTeacher(Employee emp);   
     public List getClasses();
   
}
