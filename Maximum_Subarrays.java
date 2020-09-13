/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author TARUN VERMA
 */
public class Maximum_Subarrays {
    /*
    
 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
    
    */
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Eneter Range:-");
        int n=scan.nextInt();
        int []nums=new int[n];
        System.out.println("Enter the elements:-");
         for(int i=0;i<n;i++)
         {
           nums[i]=scan.nextInt();
         }
         
        int []table=new int[nums.length];
        int max=nums[0];
        table[0]=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            table[i]=Math.max(nums[i],nums[i]+table[i-1]);
            max=Math.max(max,table[i]);   
        }
        System.out.print(max);
    }
    
}