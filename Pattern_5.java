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
import java.util.*;
public class Pattern_5 {
    /*
    
    *****
     ****
      ***
       **
        *
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the NUmber:-");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++){
                System.out.printf(" ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    
}
