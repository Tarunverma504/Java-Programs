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
public class MissingElementInsortedArray {
    public static void main(String []arg)
    {
         Scanner scan=new Scanner(System.in);
        System.out.print("Eneter Range:-");
        int n=scan.nextInt();
        System.out.println("Eneter elements:-");
        int []a=new int[n];
        int flag=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            count++;
            if(a[i]!=count)
            {
                System.out.print(count+" ");
                count++;
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.print("AllElements Are present");
        }
            
        
    }
}
