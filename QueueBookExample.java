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
class Boook implements Comparable<Boook>{
    int id;
    String name,author,publisher;
    int quantity;
    public Boook(int id,String name,String author,String publisher,int quantity)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
     
    }
    public int compareTo(Boook b){
        if(id>b.id)
            return 1;
        else if(id<b.id)
            return -1;
        else
            return 0;
    }
}
public class QueueBookExample {
    public static void main(String[] arg)
    {
        PriorityQueue<Boook> a=new PriorityQueue<Boook>();
        Boook b1=new Boook(121,"Let us C","Yashwant Kanetkar","BPB",8);  
        Boook b2=new Boook(233,"Operating System","Galvin","Wiley",6); 
        Boook b3=new Boook(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
        a.add(b1);
        a.add(b2);
        a.add(b3);
        System.out.println("Traversing the queue elements:");  
        for(Boook b:a){  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
        a.remove();  
        System.out.println("After removing one book record:");  
        for(Boook b:a){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
    }
    
}
