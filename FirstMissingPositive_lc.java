/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author TARUN VERMA
 */
import java.util.*;
/*

Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1

*/


public class FirstMissingPositive_lc {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements:-");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        int j=1,pos=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                pos=i;
                break;
            }
        }
        int num=1;
        while(pos<a.length)
        {
            
            if( j==a[pos])
            {
                j++;
                pos++;
            } 
            else {
                pos++;
            }
        }
        System.out.println("Missing Positive Element:- "+j);
    }
    
}
