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
public class Pattern_6 {
    /*
        *
       **
      ***
     ****
    *****
     ****
      ***
       **
        *
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the Number:-");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.printf(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.printf("*");
            }
            
           System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n-1;j>=i;j--)
            {
                System.out.printf(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    
}
