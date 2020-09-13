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
public class Check_leapyear {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Year:-20");
        int x=scan.nextInt();
        if(x%4==0){
            if(x%100==0){
              if(x%400==0){
                  System.out.println("Leap year");
              }  
              else{
                  System.out.println("Not Leap year");
              }
               
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    
}
