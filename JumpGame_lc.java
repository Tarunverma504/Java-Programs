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
public class JumpGame_lc {
    /*
    
    Given an array of non-negative integers, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.
Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
    
Example 2:
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 
    */
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
        int x=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i+nums[i]>=x)
            {
                x=i;
            }
        }
        if(x==0)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
    
}
