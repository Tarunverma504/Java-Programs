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

A student working over an application, but he stuck in part of the application to authorize the user. Just help him to code the program that accepts the user name and sets rules for a strong password from the user. A password will be strong if it contains at least one uppercase, one lowercase, and one digit and it must be more than 8 characters.

·       If the password has less than 8 characters then throw an exception and print: user name and "length should be greater than 8“

·       If the password does not contain an uppercase character then throw an exception and print: user name and "password must contain an uppercase letter"

·       If the password does not contain a digit then throw an exception and print: user name and “password must contain a digit”.

. if the password does not have any exception condition print: "correct password"

For handling, exception implement necessary catch blocks and print the messages accordingly.

*/
class MyException extends Exception
{
    MyException(String msg)
 {
    super(msg);
 }
}
class Accounts
{
  String name;
  String password;
  public Accounts(String name,String pass)
  {
    this.name=name;
    this.password=pass;
  }
  public void validate() throws MyException
  {
    int i=0,upper=0,digit=0;
    while(i<password.length())
    {
      if(Character.isUpperCase(password.charAt(i)))
        upper++;
      if(Character.isDigit(password.charAt(i)))
        digit++;
      i++; 
    }
    if(password.length()<8)
    {
    throw new MyException(name+" length should be greater than 8");
    }
    if(upper==0){
      throw new MyException(name+" password must contain an uppercase letter");}
    if(digit==0){
      throw new MyException(name+" password must contain a digit");}
    System.out.println("correct password");
  }
  
}

public class AcceptablePassword {
    public static void main(String[] arg)
    {
       Scanner scan=new Scanner(System.in);
        String name=scan.next();
        String password=scan.next();  
        Accounts a=new Accounts(name,password);
        try
        {
            a.validate();
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        } 
    }
    
}
