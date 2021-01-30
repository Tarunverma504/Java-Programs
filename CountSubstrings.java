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

Count substrings
Given a string S consisting of only 1s and 0s, find the number of substrings which start and end both in 1.
In this problem, a substring is defined as a sequence of continuous characters Si
, Si+1
, ..., Sj
 where 1 ≤ i ≤ j ≤ N
nput Format
First line contains T, the number of testcases. Each testcase consists of N(the length of string) in one line and string in second
line.
Output Format
For each testcase, print the required answer in one line.
Constraints
·        1 ≤ T ≤ 105
·        1 ≤ N ≤ 105
·        Sum of N over all testcases ≤ 105
Sample Input           Sample Output
1                           6  
4
1011
*/
public class CountSubstrings {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter String Containing only 1's and 0's:-");
        String str=scan.nextLine();
        int start=0,count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                start++;
                count=count+start;
            }
        }
        System.out.println(count);
    }
    
    
}
