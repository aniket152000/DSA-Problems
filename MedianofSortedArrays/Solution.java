package MedianofSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newArr[] = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, newArr, 0, nums1.length);

        System.arraycopy(nums2, 0, newArr, nums1.length, nums2.length);

        Arrays.sort(newArr);

        for (int i = 0; i < newArr.length; i++) {
            if (newArr.length % 2 == 0) {
                int a = (newArr.length / 2) - 1;
                int b = (newArr.length / 2);

                double mid = newArr[a] + newArr[b];
                double res = mid / 2;
                return res;
            } else {
                int a = (newArr.length / 2);
                double mid = newArr[a];
                return mid;
            }
        }
        return 0;
    }
}
