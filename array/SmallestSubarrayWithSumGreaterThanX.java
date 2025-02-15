package array;

public class SmallestSubarrayWithSumGreaterThanX {
public static void main(String[] args) {
    int[] arr = { 1, 4, 45, 6, 0, 19 };
        int x = 51;
        int result = smallestSubarrayWithSumGreaterThanX(arr, x);
                if (result == -1) {
                    System.out.println("No subarray with sum greater than " + x);
                } else {
                    System.out.println("The smallest subarray with sum greater than " + x + " has length: " + result);
                }
        }
        
        private static int smallestSubarrayWithSumGreaterThanX(int[] arr, int x) {
            int n = arr.length;
            int minLength = Integer.MAX_VALUE; // Initialize with a large value
            int currentSum = 0;
            int start = 0;
            for (int end = 0; end < n; end++) {
                // Add the current element to the current sum
                currentSum += arr[end];
                // Shrink the window from the left as much as possible while maintaining the sum
                // > x
                while (currentSum > x) {
                    // Update the minimum length of the subarray
                    minLength = Math.min(minLength, end - start + 1);
    
                    // Subtract the element at the 'start' of the window and move the start pointer
                    currentSum -= arr[start];
                    start++;
                }
            }
            // If minLength is unchanged, it means no such subarray was found
            return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
        }
}
