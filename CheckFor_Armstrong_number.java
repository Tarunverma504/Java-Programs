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
public class CheckFor_Armstrong_number {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
         int x=n;
        int y=n;
        int count=0;
        while(n!=0){
        count++;
        n=n/10;
        }
        int t;
        int sum=0;
        while(x!=0){
            t=x%10;
            int mul=1;
            for(int j=0;j<count;j++)
            {
                mul=mul*t;
            }
            sum=sum+mul;
            x=x/10;
        }
        if(y==sum){
            System.out.println("Armstrong");
            
        }
        else{
            System.out.println("Not Armstrong");
        }
        
    }
    
}
