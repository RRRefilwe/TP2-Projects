/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe;

import com.refilwe.config.Config;
import com.refilwe.service.MowingService;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class mowingTest {
    
    public static MowingService mowingservice;
    
    public mowingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void mowTest() {

            Assert.assertEquals(4.0, mowingservice.CMcube(2, 2), 0);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        mowingservice = (MowingService)ctx.getBean("mowing");

    
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
