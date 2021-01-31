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
public class FliptheOddElementsofQueue {
    static void showq(Queue<Integer> q)
    {
        System.out.print("Result:-");
      while(q.peek() != null)
      {
        System.out.print(" " + q.remove());
      }
    }
    static void flipHalfQueue(Queue<Integer> q)
    {
            Stack<Integer> s=new Stack<Integer>();
      int n=q.size();
      int j=0,i=0;
      for(Integer x:q)
      {
        if(j%2!=0)
        {
          s.push(x);
        }
        j++;
      }
      for(i=0;i<n;i++)
      {
        if(i%2==0)
        {
          q.add(q.poll());
        }
        else
        {
          q.poll();
          q.add(s.pop());
        }
      }
    }
    public static void main(String[] arg)
    {
        Queue <Integer> q = new LinkedList<Integer>();
        Scanner s=new Scanner(System.in);
        int n,t;
        t=s.nextInt();
        while(t>0)
        {
          n=s.nextInt();
          q.add(n);
          t=t-1;
        }
        flipHalfQueue(q);
        showq(q);
    }
    
}
