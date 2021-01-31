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

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

*/
public class DailyProblem_1 {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int a[] =new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=scan.nextInt();
            
        }
        int sum=scan.nextInt();
       System.out.println(result(a,x,sum)); 
    }
    static boolean result(int[] a,int x,int sum)
    {
        for(int i=0;i<x;i++)
        {
            for(int j=i;j<x;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    return true;
                }
                
            }
        }
        return false;
    }
    
}