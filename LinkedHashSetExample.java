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
public class LinkedHashSetExample {
    public static void main(String[] arg)
    {
        LinkedHashSet<String> h=new LinkedHashSet();
        h.add("Tarun");
        h.add("Om");
        h.add("Shishu");
        h.add("Tarun");
        h.add("Rahul");
        h.add("Soin");
        h.add("Sahib");
        Iterator<String> i=h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    
}
