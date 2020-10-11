/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author TARUN VERMA
 */


/*
 Given a number N, Write a program to find a number which is greater than or equal to N and is a smallest power of 2.

Input:
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a single integer N.

Output:
For each test case, print a number which is greater than or equal to N and is a nearest power of 2.

Constraints:
1<=T<=100
1<=N<=100000

Example:
Input:
4
5
1
17
32
Output:
8
1
32
32
*/
public class SmallestPowerOf2GreaterThanOrEqual_n_GFG {
    
public static void main (String[] args) {
Scanner sc =new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int i=0;
while(Math.pow(2,i)<=n)
{
i++;
}
System.out.println((int)Math.pow(2,i));
}

}
}
