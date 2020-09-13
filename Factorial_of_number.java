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
public class Factorial_of_number {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("enter the number:-");
        int a=scan.nextInt();
        int fac=1;
        for(int i=a;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
    }
    
}
