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
public class FirstDublicate {
    public static void main(String []arg)
    {
         Scanner scan=new Scanner(System.in);
        System.out.print("Eneter Range:-");
        int n=scan.nextInt();
        System.out.println("Eneter elements:-");
        int []a=new int[n];
        int temp=0,flag=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j]&&i!=j)
                {
                    System.out.println("First Dublicate:-"+a[i]);
                    flag=1;
                    break;
                }
                
                    
            }
            if(flag==1)
            {
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Dublicate not found");
        }
    }
    
}
