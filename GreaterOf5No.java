/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author TARUN VERMA
 */
public class GreaterOf5No {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
    if(a>b&&a>c&&a>d&&a>e)
    {
        System.out.println(a);
    }
    if(b>a&&b>c&&b>d&&b>e)
    {
        System.out.println(b);
    }
    if(c>a&&c>b&&c>d&&c>e)
    {
        System.out.println(c);
    }
    if(d>a&&d>b&&d>c&&d>e)
    {
        System.out.println(d);
    }
    if(e>a&&e>b&&e>c&&e>d)
    {
        System.out.println(e);
    }
    
}
}
