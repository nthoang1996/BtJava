/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demostringformat;

/**
 *
 * @author Hoang IT
 */
public class Main {
    public static void main(String args[]){
    // create a StringBuilder object 
        StringBuilder str = new StringBuilder(); 
        str.append("Hello. ");
  
        // print string capacity 
        System.out.println("Init string, "
                           + "method capacity = "
                           + str.capacity()); 
        str.append("My name is ANCDEASDASDASDASDASDASDASDASDASDASDASDASDASDASDASDASDASD");
        System.out.println("After append long string, "
                           + "method capacity = "
                           + str.capacity());
  
        // apply ensureCapacity() 
        str.ensureCapacity(100); 
  
        // print string capacity 
        System.out.println("After ensureCapacity"
                           + " method capacity = "
                           + str.capacity()); 
        System.out.println(str);
        
        // apply ensureCapacity() 
        str.ensureCapacity(400); 
        System.out.println("After ensureCapacity (big limit)"
                           + " method capacity = "
                           + str.capacity()); 
    }
}
