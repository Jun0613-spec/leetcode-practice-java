package TwoPointers.move_zeroes;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(java.util.Arrays.toString(nums1));

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(java.util.Arrays.toString(nums2));
        
    }
    
    //Time O(n)
    //Space O(1)
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}
