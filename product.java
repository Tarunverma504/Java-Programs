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
public class product implements Serializable {
     int id;
    String name,color;
    float price;
    product(int id,String name,String color,float price)
    {
       this.id=id;
       this.name=name;
       this.color=color;
       this.price=price;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <product> a =new ArrayList <product>();
        try{
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("productinfo.txt"));
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("productinfo.txt"));
        for(int i=0;i<2;i++)
        {
             int id=sc.nextInt();
             sc.nextLine();
           String name=sc.nextLine();
           String color=sc.nextLine();
             float price= sc.nextFloat();
            a.add(new product(id,name,color,price)); 
            
        }
        obj.writeObject(a.get(0));
        obj.writeObject(a.get(1));
        obj.close();
        
        System.out.println(obj1.readObject());
        System.out.println(obj1.readObject());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public String toString()
        {
          return id+" "+name+" "+color+" "+price;
        }
}
