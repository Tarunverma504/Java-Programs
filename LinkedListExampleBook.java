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
import java.util.*;
class Books{  
int id;  
String name,author,publisher;  
int quantity;  
public Books(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class LinkedListExampleBook {
     public static void main(String[] arg)
     {
         //Creating list of Books  
    LinkedList<Books> list=new LinkedList<Books>();  
    //Creating Books  
    Books b1=new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Books b2=new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Books b3=new Books(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(Books b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
     }
    
}
