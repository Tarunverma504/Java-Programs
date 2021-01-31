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

Bracket Number
Given a string of length n consisting of round brackets. The task is to print the bracket numbers when the string is being parsed
Input Format
The first line contains an integer T, the number of test cases. For each test case, there is a string containing round brackets.
Output Format
For each test case, the output is the bracket numbers of the string.

input:-
2
(())()
((())(()))

output:-
1 2 2 1 3 3
1 2 3 3 2 4 5 5 4 1
*/
public class BracketNumber {
    public static void main(String[] arg)
    {
        Scanner scan= new Scanner(System.in);
        int left=1;
        Stack<Integer> right=new Stack<Integer>();
        int x=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<x;i++)
        {
            
            String s=scan.nextLine();
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j) == '(')
                {
                    System.out.print(left+" ");
                    right.push(left);
                    left++;
                }
                if(s.charAt(j) == ')')
                {
                    System.out.print(right.peek()+" ");
                    right.pop();
                }
                
                    
            }
            System.out.println();
           
        }
    }
    
}
