package DivideArray;

import java.util.Arrays;

public class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {

            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
