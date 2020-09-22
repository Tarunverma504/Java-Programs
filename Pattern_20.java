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
public class Pattern_20 {
    /*
    
    1
    1 2 1
    1 2 3 2 1 
    1 2 3 4 3 2 1
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }  
    
}
