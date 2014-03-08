/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author stud
 */
public class Employeetest {
    
    public Employeetest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Employee() {
         Contact con = new Contact.Builder("0833896148").HomeTelephone("011 755 1291").WorkNumber("0219293454").build();
         Demography d = new Demography.Builder(24).Gender("Female").Race("Black").build();
         Address a = new Address.Builder(1779).PhysicalAddress("29 Mosidi").PostalAddress("PO Box A29").build();
         Person p = new Person.Builder("Naledi").surname("Nbila").id("901245088085").Demography(d).address(a).built();
         
         Employee e = new Employee.Builder("SalesPerson").Contact(con).Demography(d).Person(p).build();
         
         Assert.assertEquals(e, e);
         Assert.assertEquals("SalesPerson", e.getPosition());
         
     
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
