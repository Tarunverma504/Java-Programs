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
public class Pattern_18 {
    /*
    
    1
    2 3
    4 5 6
    7 8 9 10
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                count=count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }  
    
}
