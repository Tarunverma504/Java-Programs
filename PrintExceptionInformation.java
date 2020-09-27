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
public class PrintExceptionInformation {
    public static void main(String[] arg)
    {
        try
        {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println(ae);
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println(ae.toString());
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println(ae.getMessage());
            
        }
    }
    
}
