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
/*

Sort string
keshav had learned alphabets precedence few days back and have been assigned task to arrange letters of a string as
per ascending order. Help keshav to complete the task.
Input Format
A single line containing a string of any length.
Output Format
A single line string where letters are arranged in ascending order

Sample Input            Sample Output
welcome to java         aaceejlmootvw
*/
public class SortString {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter String:-");
        String str=scan.nextLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        str=new String(ch);
        System.out.println(str);
    }
    
}
