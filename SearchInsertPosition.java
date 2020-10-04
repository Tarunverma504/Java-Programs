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
public class SearchInsertPosition {
     public static int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target)
            {
                return i;
            }
            
        }
        return i;
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        System.out.println("Enter Elements:-");
        int i=0;
        int[] nums=new int[n];
        for(i=0;i<n;i++)
        {
            nums[i]=scan.nextInt();
        }
        System.out.print("Enter Searching Element:-");
        int target=scan.nextInt();
        System.out.println(searchInsert(nums,target));
    }
}
