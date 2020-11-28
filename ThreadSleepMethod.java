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
import java.util.*;
class Sleep extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
           System.out.println(i);
           try{
               System.out.println("Wait For 1 Second");
               Thread.sleep(1000);
           }
           catch(Exception e)
           {
               System.out.println("Error");
           }
        }
        
    }
}
public class ThreadSleepMethod {
    public static void main(String[] arg)
    {
        Sleep s=new Sleep();
        s.start();
        
    }
    
}
