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
public class Simple_calculator {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter First number:-");
        int a=scan.nextInt();
        System.out.printf("Enter Second number:-");
        int b=scan.nextInt();
        System.out.printf("Select symbol(+,-,/,8):-");
        String s=scan.next();
        int res;
        switch(s){
            case "+":
                res=a+b;
                System.out.println(a+"+"+b+"="+res);
                break;
            case "-":
                res=a-b;
                System.out.println(a+"-"+b+"="+res);
                break;
            case "*":
                res=a*b;
                System.out.println(a+"*"+b+"="+res);
                break;
            case "/":
                res=a*b;
                System.out.println(a+"/"+b+"="+res);
                break;
            default:System.out.println("Invalid Symbol");
        }
        
        
    }
    
}
