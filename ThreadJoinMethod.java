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
class TestJoinMethod1 extends Thread{  
 public void run()
 {  
   int i=0;
  for(i=1;i<=5;i++)
  {  
      System.out.println(i);
   try
   {  
    Thread.sleep(500);  
   }
   catch(Exception e)
   {
       System.out.println(e);
   }
  }  
    
  }  
 }  
public class ThreadJoinMethod {
    public static void main(String[] arg)
    {
        TestJoinMethod1 t1=new TestJoinMethod1();  
        TestJoinMethod1 t2=new TestJoinMethod1();  
        TestJoinMethod1 t3=new TestJoinMethod1();  
        t1.start();  
        try
        {  
           t1.join();  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
  
        t2.start();  
        t3.start();     
        
        System.out.println("As you can see in the above example,when t1 completes its task then t2 and t3 starts executing.");
        
    }
    
}
