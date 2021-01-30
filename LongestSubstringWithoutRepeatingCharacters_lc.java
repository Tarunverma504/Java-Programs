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

Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
    
*/
public class LongestSubstringWithoutRepeatingCharacters_lc {
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:-");
        String str=scan.nextLine();
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        int i=0,max=0,left=0;
        HashSet<Character> h=new HashSet();
        while(i<s.length()){
            if(!h.contains(s.charAt(i)))
            {
                h.add(s.charAt(i));
                max=Math.max(h.size(),max);
                i++;
            }
            else
            {
               h.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
    
    
}
