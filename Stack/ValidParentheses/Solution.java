package Stack.ValidParentheses;

import java.util.Stack;

public class Solution {
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "([{}])";
        String s2 = "([)]";
        String s3 = "{[]}";

        System.out.println(solution.isValid(s1)); // true
        System.out.println(solution.isValid(s2)); // false
        System.out.println(solution.isValid(s3)); // true
    }
    
    //Time O(n)
    //Space O(n)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '{') {
                stack.push('}');
            } else if(ch == '(' ) {
                stack.push( ')' );
            } else if (ch == '[') {
                stack.push(']');
            } else {
                if(stack.isEmpty() || stack.pop() != ch) return false;
            }
        }
       
        return stack.isEmpty();
    }
}
