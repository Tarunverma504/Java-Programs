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
public class ExceptionHandling {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        try{
            int x=scan.nextInt();
            int y=scan.nextInt();
            System.out.println(x/y);
        }
        catch(java.util.InputMismatchException im)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(java.lang.ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
    
}
