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
public class TreeSetExample2w {
    public static void main(String[] arg)
    {
     TreeSet<String> al=new TreeSet<String>();
        al.add("Tarun");
        al.add("Om");
        al.add("Shishu");
        al.add("Rahul");
        al.add("Soin");
        al.add("Sahib");
        System.out.println("Intial set: "+al);
        System.out.println("Reverse set: "+al.descendingSet());
        System.out.println("Head set: "+al.headSet("Shishu",true));
        System.out.println("Head set: "+al.headSet("Shishu",false));
        System.out.println("SubSet: "+al.subSet("Om", false, "Shishu", true));
        System.out.println("TailSet: "+al.tailSet("Shishu", false));
    }
    
}
