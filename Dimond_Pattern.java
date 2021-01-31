/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Mind_Coder
 */

/*
Size=4;
+--------+
|   /\   |
|  /--\  |
| /====\ |
|<------>|
| \====/ |
|  \--/  |
|   \/   | 
+--------+
SIze=7;
+--------------+
|      /\      |
|     /--\     |
|    /====\    |
|   /------\   |
|  /========\  |
| /----------\ |
|<============>|
| \----------/ |
|  \========/  |
|   \------/   | 
|    \====/    |
|     \--/     |
|      \/      |
+--------------+
*/
public class Dimond_Pattern {
    public static void upperLower(int n)
    {
        for(int k=0;k<n*2+2;k++)
        {
            if(k==0||k==n*2+1)
                System.out.print("+");
            else
            System.out.print("-");
        }
    }
    public static void upperHalf(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("|");
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            if(i!=n-1)
            System.out.print("/");
            else
                System.out.print("<");
            
           for(int j=1;j<=i*2;j++)
            {
                if(i%2!=0)
                System.out.print("-");
                else
                    System.out.print("=");
            }
           if(i!=n-1)
            System.out.print("\\");
            else
                System.out.print(">");
           
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    
    public static void lowerHalf(int n)
    {
        for(int i=n-2;i>=0;i--)
        {
            System.out.print("|");
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            if(i!=n-1)
            System.out.print("\\");
            else
                System.out.print("<");
            
           for(int j=1;j<=i*2;j++)
            {
                if(i%2!=0)
                System.out.print("-");
                else
                    System.out.print("=");
            }
           if(i!=n-1)
            System.out.print("/");
            else
                System.out.print(">");
           
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void pattern(int n)
    {
        upperLower(n);
        System.out.println();
        upperHalf(n);
       lowerHalf(n);
        upperLower(n);
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        pattern(x);
    }
}
