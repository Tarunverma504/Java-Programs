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
public class PalidromeNumberOrNOt {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the number:-");
        int n=scan.nextInt();
        int x=n;
        int t=0;
        int rev=0;
        while(n!=0){
            t=n%10;
            rev=rev*10+t;
            n=n/10;
        }
        
        if(rev==x){
            System.out.println("Palidome");
        }
        else{
            System.out.println("Not Palidrome");
        }
    }
    
}
