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

public class Pattern_14 {
     /*
    
    *       *
     *     * 
      *   * 
        *
       *  *
      *    *
     *      *
    *        *
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==i||j+i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
 }
