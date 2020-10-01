/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
/*

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


*/
public class ReverseInteger_lc {
    public static int reverse(int x)
    {
        int flag=0;
        long rev=0;
        if(x<0)
        {
            flag=1;
            x=x*-1;
        }
        while(x>0)
        {
            int t=x%10;
            rev=rev*10+t;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE)
            return 0;
        if(flag==1)
        {
            rev=rev*-1;
        }
        
        
            return (int)rev;
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Integer:-");
        int n=scan.nextInt();
        System.out .println(reverse(n));
    }
}
