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
class Power
{
    int calPower(int n,int p)throws Exception
    {
        if(n<0||p<0)
        {
            throw new Exception("n or p should be non-negative");
        }
        else if(n==0|| p==0)
        {
            throw new Exception("n or p should be non-zero");
        }
        else
        {
            return (int)(Math.pow((double)n ,(double) p));
        }
    }
}
public class PowerOfNumber {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int testcase=in.nextInt();
        while(testcase>0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Power M = new Power ();
            try
            {
                System.out.println(M.calPower(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            testcase--;
        }

    }
    
}
