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
public class Pattern_10 {
    /*
    
    * 
     *
      * 
       *
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Eneter the number:-");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i>=2 &&j<=i-1){
                    System.out.printf(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
}
