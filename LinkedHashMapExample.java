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
public class LinkedHashMapExample {
    public static void main(String[] arg)
    {
        LinkedHashMap<Integer,String> a=new LinkedHashMap<Integer,String>();
        a.put(100,"Tarun");
        a.put(101,"Om");
        a.put(102,"Rahul");
        a.put(103,"Shishu");
        a.put(104,"Sahib");
        a.put(105,"Shivam");
        System.out.println(a);
        System.out.println();
        for(Map.Entry m:a.entrySet())
        {
            System.out.println(m.getKey()+" - "+m.getValue());
            
        }
    }
    
}
