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

class books implements Comparable<books>{  
int id;  
String name,author,publisher;  
int quantity;  
public books(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
} 
public int compareTo(books b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  

public class TreeSetExample3 {
    public static void main(String[] arg)
    {
        Set<books> set=new TreeSet<books>();  
    //Creating Books  
    books b1=new books(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    books b2=new books(233,"Operating System","Galvin","Wiley",6);  
    books b3=new books(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(books b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
    }
    
}
