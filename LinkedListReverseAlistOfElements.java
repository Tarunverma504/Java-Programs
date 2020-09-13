/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TARUN VERMA
 */
import java.util.*;
public class LinkedListReverseAlistOfElements {
    public static void main(String[] arg)
    {
        LinkedList<String> a=new LinkedList<String>();
        a.add("Tarun");
        a.add("Om");
        a.add("Shishu");
        a.add("Chuchra");
        a.add("Soin");
        Iterator i=a.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    
}
