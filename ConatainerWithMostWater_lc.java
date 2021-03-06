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
Problem link:-"https://leetcode.com/problems/container-with-most-water/"
 Container With Most Water
Medium

6867

608

Add to List

Share
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 



The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
*/
public class ConatainerWithMostWater_lc {
    public static int maxArea(int[] height) {
        int start=0,end=height.length-1;
        int maxarea=0;
        while(start<end)
        {
            int minheight=Math.min(height[start],height[end]);
            int area=minheight*(end-start);
            maxarea=Math.max(maxarea,area);
                if(height[start]<height[end])
                {start++;}
            else
            {
                end--;
            }
        }
        return maxarea;
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        System.out.println("Enter the elements:-");
        int[] height=new int[n];
        for(int i=0;i<n;i++)
        {
            height[i]=scan.nextInt();
        }
        int a= maxArea(height);
        System.out.println("Maximum Area:- "+a );
    }
    
}
