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
public class VectorExample2 {
    public static void main(String[] arg)
    {
        Vector<String> a=new Vector<String>();
        a.add("Tarun");
        a.add("Om");
        a.add("Shishu");
        //Adding elements using addElement() method of Vector  
        a.addElement("Rahul");
        a.addElement("Shivam");
        a.addElement("Sahib");
        System.out.println("Size: "+a.size());
        System.out.println("Capacity: "+a.capacity());
        System.out.println("Elements: "+a);
        if(a.contains("Tarun"))
        {
            System.out.println("Tarun found at the index: "+a.indexOf("Tarun"));
            
        }
        else
        {
            System.out.println("Tarun is not present");
        }
        System.out.println("First element: "+a.firstElement());
        System.out.println("Last element: "+a.lastElement());
        a.remove("Shivam");
        System.out.println("After remove shivam: "+a);
        
        
        
    }
    
}
