/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school;

import com.refilwe.pre.school.config.Config;
import com.refilwe.pre.school.dip.obey.service.ActivityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class dipTest {
    
    public dipTest() {
    }
     private static ActivityService activityService;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
 @Test
     public void obey() {
         
         Assert.assertEquals(activityService.games("Monday"), "Soccer");
         Assert.assertNull(activityService.games("Mon"));
         Assert.assertEquals(activityService.lesson("Monday"), "Maths, English");
         Assert.assertEquals(activityService.objective("Friday"), "Understanding calculated fun");
                 
      }
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        activityService = (ActivityService)ctx.getBean("dipObey");
        
        
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
