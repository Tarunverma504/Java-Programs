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
public class AverageOfFiveSubjects {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Enter the Marks of Eng:-");
        int eng=scan.nextInt();
        System.out.printf("Enter the Marks of Maths:-");
        int math=scan.nextInt();
        System.out.printf("Enter the Marks of Science:-");
        int sci=scan.nextInt();
        System.out.printf("Enter the Marks of Hindi:-");
        int hindi=scan.nextInt();
        System.out.printf("Enter the Marks of Sst:-");
        int sst=scan.nextInt();
        int Total=eng+math+sci+hindi+sst;
        int avg=Total/5;
        System.out.println("Average:-"+avg);
    }
    
}