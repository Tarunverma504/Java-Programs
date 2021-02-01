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
public class MapExampleGeneric {
    public static void main(String[] arg)
    {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Tarun");  
        map.put(101,"Om");  
        map.put(102,"Rahul");
        for(Map.Entry m:map.entrySet())
        {  
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }
    
}
