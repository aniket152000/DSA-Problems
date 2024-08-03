package EqualPairs;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static int equalPairs(int[][] grid) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            if (map.containsKey(Arrays.toString(grid[i]))) {
                map.put(Arrays.toString(grid[i]), map.get(Arrays.toString(grid[i])) + 1);
            } else {
                map.put(Arrays.toString(grid[i]), 1);
            }
        }

        int newArray[] = new int[grid.length];
        int count = 0;
        for (int j = 0; j < grid.length; j++) {
            for (int k = 0; k < grid.length; k++) {
                newArray[k] = grid[k][j];

            }
            if (map.containsKey(Arrays.toString(newArray))) {
                count = count + map.get(Arrays.toString(newArray));

            }

        }
        return count;
    }

    public static void main(String[] args) {

        int grid[][] = { { 3, 1, 2, 2 },
                { 1, 4, 4, 4 },
                { 2, 4, 2, 2 },
                { 2, 5, 2, 2 } };

        int val = equalPairs(grid);

        System.out.println(val);

    }
}
