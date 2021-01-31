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

Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

*/
public class DailyProblem_2 {
    public static void main(String[] arg)
    {
       Scanner scan=new Scanner(System.in);
       int x=scan.nextInt();
       int[] a=new int[x];
       int[] b=new int [x];
       for(int i=0;i<x;i++)
       {
           a[i]=scan.nextInt();
       }
       int product;
       for(int i=0;i<x;i++)
       {
           product=1;
           for(int j=0;j<x;j++)
           {
               if(i==j)
                   continue;
               else
               {
                  product=product*a[j]; 
               }
           }
           b[i]=product;
       }
       for(int i:b)
       {
           System.out.print(i+" ");
       }
       
    }
    
}
