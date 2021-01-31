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
abstract class GCD
{
  abstract int findGCD(int x,int y);
}
class A extends GCD
{
int x;
int y;
 void getData()
  {
  Scanner scan=new Scanner(System.in);
  x=scan.nextInt();
  y=scan.nextInt();
  }
	int findGCD(int n1,int n2)
    {
    if (n2 != 0)
            return findGCD(n2, n1 % n2);
        else
            return n1;
    }
}
public class FindGCDOf2NumbersUsingRecursion {
    public static void main(String[] arg)
    {
         A a=new A();
      a.getData();
      System.out.println(a.findGCD(a.x,a.y));
    }
    
}
