/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.ocp.obey.service.Impl;

import com.refilwe.pre.school.ocp.obey.service.OCPObeyService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fifi
 */
public class OCPObeyServiceImpl implements OCPObeyService{
    
    public String getActivity(String currentDate){
        Map<String, String> act = new HashMap<String, String>();
        act.put("9:00:00" ,"breakfast");
        act.put("10:00:00" ,"lessons");
        act.put("12:00:00" ,"lunch");
        act.put("1:00:00" ,"playground");
        act.put("2:00:00" ,"snacks");
        act.put("4:00:00" ,"cleanup");
        
        String result = null;
        
        if(act.containsKey(currentDate))
            result = act.get(currentDate);
        
        return result;
    }
    
}
