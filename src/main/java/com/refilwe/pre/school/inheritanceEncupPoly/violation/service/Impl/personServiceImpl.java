/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.inheritanceEncupPoly.violation.service.Impl;

import com.refilwe.pre.school.inheritanceEncupPoly.violation.Employee;
import com.refilwe.pre.school.inheritanceEncupPoly.violation.service.Menu;
import com.refilwe.pre.school.inheritanceEncupPoly.violation.service.personService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Fifi
 */
public class personServiceImpl implements personService{
    
    private String roomName;
    private int roomNumber;
    private String group;
    private double rates = 0.14;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
     
    
    public Menu GetChildrensMenu(String dayOfweek){
 
        
        Map<String, Menu> map = new HashMap<String, Menu>();
        Menu m = new Menu();
        Menu t = new Menu();
        Menu w = new Menu(); 
        
        m.setCost(35.05);
        m.setDescription("lunch food");
        m.setNumberOfItems(5);
        m.setName("rice");
        m.setType("food");
        m.setNutritions("minerals");
        
        t.setCost(55.00);
        t.setDescription("lunch drink");
        t.setNumberOfItems(10);
        t.setName("oros");
        t.setType("drink");
        t.setNutritions("vitamins");
        
        w.setCost(55.00);
        w.setDescription("lunch drink");
        w.setNumberOfItems(10);
        w.setName("oros");
        w.setType("drink");
        w.setNutritions("vitamins");
        
        map.put("Monday", m);
        map.put("Tuesday", t);
        map.put("Wednesday", w);
        map.put("Thursday", null);
        map.put("Friday", null);
        
        Menu menuOfDay = null;
        if(map.containsKey(dayOfweek)){
              menuOfDay = map.get(dayOfweek);
        }
        
        
            
        return menuOfDay;
        
        
    }

    //public List GetChildrenActivies() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public double getTotalSalary(Employee emp) {
        
        //Map<String, float> rates = HashMap<String, float>();
        //rates.put("Teacher", 0.14);
        //rates.put("cleaner", 0.10);
        //rates.put("Admin", 0.12);
        //rates.put("Accountant", 0.14);
        return emp.getSalary()* rates;

    }

    public String getClassTeacher(Employee emp) {
        
        Map<String, String>group = new HashMap<String, String>();
        group.put("111A", "1A");
        group.put("112B", "1B");
        group.put("113C", "2A");
        group.put("113D", "2B");
        group.put("114E", "3A");
       
      
        String result = "Employee dos not exist";
        if(group.containsKey(emp.getEmpNo())){  
            result = emp.getName()+  " "+ emp.getSurname() + " for "+ group.get(emp.getEmpNo()); 
        }
        
        return result;
    }

    public List getClasses() {       
        
        List classDetails = null;
        classDetails.add(this.group);
        
        return classDetails;
    }
    
 

}
