package SlidingWindow.LongestRepeatingCharacterReplacement;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "ABAB"; 
        int k1 = 2; 
        String s2 = "AABABBA";
        int k2 = 1; 

        System.out.println(solution.characterReplacement(s1, k1)); // Output: 4
        System.out.println(solution.characterReplacement(s2, k2)); // Output: 4
    }
    
    //Time O(n)
    //Space O(1)
    public int characterReplacement (String s, int k) {
       int maxLen = 0;
       int[] count = new int[26];
       int start = 0;
       int maxFreq = 0;

       for(int end = 0; end < s.length(); end++) {
        count[s.charAt(end) - 'A']++;
        maxFreq = Math.max(maxFreq, count[s.charAt(end) - 'A']);

        if(end - start + 1 - maxFreq > k) {
            count[s.charAt(start) - 'A']--;
            start++;
        }

        maxLen = Math.max(maxLen, end - start + 1);
       }


       return maxLen;
    }
}
