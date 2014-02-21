/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.service.Impl;

import com.refilwe.service.PcService;
import java.util.ArrayList;

/**
 *
 * @author Fifi
 */
public class PcServiceImpl implements PcService{

    public boolean uninstallProgram(String namOfApp) {
        ArrayList<String> apps = new ArrayList<String>(5);
        apps.add("office");
        apps.add("netbeans");
        apps.add("visio");
        apps.add("vlc");
        apps.add("pastel");
        boolean isUninstall = false;
         for(String value: apps){
             if(value.equals(namOfApp)){
                 apps.remove(namOfApp);
                 isUninstall = true;
             }
         }
        return isUninstall;
    }

    public double calculate(String sign, int value1, int value2) {
        double result = 0;
        if("+".equals(sign))
            result = value1 + value2;
        else
            if("-".equals(sign))
                result = value1 - value2;
        
        return result;                   
    }

    public ArrayList search(String valueTobeSearched) {
        
        ArrayList<String> apps = new ArrayList<String>(5);
        ArrayList<String> apps2 = new ArrayList<String>(5);
        apps.add("office");
        apps.add("netbeans");
        apps.add("visio");
        apps.add("vlc");
        apps.add("pastel");
        
        
        
        for(String name: apps)
        {
         if(apps.contains(valueTobeSearched))
             apps2.add(valueTobeSearched);
             }
            
        return apps2;
        
            
    }
    
}
