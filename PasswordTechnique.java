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

Password technique
A technique used for password generation for a particular person involves
first two letters of first name
last two letters of last name
if midddle name is of odd length then middle letter of middle name
But if middle name is of even length then middle two letters of middle name. sum their ascii values. Divide by 2 and
character correspond to the resultant ascii value .
Input Format
Three lines each containing a string where
first line denotes first name
second line denotes middle name
Third line denotes last name
Output Format
A single line containing password.

Sample Input            Sample Output
suresh
kumar
juneja
                               sumja
Sample Input            Sample Output
kamaldeep
kaur
sidhu
                                kakhu
*/
public class PasswordTechnique {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        String str1,str2,str3,str4;
        System.out.println("Enter your First Name, Middle Name and Last Name");
        str1=scan.nextLine();
        str2=scan.nextLine();
        str3=scan.nextLine();
        str4 = str1.substring(0,2);
        if(str2.length()%2!=0)
        {
            str4=str4+str2.charAt(str2.length()/2);
        }
        else
        {
           str4=str4+(char)(((int)str2.charAt((str2.length()/2)-1)+(int)str2.charAt(str2.length()/2))/2);
        }
        str4=str4+str3.substring(str3.length()-2,str3.length());
        System.out.println(str4);
    }
    
}
