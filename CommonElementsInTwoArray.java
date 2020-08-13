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
public class CommonElementsInTwoArray {
    public static void main(String []arg)
    {
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
    for(int i=0;i<n;i++)
    {
      b[i]=scan.nextInt();
      
    }
    int temp=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[i]<a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(b[i]<b[j])
            {
                temp=b[i];
                b[i]=b[j];
                b[j]=temp;
            }
        }
        
    }
    for(int i:b)
    {
        System.out.print(i+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++)
        {
            if(a[i]==b[i])
            {
                System.out.print(a[i]+" ");
            }
        }
    
    }
    
}
