/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Mind_Coder
 */

/*

User has to create a phone book and later on which can be used to query. The phone book contains entries consists of people's names and
their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
Input Format
The first line will have an integer denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding
phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Output Format
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output
for the exact format.
Constraints
Given that: Phone number is 5 digit long.
*/
public class PhoneBook {
    public static void main(String[] arg)
    {
        HashMap<String,String> m=new HashMap<String,String>();
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<x;i++)
        {
            m.put(scan.nextLine(),scan.nextLine());
        }
        //System.out.println(m);
        String query = scan.nextLine();
        if(m.containsKey(query))
        {
            System.out.println(query+"="+m.get(query));
        }
        else
            System.out.println("Not Found");
            
    }
    
}
