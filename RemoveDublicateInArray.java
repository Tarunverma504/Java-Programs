/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TARUN VERMA
 */
import java.util.*;
import java.util.Arrays;
public class RemoveDublicateInArray {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        int[] a=new int[n];
        int[] temp=new int[n];
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
                temp[j++]=a[i];
        }
        temp[j++]=a[n-1];
        for(i=0;i<j;i++)
        {
            a[i]=temp[i];
        }
        for(i=0;i<j;i++)
            
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
