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
public class FibronacciUsingRecursion {
    static int a=0,b=1,c;
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=scan.nextInt();
        System.out.print(a+" "+b);
        FibronacciUsingRecursion ob=new FibronacciUsingRecursion();
        ob.fic(n);
        
    }
    void fic(int i){
        if(i>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            fic(i-1);
        }
    }
    
}
