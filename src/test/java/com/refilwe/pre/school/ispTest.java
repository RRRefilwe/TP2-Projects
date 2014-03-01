/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school;

import com.refilwe.pre.school.inheritanceEncupPoly.violation.Person;
import com.refilwe.pre.school.isp.obey.EmployeeService;
import com.refilwe.pre.school.isp.obey.PersonService;
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
public class ispTest {
    
    public ispTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
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
