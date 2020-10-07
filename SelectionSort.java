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
public class SelectionSort {
    public static void main(String []arg)
    {
        int []a={38,52,9,18,6,62,13};
        int min,temp;
        System.out.print("before Sorting:-");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
       
        for (int i=0;i<a.length;i++)
        {
         min=i;
         for(int j=i+1;j<a.length;j++)
         {
             if(a[j]<a[min])
             {
                 min=j;
             }
             
         }
         temp=a[i];
         a[i]=a[min];
         a[min]=temp;
            
        }
        System.out.print("\nAfter Sorting:-");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    
    
}
