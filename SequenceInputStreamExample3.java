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
import java.util.*;
public class SequenceInputStreamExample3 {
    public static void main(String[] arg)throws Exception
    {
        FileInputStream fin1=new FileInputStream("E:\\testout1");
        FileInputStream fin2=new FileInputStream("E:\\testout2");
        FileInputStream fin3=new FileInputStream("E:\\testout3");
        Vector v=new Vector();
        v.add(fin1);
        v.add(fin2);
        v.add(fin3);
        Enumeration e=v.elements();
        SequenceInputStream sis=new SequenceInputStream(e);
        int i=0;
        while((i=sis.read())!=-1)
        {
           System.out.println((char)i);
        }
        sis.close();
        fin1.close();
        fin2.close();
        fin3.close();
        System.out.println("Sucess");
        
    }
    
}
