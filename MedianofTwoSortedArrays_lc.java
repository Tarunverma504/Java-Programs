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

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/
public class MedianofTwoSortedArrays_lc {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range of Array 1:-");
        int n=scan.nextInt();
        System.out.print("Enter Elents of Array1:-");
        int[] nums1=new int[n];
        for(int i=0;i<n;i++)
        {
            nums1[i]=scan.nextInt();
        }
        System.out.print("Enter Range of Array 2:-");
        int m=scan.nextInt();
        System.out.print("Enter Elents of Array2:-");
        int[] nums2=new int[n];
        for(int i=0;i<n;i++)
        {
            nums2[i]=scan.nextInt();
        }
        int a=nums1.length;
        int b=nums2.length;
        int[] ab=new int[a+b];
        int k=0;
        int i=0;
        double x;
        for(i=0;i<nums1.length;i++)
        {
            ab[k++]=nums1[i];
        }
        for(i=0;i<nums2.length;i++)
        {
            ab[k++]=nums2[i];
        }
        Arrays.sort(ab);
        int w=ab.length/2;
        if(ab.length%2==0)
        {
            x=((ab[w]+ab[w-1])/2.0);
        }
        else
            x=ab[w];
        System.out.println(x);
    }
    
}
