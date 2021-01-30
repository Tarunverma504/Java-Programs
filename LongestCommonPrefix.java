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
public class LongestCommonPrefix {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter Range:-");
        int n=scan.nextInt();
        String[] s=new String[n];
        scan.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.print(" Enter String:- ");
            s[i]=scan.nextLine();
            
        }
        System.out.println( longestCommonPrefix(s) );
    }
    
    public static String longestCommonPrefix(String[] strs) {
        String s="";
        if(strs.length<1)
        {
            return s;
        }
        for(int i=0;i<strs[0].length();i++)
        {
            char n=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].length()-1<i)
                {
                    return s;
                }
                if(strs[j].charAt(i)!=n)
                {
                    return s;
                }
                
                
            }
            s=s+n;
            
        }
        return s;
    }
    
}
