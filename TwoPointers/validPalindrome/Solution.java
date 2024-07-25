package TwoPointers.validPalindrome;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "A man, a plan, a canal: Panama"; // Output: true
        String s2 = "race a car"; // Output: false
        String s3 = " "; // Output: true

        System.out.println(solution.isPalindrome(s1)); // true
        System.out.println(solution.isPalindrome(s2)); // false
        System.out.println(solution.isPalindrome(s3)); // true
    }

    public boolean isPalindrome(String s) {
       if(s.length() <= 1) return true;

       s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

       int left = 0;
       int right = s.length() - 1;

       while(left < right) {
        if(s.charAt(left) != s.charAt(right)) return false;

        left++;
        right--;
       }

        return true;
    }
}
