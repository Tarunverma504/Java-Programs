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
public class Pattern_11 {
    /*
    
        *
       *
      *
     *
    *
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=scan.nextInt();
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>i;j--)
            {
                System.out.printf(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(i>=2&&k>1)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
