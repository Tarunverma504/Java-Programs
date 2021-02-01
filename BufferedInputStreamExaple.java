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
import java.io.FileInputStream;
public class BufferedInputStreamExaple {
    public static void main(String[] arg)throws Exception
    {
           FileInputStream fin=new FileInputStream("E:\\testout");
            BufferedInputStream bin=new BufferedInputStream(fin);
            
            int i;
            while((i=bin.read())!=-1)
            {
                System.out.println((char) i);
                
            }
            bin.close();
            fin.close();
            System.out.println("Scuess");
            
            
        
    }
    
    
}
