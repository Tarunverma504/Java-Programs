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
public class PrintPrimeNumberBtw1To100 {
    public static void main(String []arg){
        for(int j=1;j<=100;j++)
        {
            int temp=0;
            for(int i=2;i<j-1;i++)
            {
                if(j%i==0){
                    temp=temp+1;
                    break;
                }
            }
            if(temp==0){
                System.out.println(j);
            }
        }
    }
    
}
