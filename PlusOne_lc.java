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

Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

*/
public class PlusOne_lc {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Range:-");
        int n=scan.nextInt();
        System.out.println("Enter Elements:-");
        int[] a=new int[n];
        int flag=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]<9)
            {
                a[i]=a[i]+1;
                flag=1;
                break;
            }
            a[i]=0;
        }
        if(flag==1)
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        if(flag==0)
        {
            int[] result = new int[a.length + 1]; 
        result[0] = 1;
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        }
        
    }
    
}
