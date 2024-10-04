package PrefixSum;

//Time O(n)
//Space O(1)
public class FindTheHighestAltitude {
    public static void main(String[] args) {
        System.out.println(highestAltitude(new int[]{-5, 1, 5, 0, -7})); // Output: 1
        System.out.println(highestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})); // Output: 0
    }

    public static int highestAltitude(int[] gain) {
        int curr = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++) {
            curr += gain[i];

            if(curr > max) {
                max = curr;
            }
        }

        return max;
    }
}
