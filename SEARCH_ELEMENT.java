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
public class SEARCH_ELEMENT {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<ArrayList> a1=new ArrayList<ArrayList>();
        
        int a=scan.nextInt();
        for(int k=0;k<a;k++)
        {
            int n=scan.nextInt();
            ArrayList<Integer> a2=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                a2.add(scan.nextInt());
            }
            a1.add(a2);
        }
        int x=scan.nextInt()-1;
        int y=scan.nextInt()-1;
        if(x<a1.size()&&y<a1.get(x).size())
        {
            System.out.println(a1.get(x).get(y));
        }
        else
        {
            System.out.println("Error!!");
        }
    }
    
}
