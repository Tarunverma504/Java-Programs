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
public class FrequencyOfArrayElements {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        System.out.println("Enter elements:-");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            b[i]=-1;
        }
        int cnt;
        for(int i=0;i<n;i++)
        {
            cnt=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    cnt++;
                    b[j]=0;
                }
            }
            if(b[i]!=0)
            {
                b[i]=cnt;
            }
        }
        System.out.println("Dublicate Elements in array");
        for(int i=0;i<n;i++)
        {
            if(b[i]!=0)
            {
                System.out.println(a[i]+" "+b[i]);
            }
        }
        
    }
    
    
}
