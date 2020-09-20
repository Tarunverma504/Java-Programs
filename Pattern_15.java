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
public class Pattern_15 {
    /*
    
    ****
    *  *
    *  * 
    ****
    
    */
    public static void main(String []arg){
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j>=2&&i>=2&&i<=4&&j<=4)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }
    }
}
