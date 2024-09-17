package ArraysAndHashing.jump_game2;

//Time O(n)
//Space O(1)
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution(); 

        int[] nums1 = {2,3,1,1,4}; //Output: 2
        int[] nums2 = {2,3,0,1,4}; //Output: 2
        
        System.out.println(solution.jump(nums1));
        System.out.println(solution.jump(nums2));
    }

    public int jump (int[] nums) {
       int jump = 0;
       int currentEnd = 0;
       int farthest = 0;

       for(int i = 0; i < nums.length - 1; i++) {
        farthest = Math.max(farthest, i + nums[i]);

        if(i == currentEnd) {
            jump++;
            currentEnd = farthest;
        }
       }

       return jump;
    }
}
