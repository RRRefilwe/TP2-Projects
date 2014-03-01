/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.dip.violation.service.Impl;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fifi
 */
public class ActivityServiceImpl {
    
    public String games(String dayOfWeek){
        Map<String, String>games = new HashMap<String, String>();
        games.put("Monday", "Soccer");
        games.put("Tuesday", "Tennis");
        games.put("Wednesday", "Running");
        games.put("Thursday", "ballet");
        games.put("Friday", "Hippop");
        
        String result = null;
        
        if(games.containsKey(dayOfWeek))
            result = games.get(dayOfWeek);
        return result;
    }
     public String lesson( String dayOfWeek){
        
        Map<String, String>l = new HashMap<String, String>();
        l.put("Monday", "Maths, English");
        l.put("Tuesday", "Natural Science, English");
        l.put("Wednesday", "Reading, Maths");
        l.put("Thursday", "Art, English ");
        l.put("Friday", "Art, Maths");
        
        String result = null;
        
        if(l.containsKey(dayOfWeek))
            result = l.get(dayOfWeek);
        return result;
    }
        
    
    
    public String objective(String dayOfWeek){
        
        Map<String, String>obj = new HashMap<String, String>();
        obj.put("Monday", "Understand logigal thinking");
        obj.put("Tuesday", "Understanding nature and flexibility");
        obj.put("Wednesday", "Developing indepandendace");
        obj.put("Thursday", "Fun yet disciplined");
        obj.put("Friday", "Understanding calculated fun");
        
        String result = null;
        
        if(obj.containsKey(dayOfWeek))
            result = obj.get(dayOfWeek);
        return result;
    }
    
}
