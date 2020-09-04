/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author TARUN VERMA
 */
public class MaxElement {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Eneter Range:-");
        int n=scan.nextInt();
        System.out.println("Eneter elements:-");
        int []a=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
           if(a[i]>max)
           {
               max=a[i];
       
           }
        }
        System.out.println("Max element:-"+max);
    }
    
}
