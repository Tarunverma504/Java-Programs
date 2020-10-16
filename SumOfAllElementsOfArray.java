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
public class SumOfAllElementsOfArray {
    public static void main(String[] args)
  {
    // Write your code here
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Range:-");
    int n=scan.nextInt();
    int []x=new int[n];
    int sum=0;
    System.out.println("enter array elemnts:-");
    for(int i=0;i<n;i++)
    {
      x[i]=scan.nextInt();
    }
    
    for(int i=0;i<10;i++)
    {
       sum=sum+x[i];
    }
    System.out.println(sum);
  }
    
}
