/**
   Sept 4th, 2026
    Concatenation of Array
    @author Ahmad Saleh
    */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length]; // Create the array of length 2n
        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) { // Copy the first n elements from nums
                ans[i] = nums[i];
            } else if (i >= nums.length) { // For the last half, start over from the beginning of nums
                ans[i] = nums[i - nums.length];
            }
        }

        return ans;
    }
}