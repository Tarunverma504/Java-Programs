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
public class HashSetExample1 {
    public static void main(String[] arg)
    {
        HashSet<String> h=new HashSet<String>();
        h.add("Tarun");
        h.add("Om");
        h.add("Shishu");
        h.add("Tarun");
        h.add("Rahul");
        h.add("Soin");
        h.add("Sahib");
        
        System.out.println("Without iterator:-"+h);
        Iterator<String> i=h.iterator();
        System.out.println("With iterator:-");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        h.remove("Soin");  
        System.out.println("After invoking remove(object) method: "+h); 
          h.removeIf(str->str.contains("Sahib"));
          System.out.println("After invoking removeIf() method: "+h);  
          h.clear();  
           System.out.println("After invoking clear() method: "+h);  
    }
    
}
