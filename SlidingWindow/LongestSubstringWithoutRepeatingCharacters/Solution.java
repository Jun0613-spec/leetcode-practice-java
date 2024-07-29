package SlidingWindow.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "abcabcbb"; //output 3
        String s2 = "bbbbb"; //output 1
         String s3 = "pwwkew"; //ouput 3

        System.out.println(solution.lenghOfLongestSubstring(s));
         System.out.println(solution.lenghOfLongestSubstring(s2));
        System.out.println(solution.lenghOfLongestSubstring(s3));
    }
    
    //Time O(n)
    //Sapce O(n)
    public int lenghOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();

       int start = 0, end = 0, maxLen = 0;

       while(end < s.length()) {
        if(set.contains(s.charAt(end))) {
            set.remove(s.charAt(start));
            start++;
        } else {
            set.add(s.charAt(end));
            end++;
            
            maxLen = Math.max(maxLen, end - start);
        }
       }

       return maxLen;
    }
}
