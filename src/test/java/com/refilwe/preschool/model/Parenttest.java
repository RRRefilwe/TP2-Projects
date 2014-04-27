/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.ArrayList;
import java.util.List;
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
public class Parenttest {
    
    public Parenttest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void Parent() {
         Contact con = new Contact.Builder("0729000458").HomeTelephone("0218889000").WorkNumber("0219293545").build();
         Demography d = new Demography.Builder(24).Gender("Female").Race("Black").build();
         Address a = new Address.Builder(1779).PhysicalAddress("29 Mosidi").PostalAddress("PO Box A29").build();
         Person p = new Person.Builder("Tshidi").surname("Mlaza").id("9012049400084").Demography(d).built();
         ArrayList<Contact> conta = new ArrayList<>();
         conta.add(con);
         
         Parent par = new Parent.Builder("PetroSA").NextOfKinName("Dikeledi").NextOKinID("9012080048088").Person(p).Address(a).List(conta).build();
         
         Assert.assertEquals("PetroSA", par.getCompanyName());
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
