/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.isp.obey;

/**
 *
 * @author Fifi
 */
public interface ParentService extends PersonService{
    

    public void setDueAmount(double dueAmount);
    
    public void setBalance(double balance);

    public String getName();

    public void setName(String name);

    public String getSurname();

    public void setSurname(String surname);

    public String getContact();

    public void setContact(String contact) ;

    public String getIdNumber();

    public void setIdNumber(String idNumber) ;
   
    public double getDueAmount();
    
    public double getBalance();
}
