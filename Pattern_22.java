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
public class Pattern_22 {
    /*
    
    1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            int no=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(no+" ");
                no=no+5-j;
            }
            System.out.println();
        }
    }  
    
}
