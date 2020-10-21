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
class StringManipulation
{
    String str;
StringManipulation(String str)
  {
    this.str=str;
  }
String vowelSwap()
  {
    int i=0;
    if(str.length()<=1)
      return str;
    else
    {
      char [] array=str.toCharArray();
      int a=0,b=array.length-1;
      while(a<b)
        {
            //If both the letters are vowel then swap the letters
            if(isVowel(array[a]) && isVowel(array[b]))
            {
                char temp=array[a];
                array[a]=array[b];
                array[b]=temp;
                a++;b--;
            }
            // if only character at position a is vowel
            else if(isVowel(array[a]) && !isVowel(array[b]))
            {
                b--;
            }
            // if only character at position b is vowel
            else
            {
                a++;
            }
                
        }
        return new String(array);
    }
  }
boolean isVowel(char c)
  {
  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
    return true;
  else
    return false;
  }
}

public class SwapVowel {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        String input=scan.next();
        StringManipulation sm=new StringManipulation(input);
        System.out.println(sm.vowelSwap());
    }
    
}
