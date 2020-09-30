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
public class RemoveParticularElementInArray {
    public static int removeElement(int[] a, int val) {
        int n=a.length;
        int i=0,j=0;
        int[] temp=new int[n];
        for(i=0;i<n;i++)
        {
            if(a[i]!=val)
                temp[j++]=a[i];
        }
        for(i=0;i<j;i++)
        {
            a[i]=temp[i];
        }
        return j;
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        System.out.println("Enter Elements:-");
        int i=0,j=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.print("Enter Removing Element:-");
        int val=scan.nextInt();
        n=removeElement(a, val);
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
