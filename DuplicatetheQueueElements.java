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

Write a function named doubleQueue() that accepts

a reference to a queue of integers as a parameter
and replaces every element with two copies of itself.

For example, if a queue named q stores {11, 12, 13}, the call of doubleQueue(q); should change it to store {11, 11, 12, 12, 13, 13}.

Constraints: Do not use any auxiliary collections as storage.

*/
public class DuplicatetheQueueElements {
    public static void main(String[] arg)
    {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(11);
        q.add(12);
        q.add(13);
        int a=q.size();
        while(a!=0)
        {
          int temp=q.peek();
          q.add(temp);
          q.add(temp);
          q.remove();
          a--;
        }
        while(q.peek() != null)
        {
          System.out.print(" " + q.remove());
        }
    }
}
