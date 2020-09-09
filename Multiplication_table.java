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
import java.util.*;
public class Multiplication_table {
    public static void main(String []arg){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the number:-");
        int a=scan.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
    
    
}
