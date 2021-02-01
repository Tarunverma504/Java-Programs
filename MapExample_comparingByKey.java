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
public class MapExample_comparingByKey {
    public static void main(String[] arg)
    {
        Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"Tarun");    
      map.put(101,"Om");    
      map.put(102,"Rahul");   
      //Returns a Set view of the mappings contained in this map        
      map.entrySet()  
      //Returns a sequential Stream with this collection as its source  
      .stream()  
      //Sorted according to the provided Comparator  
      .sorted(Map.Entry.comparingByKey())  
      //Performs an action for each element of this stream  
      .forEach(System.out::println);  
    }
    
}
