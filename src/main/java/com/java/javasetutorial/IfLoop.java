/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javasetutorial;

/**
 * A little programm which says if declared number is even or odd
 * @author aveselinovic
 */
public class IfLoop {
    
    // Here we play with static String variables,will talk more abotu later
    static final String result_string_odd = " is odd number";
    static final String result_string_even = " is even number";
      
    public static void main(String[] args){
        
        int num = 5;
        
        if (num % 2 == 0){
            System.out.println(num + result_string_even);
        } 
        else {
            System.out.println(num + result_string_odd);
        }
        
    }
    
}
