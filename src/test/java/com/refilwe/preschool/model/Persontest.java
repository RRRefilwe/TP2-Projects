/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import org.testng.Assert;
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
public class Persontest {
    
    public Persontest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void person() {
         
         Person p = new Person.Builder("Refilwe").surname("Radebe").id("AA11").Demography(null).address(null).built();
         Assert.assertEquals(p.getFirstname(), "Refilwe");
         Assert.assertEquals(p.getSurname(), "Radebe");
         Assert.assertNotEquals(p.getId(), "BB22");
         Assert.assertNull(p.getDemography());
         Assert.assertNull(p.getAddress());
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
