/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.javasetutorial;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aveselinovic
 */
public class Gui {
    
    
    public static void main(String[] args){
        
        JFrame frame = new JFrame();
        
        JButton button = new JButton("hello world");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(400,400);
        frame.setVisible(true);
    
}
    
}
