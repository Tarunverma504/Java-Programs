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
public class The_Number_is_Kaprekar_or_not {
    /*
    Write a program to find the given number is kaprekar or not. A number if kaprekar if the representation of its square can be split into two parts that add up to the original number. For instance, 45 is a Kaprekar number, because 45^2 = 2025 and 20 + 25 = 45. Whereas 13 is not as 13^2 = 169 which can be split in two ways (1+69) and (16+9), but any of them is not 13. The number 1 is Kaprekar, because 1^2 = 01, and  0 + 1 = 1.

Input

First line of input will contain a number N = number of test cases. Next N lines will contain number n as test case where 0<=n<=9999.

Output

For each input case, print 1 if number is kaprekar and print 0 otherwise.


    */
    
        
// Other imports go here// Do NOT change the class name

  public static int iskaprekar(int n)
  {
    if(n==1)
      return 1;
    int sq=n*n;
    int count=0;
    while(sq!=0)
    {
      count++;
      sq=sq/10;
    }
    sq=n*n;
    for(int j=1;j<count;j++)
    {
      int eq=(int)Math.pow(10,j);
      if(eq==n)
        continue;
      int sum=sq/eq+sq%eq;
      if(sum==n)
        return 1;
    }
    return 0;
    
  }
    public static void main(String[] args)
    {
        // Write your code here
       Scanner scan=new Scanner(System.in);
       int z=scan.nextInt();
      for(int i=0;i<z;i++)
      {
        int n=scan.nextInt();
         int zz=iskaprekar(n);
        System.out.println(zz);
      }
    }
}
    
    

