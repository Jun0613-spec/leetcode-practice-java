package TwoPointers.trapping_rain_water;

//Time O(n)
//Space O(1)
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1}; //output 6
        int[] height2 = {4,2,0,3,2,5}; //output 9

        System.out.println(solution.trap(height));
        System.out.println(solution.trap(height2));
    }

    public int trap(int[] height) {
       int left = 0;
       int right = height.length - 1;
       int leftMax = 0;
       int rightMax = 0;
       int trappedWater = 0;

       while(left <= right) {
        if(height[left] < height[right]) {
           if(height[left] >= leftMax) {
              leftMax = height[left];
           } else {
            trappedWater += leftMax - height[left];
           }
           left++;
        } else {
            if(height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                trappedWater += rightMax - height[right];
            }  
            right--;
        }
       }

       return trappedWater;
    }
}
