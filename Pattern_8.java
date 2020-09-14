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
public class Pattern_8 {
    /*
      *
     ***
    *****
   *******
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the number:-");
        int n=scan.nextInt();
        for(int i=1;i<=4;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.printf(" ");
            }
            for(int k=1;k<i*2;k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
