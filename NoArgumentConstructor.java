/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author TARUN VERMA
 */
class student
{
    int num;
    String name;
    student()
    {
        System.out.println("Constructor called");
    }
    
}
public class NoArgumentConstructor {
    String name;
    String rollno;
    NoArgumentConstructor()
    {
        name="tarun";
        rollno="1910990504";
    }
    public static void main(String []arg)
    {
        //this would invokwe while an object of that class is created
        student s1=new student();
        NoArgumentConstructor s2=new NoArgumentConstructor();
        //default constuctor provide default value to object like 0,null
        System.out.println(s1.name);
        System.out.println(s1.num);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
    }
}
