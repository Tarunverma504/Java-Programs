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
import java.util.*;
public class UserAuthentication {
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        String username=scan.nextLine();
        String password=scan.nextLine();
        try{
            if(username.length()<=6||username.length()>=12)
            {
                throw new abc("The length of username should be between 6 and 12");
            }
            else{
                System.out.println("Username accepted");
            }
            if(password.length()<=6||password.length()>=12)
            {
                throw new abc("Invalid Size Exception : length should be between 6 to 12");
            }
            if(!Character.isUpperCase(password.charAt(0)))
            {
                throw new abc("Invalid Start of Password : First Letter should be capital");
            }
            if(password.charAt(0)=='!'||password.charAt(0)=='@'||password.charAt(0)=='#'||password.charAt(0)=='$'||password.charAt(0)=='%'||password.charAt(0)=='^'||password.charAt(0)=='&'||password.charAt(0)=='*'||password.charAt(0)=='-'||password.charAt(0)=='_')
            {
               throw new abc("Invalid Start of Password : Can't start with special character"); 
            }
            if(password.charAt(0)>=0&&password.charAt(0)<=9)
            {
                throw new abc("Invalid Start of Password : Can't start with digit");
            }
            System.out.println("Password accepted");
        }
        catch(abc e)
        {
            System.out.println(e);
        }
    }
}
class abc extends Exception{
    abc(String msg)
    {
        super(msg);
    }
}
        
