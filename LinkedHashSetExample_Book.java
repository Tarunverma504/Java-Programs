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
import java.util.*;
class book {  
int id;  
String name,author,publisher;  
int quantity;  
public book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}
public class LinkedHashSetExample_Book {
    public static void main(String[] args) {  
    LinkedHashSet<book> hs=new LinkedHashSet<book>();  
    //Creating Books  
    book b1=new book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    book b2=new book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    book b3=new book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to hash table  
    hs.add(b1);  
    hs.add(b2);  
    hs.add(b3);  
    //Traversing hash table  
    for(book b:hs){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}
    

