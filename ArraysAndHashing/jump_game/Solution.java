package ArraysAndHashing.jump_game;

//Time O(n)
//Space O(1)
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2,3,1,1,4}; //Output: true
        int[] nums2 = {3,2,1,0,4}; //Output: false
        
        System.out.println(solution.canJump(nums1));
        System.out.println(solution.canJump(nums2));
    }

    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for(int i = 0; i  < nums.length; i++) {
            if(maxReach < i) return false;

            maxReach = Math.max(maxReach, i + nums[i]);

            if(maxReach >= nums.length - 1) return true;
        }
        
        return false;
    }
}
