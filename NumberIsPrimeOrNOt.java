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
public class NumberIsPrimeOrNOt {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the number:-");
        int n=scan.nextInt();
        int temp=0;
        if(n==2){
            System.out.println("prime");
            }
        else {
            for(int i=2;i<n;i++)
            {
                if(n%i==0){
                    temp=temp+1;
                    break;
                }
            }
            if(temp==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
    
}
