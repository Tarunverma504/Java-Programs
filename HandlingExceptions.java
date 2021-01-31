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

You are supposed to enter two variables x and y and compute x/y. Along with this your program must be able to handle
two situations as desired:
If x<y then an exception must be thrown with message:
“java.lang.Exception: Numerator should be larger”
If y=0 then an exception must be thrown with message:
“java.lang.Exception: Denominator should not be zero”
Else it should print x/y.
Sample Testcase 1:
Input:
2
3
Output:
java.lang.Exception: Numerator should be larger
Sample Testcase 2:
Input:
10
5
Output:
2
Input Format
Enter two integers
Output Format
Print the error message or the division output
*/
public class HandlingExceptions {
    public static void main(String[] arg)throws Exception
    {
        try{
            Scanner scan=new Scanner(System.in);
            int x=scan.nextInt();
            int y=scan.nextInt();
            if(x<y)
                throw new Exception("Numerator should be larger");
            if(y==0)
                throw new Exception ("Denominator should not be zero");
            System.out.println(x/y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
