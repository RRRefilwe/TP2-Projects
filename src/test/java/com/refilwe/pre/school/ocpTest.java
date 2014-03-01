/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school;

import com.refilwe.pre.school.config.Config;
import com.refilwe.pre.school.ocp.obey.service.OCPObeyService;
import com.refilwe.pre.school.ocp.violation.service.OCPViolationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
public class ocpTest {
    
    public ocpTest() {
    }
     private static OCPViolationService opcvservice;
     private static OCPObeyService opcoservice;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void violation() {
         
         Assert.assertEquals(opcvservice.getActivity("9:00"), "breakfast");
     
     }
     @Test
     public void obey() {
         
         Assert.assertEquals(opcoservice.getActivity("9:00:00"), "breakfast");
        
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        opcvservice = (OCPViolationService)ctx.getBean("ocpViolation");
        opcoservice = (OCPObeyService)ctx.getBean("ocpObey");
        
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
