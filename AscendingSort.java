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
public class AscendingSort {
    public static void main(String[] arg)
    {
        
    int a[]=new int[5];
    Scanner in = new Scanner(System.in);
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    for(int i=0;i<5;i++)
    {
        a[i] = in.nextInt();
        queue.add(a[i]);
    }
    while (queue.isEmpty() == false)
    System.out.printf("%d ", queue.remove());
    }
    
}
