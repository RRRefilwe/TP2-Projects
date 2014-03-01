/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school;

import com.refilwe.pre.school.config.Config;
import com.refilwe.pre.school.inheritanceEncupPoly.violation.Person;
import com.refilwe.pre.school.lsp.obey.ChildService;
import com.refilwe.pre.school.lsp.obey.EmployeeService;
import com.refilwe.pre.school.lsp.obey.ParentService;
import com.refilwe.pre.school.lsp.obey.PersonService;
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
public class lspTest {
    
    public lspTest() {
    }
  
    private static PersonService personService;
    private static EmployeeService empService;
    private static Person person;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
 @Test
     public void obey() {
         
         Assert.assertEquals(personService.getIdNumber(), null);
         Assert.assertNull(personService.getIdNumber());
         Assert.assertEquals(empService.getTime(), null);
      }
 @Test
     public void violation() {
         
         Assert.assertEquals(person.getName(), null);
         
         Assert.assertNull(person.getName());
      }
    @BeforeClass
    public static void setUpClass() throws Exception {
      ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        personService = (PersonService)ctx.getBean("lspObey1"); 
        person = (Person)ctx.getBean("lspViolation");
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
