package ArraysAndHashing.contains_duplicate;

import java.util.HashSet;

class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();

     // Example 1
     int[] nums1 = {1, 2, 3, 1};
     System.out.println(solution.containsDuplicate(nums1)); // Output: true

     // Example 2
     int[] nums2 = {1, 2, 3, 4};
     System.out.println(solution.containsDuplicate(nums2)); // Output: false

     // Example 3
     int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
     System.out.println(solution.containsDuplicate(nums3)); // Output: true
}

    // // Time O(n)^2
    // // Space O(1)
    // public  boolean containsDuplicate(int[] nums ) {

    //     if(nums == null || nums.length == 1) return false;

    //     for(int i = 0; i < nums.length; i++) {
    //         for(int j = i + 1; j < nums.length; j++) {
    //             if(nums[i] == nums[j]) return true;
    //         }
    //     }
      
    //     return false;
    // }

    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 1) return false;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
          if(set.contains(num)) return true;

          set.add(num);
        }

        return false;
    }


   
}