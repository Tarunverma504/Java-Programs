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
public class ReverseWordsInString {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter String:- ");
        String s=scan.nextLine();
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuffer sttr=new StringBuffer();
        if(s.length()==1)
        {
            return s;
        }
        else{
             String[] str=s.split(" ");
            
            for(int i=str.length-1;i>=0;i--)
            {
                if(str[i].length()!=0)
                {
                    sttr.append(str[i]);
                    sttr.append(" ");
                }
                
            }
        }
        return sttr.toString().trim();
      //  return sttr.toString().trim();
        
        
    }
}
