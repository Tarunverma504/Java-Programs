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

Write a function named boolean hasDuplicateMappings() that

accepts a Map from strings to strings as a parameter and
returns true if any two keys map to the same value.
For example, if a map named map1 stores {Girdhar=Gopal, Code=Quotient, Hello=Hi, Mere=Gopal}, the call of hasDuplicateMappings(map1) would return true because both "Girdhar" and "Mere" map to the value "Gopal".

Return false if passed an empty or one-element map. Do not modify the map passed in.

*/
public class MapContainsSameRangeOrNot {
    public static boolean hasDuplicateMappings(Map<String, String> map) 
    {
      HashSet<String> h=new HashSet<String>();
      for(Map.Entry m:map.entrySet())
      {
        if(h.add((String) m.getValue()))
        {}
        else
          return true;
      }
      return false;

    }
    public static void main(String[] arg)
    {
        HashMap<String, String> map1 = new HashMap<String, String>();
        Scanner s=new Scanner(System.in);
        String s1,s2;
        int t;
        t=s.nextInt();
        while(t>0)
        {
          s1=s.nextLine();
          s2=s.nextLine();
          map1.put(s1,s2);
          t--;
        }
        boolean b1=hasDuplicateMappings(map1);
        System.out.println(b1);
    }
    
}
