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
public class Swap_two_numbers {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter A:-");
        int a=scan.nextInt();
        System.out.printf("Enter B:-");
        int b=scan.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("A="+a+" B="+b);
      
    }
    
}
