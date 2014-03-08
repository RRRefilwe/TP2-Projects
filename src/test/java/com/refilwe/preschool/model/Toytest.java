/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.Date;
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
public class Toytest {
    
    public Toytest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Toy() {
         Date d = new Date("11/06/2013");
         Date warranty = new Date("11/12/2013");
         Toy t = new Toy.Builder("E1234567").ToyName("Ball").NumberOfItems(10).BroughtDate(d).WarrantyEnd(warranty).build();
     
         Assert.assertNotNull(t);
         Assert.assertEquals(t.getToyReference(), "E1234567");
         Assert.assertEquals(t.getToyName(), "Ball");
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
