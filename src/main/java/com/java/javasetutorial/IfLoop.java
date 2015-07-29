/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javasetutorial;
import  com.java.javasetutorial.util.TutorialConstants;
/**
 * A little programm which says if declared number is even or odd
 * @author aveselinovic
 */
public class IfLoop {
    
      
    public static void main(String[] args){
        
        int num = 5;
        final int moduloIndex = 2;
        
        if (num % moduloIndex == 0){
            System.out.println(num + TutorialConstants.EVEN_NUMBER);
        } 
        else {
            System.out.println(num + TutorialConstants.ODD_NUMBER);
        }
        
    }
    
}
