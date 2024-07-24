package ArraysAndHashing.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2,7,11,15};
        int target1 = 9; 
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println(result1[0] + "," + result1[1]); // Output: [0,1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println(result2[0] + "," + result2[1]); // Output: [1,2]

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println(result3[0] + "," + result3[1]);; // Output: [0,1]
    }
    
    // Time O(n)
    // Space O(n)
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();

      for(int i = 0; i < nums.length; i++) {
        int numToFind = target - nums[i];

        if(map.containsKey(numToFind)) return new int[] {map.get(numToFind), i};

        map.put(nums[i], i);
      }

      return new int[] {-1, -1};
    }
}
