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
import java.io.FileInputStream;
public class FileInputStreamExample {
    public static void main(String[] arg)
    {
        try
        {
            FileInputStream fn=new FileInputStream("E:\\testout");
            int i=fn.read();
            System.out.println((char)i);
            fn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
