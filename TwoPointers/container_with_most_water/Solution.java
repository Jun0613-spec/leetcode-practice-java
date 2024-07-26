package TwoPointers.container_with_most_water;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] height = {1,8,6,2,5,4,8,3,7}; //output 49
        int[] height2 = {1, 2}; //output 1

        System.out.println(solution.maxArea(height));
        System.out.println(solution.maxArea(height2));
    }
    
    //Time O(n)
    //Space O(1)
    public int maxArea(int[] height) {
       int maxArea = 0;
       int left = 0;
       int right = height.length - 1;

       while(left < right) {
         int width = right - left;
         int minHeight = Math.min(height[left], height[right]);
         int area = width * minHeight;

         maxArea = Math.max(area, maxArea);

         if(height[left] < height[right]) {
            left++;
         } else {
            right--;
         }
       }

       return maxArea;
    }
}
