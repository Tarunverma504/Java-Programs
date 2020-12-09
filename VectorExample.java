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
public class VectorExample {
    public static void main(String[] arg)
    {
        Vector<String> a=new Vector<String>();
        //Adding elements using add() method of List
        a.add("Tarun");
        a.add("Om");
        a.add("Shishu");
        //Adding elements using addElement() method of Vector  
        a.addElement("Rahul");
        a.addElement("Shivam");
        a.addElement("Sahib");
        System.out.println(a);
    }
    
}
