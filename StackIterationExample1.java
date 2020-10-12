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
public class StackIterationExample1 {
    public static void main(String[] arg)
    {
        Stack s=new Stack();
        s.push("Tarun");
        s.push("Om");
        s.push("Shishu");
        s.push("Rahul");
        s.push("Sahib");
        s.push("Shivam");
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    
}
