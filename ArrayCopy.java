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
public class ArrayCopy {
    public static void main(String []arg)
    {
        int []a={1,2,3,4,5,6};
        int x=a.length;
        int k=0;
        int []b=new int[x];
        for(int i=0;i<a.length;i++)//copy viva elements
        {
            b[k]=a[i];
            k++;
        }
        b[4]=2;
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:b)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        a=b;//direct copy
        a[4]=0;
                for(int i:a)
        {
            System.out.print(i+" ");
        }
                System.out.println();
                for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
    
}
