/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.refilwe.config.Config;
import com.refilwe.service.FruitTesterService;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class testFruit {
    
    
    public testFruit() {
    }
    private static FruitTesterService fruitservice;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void pcTesting() {
         String expected = "notConfused";
         Assert.assertSame(expected,fruitservice.FruitORNot("orange"));
         Assert.assertEquals("notConfused", fruitservice.FruitORNot("orange"));
     }
     

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        fruitservice = (FruitTesterService)ctx.getBean("fruittest");
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
