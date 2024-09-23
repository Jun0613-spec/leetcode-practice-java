package ArraysAndHashing.length_of_last_word;

//Time O(n)
//Space O(1)
public class Solution {
    
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));    // Output: 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));  // Output: 4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));  // Output: 6
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();

        int lastSpaceIndex = s.lastIndexOf(' ');

        return s.length() - lastSpaceIndex - 1;
    }
}
