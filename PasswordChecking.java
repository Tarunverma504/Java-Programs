/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Mind_Coder
 */

/*

Create a class MyPassword which consists of a single method checkPassword(String). This method takes one String s as parameter and
finds “if password is strong or not”.
Password’s first character must be in capital.
Fifth character must be special character.
If first charcter is not capital, then the method must throw an exception which says "First character should be in capital. ". Also if fifth
character is not special character then the method must throw an exception, which says “Fifth character should be special character.”
Input Format
First line contain User name.
Second line contain Password.
Output Format
If Password is ok then output Contains “Strong Password.”.
Otherwise the output contains “First character should be in capital.” or
“Fifth character should be special character.” exception.
Constraints
Username and Password must not contain Space.
Special characters include
@ # $ % & *

*/
import java.util.*;
public class PasswordChecking {
    public static void main(String arg[])
    {
        String name,password;
        Scanner scan=new Scanner(System.in);
        name=scan.nextLine();
        password=scan.nextLine();
         checkPassword(password);
    }
    public static void checkPassword(String str){
        try{
            if(!Character.isUpperCase(str.charAt(0)))
            {
                throw new Abc("Word is not capital");
            }
            char a=str.charAt(4);
            if(a!='@'&&a!='#'&& a!='$' && a!='%' && a!='&' && a!='*')
            {
              throw new Abc("Fifth character should be special character.");
            }
            System.out.println("Strong Password");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
class Abc extends Exception{
    public Abc(String msg)
    {
        super(msg);
    }
}
