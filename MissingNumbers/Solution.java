package MissingNumbers;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}
