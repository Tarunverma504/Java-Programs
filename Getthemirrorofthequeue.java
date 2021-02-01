/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.*;

/**
 *
 * @author Mind_Coder
 */

/*

Write a function named mirrorQueue() that accepts

a reference to a queue of strings as a parameter
and appends the queue's contents to itself in reverse order.

For example, if a queue named q stores {"Code", "Quotient"}, the call of mirrorQueue(q); should change it to store {"Code", "Quotient", "Quotient", "Code"}.

*/
public class Getthemirrorofthequeue {
    public static void main(String[] arg)
    {
        Queue<String> a=new LinkedList<String>();
        a.add("Code");
        a.add("Quotient");
        ArrayList<String> b=new ArrayList<String>();
         int c=a.size()-1;
         
         b.addAll(a);
         while(c>=0)
         {
             b.add(b.get(c));
             c--;
         }
         a.clear();
         a.addAll(b);
         System.out.println(a);
  
    }
    
}
