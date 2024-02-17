package KthSmallestElement;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newArr.add(matrix[i][j]);
            }
        }
        Collections.sort(newArr);
        return newArr.get(k - 1);
    }
}
