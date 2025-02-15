package array;

public class MaximumSubarraySum  {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        //Expected Output is 7 here
        //Explanation: The largest contiguous subarray sum is formed by the subarray [4, -1, -2, 1, 5]
        int maxSum=bruteForceMaxSum(arr); // First Approach
        System.out.println("Answer with first appraoch:"+maxSum);  
        
        int maxSum2=prefixSumMax(arr); // First Approach
        System.out.println("Answer with Second appraoch:"+maxSum2);    
                
                
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

        //Second Appraoch
        private static int prefixSumMax(int[] arr) {
            int n = arr.length;
        int[] prefixSum = new int[n+1]; // to store the prefix sum
        for (int i = 0; i < n; i++) {
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }
        System.out.println("Second appraoch");
       
        int maxSum = Integer.MIN_VALUE;
        
        // Iterate over all subarrays and find the sum using prefixSum
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                int currentSum = prefixSum[end] - prefixSum[start];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }

}
