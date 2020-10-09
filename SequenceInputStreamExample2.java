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
public class SequenceInputStreamExample2 {
    public static void main(String[] arg)throws Exception
    {
        FileInputStream fin1=new FileInputStream("E:\\testout1");
        FileInputStream fin2=new FileInputStream("E:\\testout2");
        FileOutputStream fout=new FileOutputStream("E:\\testout3");
        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
        int i=0;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fin1.close();
        fin2.close();
        fout.close();
        System.out.println("Sucess");
        
    }
    
}
