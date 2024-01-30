package MajorityElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 3;
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int num = nums[i];

            while (i < (nums.length - 1) && num == nums[i + 1]) {
                count++;
                i++;
            }
            if (count > n) {
                newList.add(nums[i]);
            }
        }
        return newList;
    }
}
