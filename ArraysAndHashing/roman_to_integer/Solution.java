package ArraysAndHashing.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

//Time O(n)
//Space O(1)
public class Solution {
    public static void main(String[] args) {

        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if(currentVal < nextVal) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
        
    }
}
