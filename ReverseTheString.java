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
public class ReverseTheString {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("String:");
        String str=scan.nextLine();
        String word="";
        int i=0;
        for(i=str.length()-1;i>=0;i--)
        {
         word=word+str.charAt(i); 
        }
        System.out.println(word);
    }
    
}
