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
public class BinarySrcArray {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Eneter Range and Searching element:-");
        int n=scan.nextInt();
        int k=scan.nextInt();
        System.out.println("Eneter elements:-");
        int []a=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
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
            }
        }
        int low=0;
        int high=a.length-1;
        int mid=(low+high)/2;
        while(low<=high)
        {
            if(a[mid]==k)
            {
                System.out.print("Number Found");
                break;
            }
            else if(a[mid]<k)
            {
                low=mid+1;
            }
            else
            {
             high=mid-1;   
            }
            mid=(low+high)/2;
        }
        if(low>high)
        {
            System.out.println("Element not found");
        }
    }
    
}
