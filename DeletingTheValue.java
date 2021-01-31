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
public class DeletingTheValue {
    public static void main(String[] arg)
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            l.add(scan.nextInt());
        }
        int a=scan.nextInt();
        l.remove(a);
         for(int i=0;i< l.size();i++)
    {
        System.out.print(l.get(i)+" ");
    }
    }
   

}
