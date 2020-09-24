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
public class Pattern_23 {
    /*
    
    1 2 3
    6 5 4
    7 8 9
    12 11 10 
    13 14 15 
    
    */
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            
            if(i%2!=0)
            {
                for(int j=1;j<=3;j++)
                {
                    count=count+1;
                System.out.print(count+" ");
                }
            }
            else{
                int temp=count+1;
                for(int j=count+3;j>=temp;j--)
                {
                    count=count+1;System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }  
    
}
