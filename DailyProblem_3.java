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

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

*/
public class DailyProblem_3 {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int[] a=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=scan.nextInt();
            
        }
        Arrays.sort(a);
       System.out.println(result(a,x));
    }
    static int result(int[] a,int x)
    {
        for(int i=0;i<x-1;i++)
        {
            if(a[i]+1==a[i+1])
                continue;
            else
                return a[i]+1;
        }
        return a[x-1]+1;
    }
}
