package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int tofind = target - nums[i];
            if (hmap.containsKey(tofind)) {
                return new int[] { hmap.get(tofind), i };
            }
            hmap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
