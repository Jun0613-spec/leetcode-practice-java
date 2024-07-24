package ArraysAndHashing.valid_anagram;

 class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

          // Example 1
          String s1 = "anagram";
          String t1 = "nagaram";
          System.out.println(solution.isAnagram(s1, t1)); // Output: true
  
          // Example 2
          String s2 = "rat";
          String t2 = "car";
          System.out.println(solution.isAnagram(s2, t2)); // Output: false
    }
    /**
     * @param s
     * @param t
     * @return
     * Time O(n)
     * Space O(1)
     */
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       
       int[] counter = new int[26];

       for(int i = 0; i < s.length(); i++) {
          counter[s.charAt(i) - 'a']++;
          counter[t.charAt(i) - 'a']--;
       }

       for(int count : counter) {
        if(count != 0) return false;
       }

    
       return true;
    }

   
}
