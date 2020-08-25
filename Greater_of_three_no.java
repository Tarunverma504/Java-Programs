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
public class Greater_of_three_no {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any three numbers:-");
         int a=scan.nextInt();
         int b=scan.nextInt();
         int c=scan.nextInt();
         if(a>b){
             if(a>c){
                 System.out.println("A is greater");
             }
             else{
                 System.out.println("C is greater");
             }
         }
         else if(b>c){
             System.out.println("B is Greater");
         }
         else{
             System.out.println("c is greater");
         }
        
    }
    
}
