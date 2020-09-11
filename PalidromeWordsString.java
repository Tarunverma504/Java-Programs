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
public class PalidromeWordsString {
    public static void main(String[] arg)
    {
        int j=0,i=0,count=0,flag=1;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("String:");
        String str=scan.nextLine().trim();
        str=str+" ";
        String word="";
        for(i=0;i<str.length();i++)
        {
            flag=1;
            if(str.charAt(i)!=' ')
                word=word+str.charAt(i);
            else
            {
                int n=word.length();
                word=word.toLowerCase();
                for(j=0;j<n;j++,n--)
                {
                    if(word.charAt(j)!=word.charAt(n-1))
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                    count++;
                word="";
            }
        }
        System.out.println(count);
        
    }
    
}
