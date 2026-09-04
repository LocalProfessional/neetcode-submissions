/** Sept 4th, 2026
    Contains Duplicate
    @author Ahmad Saleh
*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) { // Pick an element in nums starting from the first one
            for (int j = i + 1; j < nums.length; j++) { // For every element after that, check if they are equal
                if (nums[j] == nums[i]) {
                    return true; // If so, we have a duplicate
                }
            }
        }

        return false;
    }
}