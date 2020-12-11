/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
public class VectorExample3 {
    public static void main(String[] arg)
    {
        Vector<Integer> a=new Vector<Integer>();
        a.add(100);  
        a.add(200);  
        a.add(300);  
        a.add(200);  
        a.add(400);  
        a.add(500);  
        a.add(600);  
        a.add(700);  
        System.out.println("Values in vector: " +a);  
        System.out.println("Remove first occourence of element 200: "+a.remove((Integer)200));  
        a.remove((Integer)200);
        System.out.println("Values in vector: " +a);
        System.out.println("Element at index 1 is = "+a.get(1));  
        
    }
    
}
