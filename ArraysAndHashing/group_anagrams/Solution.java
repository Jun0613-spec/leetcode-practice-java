package ArraysAndHashing.group_anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs1 = {"eat","tea","tan","ate","nat","bat"}; //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] strs2 = {""}; //Output: [[""]]
        String[] strs3 = {"a"}; //Output: [["a"]]

        System.out.println(solution.groupAnagrams(strs1));
        System.out.println(solution.groupAnagrams(strs2));
        System.out.println(solution.groupAnagrams(strs3));
    }
    
    //Time O(n * k)
    //Space O(n * k)
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            int[] counter = new int[26];

            for(char ch : word.toCharArray()) {
                counter[ch-'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();

            for(int count : counter) {
                keyBuilder.append(count).append("#");
            }

            String key = keyBuilder.toString();

            if(!map.containsKey(key)) map.put(key, new ArrayList<>());

            map.get(key).add(word);
        }

       return new ArrayList<>(map.values());
    } 

    // public List<List<String>> groupAnagrams(String[] strs) {
    //     if(strs == null || strs.length == 0) return new ArrayList<>();

    //    Map<String,List<String>> map = new HashMap<>();

    //    for(String word : strs) {
    //      int[] counter = new int[26];

    //      for(char ch : word.toCharArray()) {
    //         counter[ch - 'a']++;
    //      }

    //      StringBuilder keyBuilder = new StringBuilder();

    //      for(int count : counter) {
    //         keyBuilder.append(count).append("#");
    //      }

    //      String key = keyBuilder.toString();

    //      if(!map.containsKey(key)) map.put(key, new ArrayList<>());

    //      map.get(key).add(word);
    //    }

    //    return new ArrayList<>(map.values());
    // } 
}
