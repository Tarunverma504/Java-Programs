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
public class Pattern_7 {
    /*   
         *
        * *
       * * *
      * * * *
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the number:-");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--){
                if(j>i){
                    System.out.printf(" ");
                    
                }
                else
                {
                    System.out.printf(" *");
                }
            }
            System.out.println();
        }
    }
}
