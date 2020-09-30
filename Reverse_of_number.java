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
public class Reverse_of_number {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the number:-");
        int n=scan.nextInt();
        int rev=0;
        int t;
        while(n>=1){
            t=n%10;
            rev=rev*10+t;
            n=n/10;
        }
        System.out.println("Reverse of the umber is"+rev);
        
    }
    
}
