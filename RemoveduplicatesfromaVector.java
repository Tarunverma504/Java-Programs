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

Write a function named removeDuplicates() that accepts as a parameter

a reference to a Vector of integers,
and modifies it by removing any duplicates.

Note that the elements of the vector are not in any particular order, so the duplicates might not occur consecutively.

You should retain the original relative order of the elements.

Use a Set as auxiliary storage to help you solve this problem.

For example, if a vector named v stores {24, 10, 12, 19, 24, 17, 12, 10, 10, 19, 26, 26}, the call of removeDuplicates(v); should modify it to store {24, 10, 12, 19, 17, 26}.

*/
public class RemoveduplicatesfromaVector {
    public static void main(String[] arg)
    {
        Vector<Integer> v=new Vector<Integer>();
        v.add(24);
        v.add(10);
        v.add(12);
        v.add(19);
        v.add(24);
        v.add(17);
        v.add(12);
        v.add(10);
        v.add(10);
        v.add(19);
        v.add(26);
        v.add(26);
         LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
        a.addAll(v);
        v.clear();
        v.addAll(a);
        System.out.println(v);
    }
    
}
