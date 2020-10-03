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
public class Rotatea_2D_arrayby_90_degrees {
    public static void main(String[] args)
  {
    // Write your code here
    Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int a[][]=new int[n][n];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          a[i][j]=scan.nextInt();
        }
      }
      for(int i=0;i<n;i++)
      {
        for(int j=n-1;j>=0;j--)
        {
          System.out.print(a[j][i]);
          if(j>0)
          {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      System.out.println();
    
  }
    
}
