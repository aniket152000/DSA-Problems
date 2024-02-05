package FirstMissingPositive;

import java.util.Arrays;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int result = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] == result) {
                result++;
            }
        }
        return result;
    }
}
