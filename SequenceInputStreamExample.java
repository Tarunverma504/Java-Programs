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
import java.io.*;
public class SequenceInputStreamExample {
    public static void main(String[] arg)throws Exception
    {
        FileInputStream fin1=new FileInputStream("E:\\testout1");
        FileInputStream fin2=new FileInputStream("E:\\testout2");
        
        SequenceInputStream inst=new SequenceInputStream(fin1,fin2);
        int j;
        while((j=inst.read())!=-1)
        {
            System.out.println((char)j);
        }
        inst.close();
        fin1.close();
        fin2.close();
        System.out.println("Success");
        
        
    }
    
}
