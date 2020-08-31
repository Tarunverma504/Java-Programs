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
public class LinerSrcInteger {
    public static  void main(String []arg)
    {
       Scanner scan=new Scanner(System.in);
       System.out.print("Eneter Range and searching element:-");
       int n=scan.nextInt();
       int k=scan.nextInt();
       int[] arr=new int[n];
       System.out.println("Enter Elements");
       int temp=0;
       for(int i=0;i<n;i++)
       {
           arr[i]=scan.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           if(arr[i]==k)
           {
               System.out.println("Element present at index:"+i);
               temp=temp+1;
           }
       }
       if(temp==0)
       {
           System.out.println("Element is not found");
       }
    }
    
}
