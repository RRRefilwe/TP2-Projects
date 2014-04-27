/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.test.repository;

import com.refilwe.preschoolweb.app.config.ConnectionConfig;
import com.refilwe.preschoolweb.domain.Person;
import com.refilwe.preschoolweb.repository.PersonRepository;
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
public class PersonRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    private PersonRepository repo;
    
    
    public PersonRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createPerson() {
         repo = ctx.getBean(PersonRepository.class);
         Person p = new Person.Builder("Refilwe")
                 .surname("Radebe")
                 .Demography(null)
                 .built();
         
         repo.save(p);
         id = p.getId();
         Assert.assertNull(p);

     }
     
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
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
