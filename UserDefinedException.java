/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Mind_Coder
 */
public class UserDefinedException {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        try{
            float length=scan.nextFloat();
            float breath=scan.nextFloat();
            if(length<=0||breath<=0)
            {
                throw new RectangleException(" InvalidRectangleException");
                
                
            }
            else{
                float perimeter = 2*(length+breath);
                float area=length*breath;
                System.out.println("Perimeter of the Rectangle = "+perimeter);
                System.out.println("Area of the Rectangle = "+area);
            }
            
        }
        catch(RectangleException msg){
            System.out.println(msg);
            
        }
    }
    
}
class RectangleException extends Exception{
    RectangleException(String msg)
    {
        super(msg);
    }
    
}
