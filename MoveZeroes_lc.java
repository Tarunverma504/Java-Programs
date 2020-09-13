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
public class MoveZeroes_lc {
    public static void main(String []arg)
    {
        System.out.print("Enter Range:-");
        Scanner scan=new Scanner(System.in);
        int z=scan.nextInt();
        System.out.println("Enter Elements:-");
        int[] nums=new int[z];
        for(int i=0;i<z;i++)
        {
            nums[i]=scan.nextInt();
        }
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[k++]=nums[i];
            }
        }
        for(int j=k;j<nums.length;j++)
        {
            nums[j]=0;
        }
        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
    
}
