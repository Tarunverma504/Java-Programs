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
public class TreeSetExample1 {
    public static void main(String[] arg)
    {
        TreeSet<String> al=new TreeSet<String>();
        al.add("Tarun");
        al.add("Om");
        al.add("Shishu");
        al.add("Rahul");
        al.add("Soin");
        al.add("Sahib");
        Iterator<String> i= al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("Traversing in the descending order:-");
        Iterator x=al.descendingIterator();
        while(x.hasNext())
        {
            System.out.println(x.next());
        }
        System.out.println("Highest Value: "+al.pollFirst());
        System.out.println("Lowest Value: "+al.pollLast());
    }
    
}
