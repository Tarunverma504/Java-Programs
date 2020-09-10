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
public class NextPermutation__lc {
    public static void nextPermutation(int[] nums) {
        
        int k=nums.length-2;
        while(k>=0 &&nums[k]>=nums[k+1])
        {
            k--;
        }
        if(k==-1)
        {
            reverseArray(0,nums.length-1,nums);
            return;
        }
        for(int i=nums.length-1;i>k;i--)
        {
            if(nums[i]>nums[k])
            {
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                break;
            }
        }
        reverseArray(k+1,nums.length-1,nums);
    }
       static void reverseArray(int i,int j,int[] nums)
        {
            while(i<j)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j--;
            }
        }
    
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Eneter Range:-");
        int n=scan.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scan.nextInt();
        }
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    
}
