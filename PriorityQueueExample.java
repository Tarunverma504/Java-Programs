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
public class PriorityQueueExample {
    public static void main(String[] arg)
    {
        PriorityQueue<String> a=new PriorityQueue<String>();
        a.add("Tarun");
        a.add("Om");
        a.add("Rahul");
        a.add("Shishu");
        a.add("Sahib");
        a.add("Soin");
        System.out.println(a);
        System.out.println("head:"+a.element()); 
        System.out.println("head: "+a.peek());
        System.out.println("iterating the queue elements:");  
        Iterator itr=a.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        System.out.println("removing element: "+a.poll());
        System.out.println("After removing: "+a);

    }
    
}
