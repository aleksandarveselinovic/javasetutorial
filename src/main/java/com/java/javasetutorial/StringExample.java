/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javasetutorial;


/**
 * This class shows some basic examples of using String in Java
 * @author aveselinovic
 */
public class StringExample {
    
    public static void main (String[] args) {
        
       int myInt = 4;
       
       String text = null;
       String blank = null;
       String name = null;
       
       final String greeting = text + blank + name;
       
       System.out.println(greeting);
       System.out.println("Hello"+ " "+"Aleksandar");
       System.out.println("My integer is :"+ myInt);
    }
    
}
