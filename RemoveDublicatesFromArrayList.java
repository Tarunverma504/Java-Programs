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
import java .util.*;
public class RemoveDublicatesFromArrayList {
    public static void removeDuplicates(ArrayList<String> a)
        {
          LinkedHashSet<String> l=new LinkedHashSet<String>();
          l.addAll(a);
          a.clear();
          a.addAll(l);
        }
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<n)
        {
          al.add(sc.next());
          i++;
        }

        System.out.println("Before Remove Duplicate elements:"+al);
        removeDuplicates(al);
        System.out.println("After Removing duplicate elements:"+al);
 
}
    
}
