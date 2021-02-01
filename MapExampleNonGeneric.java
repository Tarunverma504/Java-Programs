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
public class MapExampleNonGeneric {
    public static void main(String[] arg)
    {
        Map m=new HashMap();
        m.put(1,"Tarun");
        m.put(2,"Om");
        m.put(3,"Shishu");
        m.put(4,"Rahul");
        //Traversing Map  
        Set set=m.entrySet();
        System.out.println(set);
        //Converting to Set so that we can traverse 
        Iterator itr=set.iterator();  
        while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next(); 
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
        
        
    }
    
}
