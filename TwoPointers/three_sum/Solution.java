package TwoPointers.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-1, 0, 1, 2, -1, -4}; // Output: [[-1, -1, 2], [-1, 0, 1]]
        int[] nums2 = {}; // Output: []
        int[] nums3 = {0}; // Output: []

        System.out.println(solution.threeSum(nums1)); // [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(solution.threeSum(nums2)); // []
        System.out.println(solution.threeSum(nums3)); // []
    }
    
    //Time O(n)^2
    //Space O(n)

    /** 
     *   i   l            
     * [-4, -1, -1, 0, 1, 2]
     *                    r
     */
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(nums);

       for(int i = 0; i < nums.length - 2; i++) {
         if(i > 0 && nums[i] == nums[i - 1]) continue;

         int left = i + 1;
         int right = nums.length - 1;

         while(left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if(sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                while(left < right && nums[left] == nums[left + 1]) left++;
                while(left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            }
         }
       }
       return result;
    }
}
