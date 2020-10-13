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
public class StackIterationExample2 {
    /*
    By forEach() method
    */
    public static void main(String[] arg)
    {
        Stack<Integer> s=new Stack<>();
        s.push(119);
        s.push(2002);
        s.push(18);
        s.forEach(n->
        {
            System.out.println(n);
        });
        
    }
    
}
