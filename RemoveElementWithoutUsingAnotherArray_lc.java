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

Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.

*/
public class RemoveElementWithoutUsingAnotherArray_lc {
     public static int removeElement(int[] nums, int val) {
            int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        System.out.println("Enter Elements:-");
        int i=0,j=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.print("Enter Removing Element:-");
        int val=scan.nextInt();
        n=removeElement(a, val);
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
