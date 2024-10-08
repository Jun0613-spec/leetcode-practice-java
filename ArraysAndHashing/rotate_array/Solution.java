package ArraysAndHashing.rotate_array;

import java.util.Arrays;

//Time O(k + n)
//Space O(k + n)
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,2,3,4,5,6,7}; //Output: [5,6,7,1,2,3,4]
        int[] nums2 = {-1,-100,3,9}; //Output: [3,99,-1,-100]
        
        int k1 = 3;
        int k2 = 2;


        solution.rotate(nums1, k1);
        solution.rotate(nums2, k2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
       
    }

    public void rotate(int[] nums, int k) {
       k = k % nums.length;

       reverse(nums, 0, nums.length  - 1);
       reverse(nums, 0, k - 1);
       reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    
}
