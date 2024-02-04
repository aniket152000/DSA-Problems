package RearrangeArraybySign;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length / 2];
        int neg[] = new int[nums.length / 2];
        int result[] = new int[nums.length];
        int size1 = 0;
        int size2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg[size1] = nums[i];
                size1++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (nums[i] > 0) {
                pos[size2] = nums[i];
                size2++;
            }
        }

        size1 = 0;
        size2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = pos[size1];
                size1++;
            } else {
                result[i] = neg[size2];
                size2++;
            }
        }
        return result;
    }
}
