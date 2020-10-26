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
class TestMethod extends Thread
{
    public void run()
    {
        System.out.println("Running");
    }
}
public class Thread_getName_setName_getId_Methods {
    public static void main(String[] arg)
    {
        TestMethod t1=new TestMethod();
        TestMethod t2=new TestMethod();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId()); 
        t1.start();
        t2.start();
        
        
        t1.setName("Tarun Verma");
        t2.setName("yash Verma");
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        
    }
    
}
