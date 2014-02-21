/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.config;

import com.refilwe.service.Impl.PcServiceImpl;
import com.refilwe.service.PcService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Fifi
 */
@Configuration
public class Config {
    @Bean(name = "search" )
    public PcService getService(){
        return new PcServiceImpl();
    }
    
    
}
