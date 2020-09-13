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
public class MatrixMultiplication {
    public static void main(String[] args)
  {
    // Write your code here
    Scanner scan=new Scanner(System.in);
    
      int r1=scan.nextInt();
      int c1=scan.nextInt();
      int a[][]=new int[r1][c1];
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
        {
          a[i][j]=scan.nextInt();
        }
      }
      int r2=scan.nextInt();
      int c2=scan.nextInt();
      int b[][]=new int[r2][c2];
      for(int i=0;i<r2;i++)
      {
        for(int j=0;j<c2;j++)
        {
          b[i][j]=scan.nextInt();
        }
      }
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c2;j++)
        {
          int sum=0;
          for(int k=0;k<c1;k++)
          {
            sum=sum+a[i][k]*b[k][j];
          }
          System.out.print(sum+" ");
        }
        System.out.println();
      }
    
  }
    
}
