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
import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String[] arg)
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("E:\\testout");
            fout.write(84);
            fout.write(65);
            fout.write(82);
            fout.write(85);
            fout.write(78);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
    
}
