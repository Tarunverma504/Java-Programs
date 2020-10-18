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
public class SwapFirstAndLastCharacterOfEachWord {
    public static void main(String []arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("String:");
        String str=scan.nextLine();
        int start=0,end=0,i=0;
    str=str+" ";
    String word="";
    if(str.length()<=1)
    {
      System.out.println(str);
    }
    else
    {
      start=0;
      for(i=0;i<str.length();i++)
      {
        if(str.charAt(i)==' ')
        {
          end=i-1;
          word=word+str.charAt(end)+str.substring(start+1,end)+str.charAt(start)+" ";
          start=i+1;
        }
      }
    }
    System.out.println(word.trim());

        
    }
    
}
