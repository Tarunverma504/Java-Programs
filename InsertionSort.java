/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author TARUN VERMA
 */
public class InsertionSort {
    public static void main(String []arg)
    {
        int []a={5,1,6,2,4,3};
            int j=0,temp;
            System.out.print("Before sorting:-");
            for(int i:a)
            {
                System.out.print(i+" ");
            }
        for(int i=0;i<a.length;i++)
        {
            temp=a[i];
            j=i;
           while(j>0 && a[j-1]>temp)
           {
               a[j]=a[j-1];
               j=j-1;
               
           }
           a[j]=temp;
        }
        System.out.print("\n After sorting:-");
        for(int i:a)
            {
                System.out.print(i+" ");
            }
    }
    
}
