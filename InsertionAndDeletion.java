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

Q5. INSERTION AND DELETION
There are two operations Insert and Delete in the code. For example to Insert y at index x then use:
Insert
x y
Delete the element at x then use:
Delete
x
Input Format
The rst line contains an integer,  (the initial number of elements in List, L
The second line contains N space-separated integers describing L. 
The third line contains an integer,  Q (the number of queries). 
If the rst line of a query contains the String Insert, then the second line contains two space separated integers x y, and the
value y must be inserted into  L at index x .
If the rst line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.
Sample Input:
5
12 0 1 78 12
2
Insert
5 23
Delete
0
Output Format
There is list L with ‘N’ number of integers, perform ‘Q’ queries on the list.
Once all queries are completed, Print the updated list L as a single line of space-separated integers.
Sample Output:
0 1 78 12 23
Explanation:
L= [12, 0, 1, 78, 12]
Insert 23 at index 5
L= [12, 0, 1, 78, 12, 23]
Delete element at index 0
L= [0, 1, 78, 12, 23]

*/
public class InsertionAndDeletion {
    public static void main(String[] arg)
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        for(int i=0;i<x;i++)
        {
            l.add(scan.nextInt());
        }
        int n=scan.nextInt();
        for(int j=0;j<n;j++)
        {
            String a=scan.next();
            if(a.equals("Insert"))
            {
                int p=scan.nextInt();
                int q=scan.nextInt();
                l.add(p,q);
            }
            else
            {
                int Q=scan.nextInt();
                l.remove(Q);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
          
    }
    
}
