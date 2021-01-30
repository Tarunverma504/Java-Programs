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
public class Practice {
     	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	String s1=scan.next();
	String s2=scan.next();
	System.out.println(contains(s1,s2));
	}
	public  static String contains(String s1,String s2){
	    if(s1.length()==0||s2.length()==0||s2.length()>s1.length())
	    {
	        return "No";
	    }
	    else{
	        int y=s1.indexOf(s2);
	        System.out.println(y);
	        if(y==-1)
	        {
	            return "no";
	        }
	        else{
	        return "yes";
	        }
	    }
	}
    
}
