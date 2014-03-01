/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.config;

import com.refilwe.pre.school.dip.obey.service.ActivityService;
import com.refilwe.pre.school.dip.obey.service.Impl.ActivityServiceImpl;
import com.refilwe.pre.school.inheritanceEncupPoly.violation.Person;
import com.refilwe.pre.school.lsp.obey.Impl.ChildServiceImpl;
import com.refilwe.pre.school.lsp.obey.Impl.EmployeeServiceImpl;
import com.refilwe.pre.school.lsp.obey.Impl.ParentServiceImpl;
import com.refilwe.pre.school.lsp.obey.PersonService;
import com.refilwe.pre.school.ocp.obey.service.Impl.OCPObeyServiceImpl;
import com.refilwe.pre.school.ocp.obey.service.OCPObeyService;
import com.refilwe.pre.school.ocp.violation.service.Impl.OCPViolationServiceImpl;
import com.refilwe.pre.school.ocp.violation.service.OCPViolationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Fifi
 */
@Configuration
public class Config {
    
    
    @Bean(name = "ocpViolation")
    public OCPViolationService getOCPViolationService()
    {
        return new OCPViolationServiceImpl();
        
        
    }
    @Bean(name = "ocpObey")
    public OCPObeyService getOCPObeyService()
    {
        return new OCPObeyServiceImpl();
    }
    @Bean(name = "dipObey")
    public ActivityService getActivityService(){
        
        return new ActivityServiceImpl();
    }
    
   @Bean(name = "lspObey1")
    public PersonService getChildService(){
        
        return new ChildServiceImpl();
    }
  
    @Bean(name = "lspViolation")
    public Person getPersonService(){
        
        return new Person();
    } 
    @Bean(name = "ispViolaton")
    public Person getIspPeronService(){
        return new Person();
    }
    @Bean(name = "ispObey")
    public PersonService getIspPersonService(){
        
        return new ChildServiceImpl();
    }
  
}
