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
public class Copy_elements_of_an_Array {
    public static void main(String[] args)
  {
    // Write your code here
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Range:-");
    int n=scan.nextInt();
    int []a=new int[n];
    int []b=new int[n];
    System.out.println("Enter Elements:-");
    for(int i=0;i<n;i++)
    {
      a[i]=scan.nextInt();
      
    }
    int k=0;
    for(int i=n-1;i>=0;i--)
    {
      b[k]=a[i];
      k=k+1;
    }
    for(int i=0;i<n;i++)
    {
      System.out.println(b[i]);
    }
  }
    
}
