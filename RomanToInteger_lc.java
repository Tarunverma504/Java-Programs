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
public class RomanToInteger_lc {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Roman Number:-");
        String s=scan.nextLine();
        s=s.toUpperCase();
        System.out.println(romanToInt(s));
        
    }
     public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i = s.length() - 1;
        int sum = 0;
        
        while (0 < i ) {
            int currVal = map.get(s.charAt(i));
            int prevVal = map.get(s.charAt(i - 1));
            sum += currVal;
            i--;
            if (prevVal < currVal) {
                sum -= prevVal ;
                i--;
            }
        }
        if (0 > i) return sum;
        sum += map.get(s.charAt(0));
        return sum;
    }
    
}
