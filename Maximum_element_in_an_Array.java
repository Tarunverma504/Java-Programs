/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author TARUN VERMA
 */
public class Maximum_element_in_an_Array {
    public static void main(String[] args)
  {
    // Write your code here
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Range:-");
    int n=scan.nextInt();
    int []a=new int[n];
    int large=0;
    System.out.println("Enter elements:-");
    for(int i=0;i<n;i++)
    {
       a[i]=scan.nextInt();
      if(large<a[i])
      {
        large=a[i];
      }
    }
    System.out.println(large);
  }
    
}
