/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author TARUN VERMA
 */
public class Book {
    String book_id="121-324-0123";
    String book_name="Darcy Bennet";
    int book_price=550;
    String book_title="Whispers of heart";
    
    static void display(){
        System.out.println("Book");
    }
    public void get_method(String book_id,String book_name,int book_price,String book_title){
        System.out.println(book_id+" "+book_name+" "+ book_price+" "+book_title);
    }
    public void return_method(String book_id,String book_title)
    {
        System.out.println(book_id+" "+book_title);
    }
    public static void main(String []arg){
        Book s=new Book();
        display();
        s.get_method(s.book_id,s.book_name,s.book_price,s.book_title);
        s.return_method(s.book_id,s.book_title);
    }
}
