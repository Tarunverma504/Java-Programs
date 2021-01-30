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

ArrayList Operations
Complete the code to perform the following operations on arraylist of integers based on the choice of operation.
5
101
Java
Balaguruswamy
101 Java Balaguruswamy Yes
103 Operating System Galvin Yes
104 Python Pankaj Yes
102 Computer Networks Tanenbaum No
4/15/2019 CU Exams
https://admin.exam.chitkara.edu.in/test/preview?test_id=62b7c371-8d91-4a79-90be-dec02437d1c6&branch_id=7a4955c1-ae99-4872-9896-2126f0… 21/45
Options and operation
1-> add element
2-> add at specified position
3-> number of element in the list
4-> remove an element of specified index
5-> print the element of specified index
6-> remove all elements from the list
7-> sort the list
8-> update the value of element at specified index
9-> display all element of the list
Input Format
1 // add element (choice)
11 // element
1 // add element (choice)
22 // element
1 // add element (choice)
33 // element
9 // display all element of the list (choice)
2 // add at specified position (choice)
1 // position or index
45 // element
9 // display all element of the list (choice)
5 // print the element of specified index (choice)
2 // index
9 // display all element of the list (choice)
20 // choice (If choice>9, then exit)
Output Format
[11, 22, 33]
[11, 45, 22, 33]
22
[11, 45, 22, 33]

*/
public class ArrayListOperations {
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        while(true)
        {
            int choice=scan.nextInt();
            if(choice>9)
            {break;}
            else{
                switch(choice)
                {
                    case 1:{int s=scan.nextInt();
                        a.add(s);
                        break;
                    }
                    case 2:{int index=scan.nextInt();
                        int s=scan.nextInt();
                        a.add(index,s);
                        break;
                    }
                    case 3:{
                        System.out.println(a.size());
                        break;
                    }
                    case 4:{
                        int index=scan.nextInt();
                        a.remove(index);
                        break;
                    }
                    case 5:{
                        System.out.println(a.get(scan.nextInt()));
                        break;
                    }
                    case 6:{
                        a.clear();
                        break;
                    }
                    case 7:{
                        Collections.sort(a);
                        break;
                    }
                    case 8:{
                        a.set(scan.nextInt(), scan.nextInt());
                        break;
                    }
                    case 9:{
                        System.out.println(a);
                    }
                }
            }
        }
    }
    
}
