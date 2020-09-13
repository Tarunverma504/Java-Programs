/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TARUN VERMA
 */
import java.util.*;

/*

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

*/
public class FindFirstandLastPositionofElementInArray {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        int []a=new int[n];
        System.out.println("Enter elements:-");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.print("Enter Target Element:-");
        int target=scan.nextInt();
         int i=0;
        int[] temp=new int[2];
        temp[1]=-1;
        temp[0]=-1;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                temp[0]=i;
            
                break;
            }
        }
        for(i=a.length-1;i>=0;i--)
        {
            if(a[i]==target)
            {
                temp[1]=i;
                break;
            }
        }
          for(i=0;i<2;i++)
          {
              System.out.print(temp[i]+" ");
          }
    }
    
}
