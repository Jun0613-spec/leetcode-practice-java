package Hash.containsDuplicate;

import java.util.HashSet;

//Time O(n)
//Space O(n)
public class Solution {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1})); // Output: true
        System.out.println(containsDuplicate(new int[]{1,2,3,4})); // Output: false
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2})); // Output: true
    }

    public static boolean containsDuplicate(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) return true;

            set.add(nums[i]);
        }
       return false;
    }
}
