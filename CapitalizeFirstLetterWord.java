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
public class CapitalizeFirstLetterWord {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("String:");
        String str=scan.nextLine();
        String word="";
        String w="";
        str=str+" ";
        int i=0,start=0,end=0;
        for(i=0;i<str.length();i++)
        {
          if(str.charAt(i)==' ')
          {
            end=i;
            w=w+str.charAt(start);
            w=w.toUpperCase();
            word=word+w+str.substring(start+1,end)+" ";
            start=i+1;
            w="";
          }
        }
        System.out.println(word.trim());

        
    }
    
}
