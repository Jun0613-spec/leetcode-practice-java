package TwoPointers.is_subsequence;

//Time O(n)
//Space O(1)
public class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc" ));    // true
        System.out.println(isSubsequence("axc","ahbgdc"));  //false
    }

    public static boolean isSubsequence(String s, String t) {
      if(s.length() > t.length()) return false;

      int sp = 0;
      int tp = 0;

      while(sp < s.length() && tp < t.length()) {
        if(s.charAt(sp) == t.charAt(tp)) {
            sp++;
        }
        tp++;
      }

      return sp == s.length();
    }
}
