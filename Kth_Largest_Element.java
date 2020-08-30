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
public class Kth_Largest_Element {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Eneter Range and Element number:-");
        int n=scan.nextInt();
        int k=scan.nextInt();
        System.out.println("Eneter elements:-");
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Kth Largest element is:-"+a[k-1]);
    }
}
