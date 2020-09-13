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
public class DublicateinArray_Brute_force {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        System.out.println("Enter elements");
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j]&&i!=j)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
    
}
