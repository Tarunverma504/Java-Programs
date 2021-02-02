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
public class Hashset_from_another_collection {
    public static void main(String[] arg)
    {
        ArrayList<String> h=new ArrayList<String>();
        h.add("Tarun");
        h.add("Om");
        h.add("Shishu");
        h.add("Tarun");
        h.add("Rahul");
        h.add("Soin");
        h.add("Sahib");
        HashSet<String> a=new HashSet(h);
        System.out.println(a);
    }
    
}
