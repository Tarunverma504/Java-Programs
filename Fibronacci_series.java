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
public class Fibronacci_series {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        int a=0, b=1;
        int n=scan.nextInt();
        System.out.print(a+" "+b);
        int c;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        
    }
    
}
