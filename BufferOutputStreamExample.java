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
import java.io.FileOutputStream;
public class BufferOutputStreamExample {
    public static void main(String[] arg)throws Exception
    {
        FileOutputStream fout=new FileOutputStream("E:\\testout");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome To javapoint";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
        
    }
    
}
