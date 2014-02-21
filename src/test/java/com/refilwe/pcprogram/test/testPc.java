/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pcprogram.test;

import com.refilwe.config.Config;
import com.refilwe.service.PcService;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class testPc {
    
    
    public testPc() {
    }
    private static PcService pcservice;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void pcTesting() {
         Assert.assertEquals(pcservice.uninstallProgram("Office"),false);
         Assert.assertEquals(pcservice.calculate("+",180,3005),3185, 0);
         //Assert.assertTrue(pcservice.uninstallProgram("office"));
         Assert.assertFalse(pcservice.uninstallProgram("Eclipse"));
     
     }
     

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        pcservice = (PcService)ctx.getBean("search");
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
