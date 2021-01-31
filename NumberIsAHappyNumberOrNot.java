/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Mind_Coder
 */

/*

Write a function named isHappy() that returns whether a given integer is "happy" or not.

An integer is "happy" if repeatedly summing the squares of its digits eventually leads to the number 1.

For example, 139 is happy because:

12 + 32 + 92 = 91
92 + 12 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
By contrast, 4 is not happy because:

42 = 16
12 + 62 = 37
32 + 72 = 58
52 + 82 = 89
82 + 92 = 145
12 + 42 + 52 = 42
42 + 22 = 20
22 + 02 = 4
...

*/
public class NumberIsAHappyNumberOrNot {
    public static boolean result(int n)
    {
        HashSet<Integer> h=new HashSet<Integer>();
        int t,sum=0;
        while(true)
        {
            while(n>0)
            {
                t=n%10;
                sum=sum+(int)(Math.pow(t,2));
                n=n/10;
            }
            if(sum==1)
                return true;
            boolean x=h.add(sum);
            if(x==false)
            {
                return false;
            }
            n=sum;
            sum=0;
        }
    }
    public static void main(String[] arg)
    {
        System.out.print("Enter the Number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(result(n));
        
    }
    
}
