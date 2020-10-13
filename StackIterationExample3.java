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
public class StackIterationExample3 {
    public static void main(String[] arg)
    {
        Stack<Integer> s=new Stack<>();
        s.push(119);
        s.push(98);
        s.push(14);
        ListIterator<Integer> i=s.listIterator(s.size());
        while(i.hasPrevious())
        {
            Integer avg=i.previous();
            System.out.println(avg);
        }
    }
    
}
