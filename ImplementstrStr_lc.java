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
public class ImplementstrStr_lc {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First String:-");
        String haystack=scan.nextLine();
        System.out.print("Enter Second String:-");
        String needle=scan.nextLine();
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()<0) return 0;
        else
            return haystack.indexOf(needle);
        
    }
}
