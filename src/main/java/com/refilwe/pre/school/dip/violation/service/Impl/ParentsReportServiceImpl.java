/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.pre.school.dip.violation.service.Impl;

import com.refilwe.pre.school.dip.violation.service.Impl.ClassLessonsServiceImpl;

/**
 *
 * @author Fifi
 */
public class ParentsReportServiceImpl {
    
    private ClassLessonsServiceImpl lessons;
    public ClassLessonsServiceImpl getLessons(){
        return lessons;
    } 
    public void setClasslesson(ClassLessonsServiceImpl lessons){
        this.lessons = lessons;
    }
}
