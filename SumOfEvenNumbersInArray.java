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
public class SumOfEvenNumbersInArray {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        System.out.println("Enter Elements:-");
        int []a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }
        System.out.print("Sum of even elements:-"+sum);
        
        
    }
}
