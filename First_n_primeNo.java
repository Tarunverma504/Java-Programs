/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author TARUN VERMA
 */
public class First_n_primeNo {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter thenumber and range:-");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int ccount=0;
        for(int i=1;i<=x;i++)
        { 
            int count=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                ccount++;
                System.out.println(i);
            }
            if(ccount==y)
            {
                break;
            }
        }
    }
    
}
