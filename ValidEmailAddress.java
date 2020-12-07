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

Valid Email Address
Check an email-id for following exceptions
if id does not contain '@' OR
if id does not contain '.' (dot) OR
if no '.' (dot) appears after '@'
catch the exception and print "Email id is Invalid".
Otherwise print "Email id is Valid".
Sample Input                Sample Output
abc@gmail.com               Email id is Valid

Sample Input                Sample Output
abc@gmailcom                Email id is Invalid

*/
public class ValidEmailAddress {
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        try{
            if(a.contains("@"))
            {
                if(a.contains("."))
                {
                    if(a.indexOf("@")<a.indexOf("."))
                    {
                        System.out.println("Email id is Valid");
                    }
                    else
                    {
                        throw new Exception("Email id is Invalid");
                    }
                }
                else{
                            throw new Exception("Email id is Invalid");
                            }
            }
            else{
                            throw new Exception("Email id is Invalid");
                            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
