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
public class Check_even_or_odd {
    public static void main(String []args){
        System.out.println("Enter the number:-");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    
}
