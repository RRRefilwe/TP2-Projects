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
public class Childtest {
    
    public Childtest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Child() {
         
         Demography d = new Demography.Builder(10).Gender("Female").Race("Black").build();
         Address a = new Address.Builder(1779).PhysicalAddress("293 ModisaOtsile").PostalAddress(null).build();
         Person p = new Person.Builder("Musa").surname("Radebe").id("2012030094088").Demography(d).address(a).built();
         
         Child c = new Child.Builder("A001").Person(p).build();
         Assert.assertEquals("A001", c.getTagNumber());
         Assert.assertNotSame(c, c.getPerson());
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
