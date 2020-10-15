/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TARUN VERMA
 */
public class Student {
    long Roll_no=1910990504;
    String Student_name="Tarun Verma";
    String Father_name="Vimal Verma";
    String Phone_no="6239495544";
     void display(){
    System.out.println(Roll_no+" "+Student_name+" "+Father_name+" "+Phone_no);
}
     public void modify(){
         Roll_no=123546758;
         Student_name="Karan";
         Father_name="Rakesh";
         Phone_no="3456712097";
     }
     public static void main(String args[])
     {
         Student s=new Student();
         s.display();
         s.modify();
         s.display();  
     }
}
