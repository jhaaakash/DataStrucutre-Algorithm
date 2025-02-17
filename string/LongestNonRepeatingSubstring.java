package string;

import java.util.HashMap;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String str = "Aakash"; // Test string
        String result = longestNonRepeatingSubstring(str);
        System.out.println("Longest non-repeating substring length: " + result);
    }

    private static String longestNonRepeatingSubstring(String str) {
        /*
         * int n = str.length();
         * int res = 0; // Result
         * int[] lastIndex = new int[256];
         * int i = 0;
         * for (int j = 0; j < n; j++) {
         * i = Math.max(i, lastIndex[str.charAt(j)] + 1);
         * res = Math.max(res, j - i + 1);
         * lastIndex[str.charAt(j)] = j;
         * }
         * return String.valueOf(res);
         */
        int n = str.length();
        int right = 0;
        int left = 0;
        int start = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            char c = str.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
            right++;

        }
        return str.substring(start, start + maxLength);
    }
}
