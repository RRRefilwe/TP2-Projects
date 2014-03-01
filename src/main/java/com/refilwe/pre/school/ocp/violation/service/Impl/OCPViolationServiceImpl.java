/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.ocp.violation.service.Impl;

import com.refilwe.pre.school.ocp.violation.service.OCPViolationService;

/**
 *
 * @author Fifi
 */
public class OCPViolationServiceImpl implements OCPViolationService{
    
    public String getActivity(String time){
        String result = null;
        
        if("9:00".equals(time)) {
            result = "breakfast";
        } else if("10:00".equals(time)){
            result = "lessons";
        }
            else if("12:00".equals(time)){
                 result = "lunch";
            }
                 else if("1:00".equals(time)){
                    result = "playground";     
                 }
                 else if("4:00".equals(time)){
                     result = "cleanup";
                 }
                else
                    return result;
        return result;
    }  
  
   }
    

