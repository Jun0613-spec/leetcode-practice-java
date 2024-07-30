package BinarySearch.FindMinimumInRotatedSortedArray;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {11, 13, 15 , 17};

        System.out.println(solution.findMin(nums1)); //Output: 1
        System.out.println(solution.findMin(nums2)); //Output: 0
        System.out.println(solution.findMin(nums3)); //Output: 11
    }
    
    //Time O(log n)
    //Space O(1)
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            if(nums[left] <= nums[right]) return nums[left];

            int mid = (left + right) / 2;
            if(nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
       return 0;
    }
}
