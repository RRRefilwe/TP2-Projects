/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.service.Impl;

import com.refilwe.service.FruitTesterService;
import java.util.ArrayList;

/**
 *
 * @author Fifi
 */
public class FruitTesterServiceImpl implements FruitTesterService{

    public String FruitORNot(String food) {
        String result = "";
        ArrayList<String> list = new ArrayList<String>(2);
        list.add("Tomato");
        list.add("watermellon");
        
        for(String foods: list){
            if(foods.equals(list))
               result="veg&fruit";
            else
                result = "notConfused";
            
        }
        return result;
    }
    
}
