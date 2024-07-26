package SlidingWindow.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

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
       int maxLen = 0;
       int start = 0;
       int end = 0;
       HashSet <Character> set = new HashSet<>();

       while(end < s.length()) {
        if(set.contains(s.charAt(end))) {
            set.remove(s.charAt(start));
            start++;
        } else {
            set.add(s.charAt(end));
            end++;
            maxLen = Math.max(end - start, maxLen);
        }
       }
       return maxLen;
    }
}
