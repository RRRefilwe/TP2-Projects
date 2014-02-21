/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.service;

import java.util.ArrayList;

/**
 *
 * @author Fifi
 */
public interface PcService {
    public boolean uninstallProgram(String namOfApp);
    public double calculate(String sign, int value1, int value2);
    public ArrayList search(String valueTobeSearched);
    
}
