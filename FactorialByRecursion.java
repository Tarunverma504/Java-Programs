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
public class FactorialByRecursion {
    static int fac=1;
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int n=scan.nextInt();
        FactorialByRecursion ob=new FactorialByRecursion();
        ob.fact(n);
        System.out.println("Factorial of "+n+" is "+fac);
    }
    void fact(int n){   
        if(n>=1){
            fac=fac*n;
            fact(n-1);
        }
        
    }
    
}
