package array;

public class MaximumSubarraySum  {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        //Expected Output is 7 here
        //Explanation: The largest contiguous subarray sum is formed by the subarray [4, -1, -2, 1, 5]
        int maxSum=bruteForceMaxSum(arr); // First Approach
        System.out.println("Answer with first appraoch:"+maxSum);    
        
        
    }
    //First Approach
    public static int bruteForceMaxSum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;  
        // Loop through all possible subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
}



}
