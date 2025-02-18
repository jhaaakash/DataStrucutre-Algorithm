package array;

public class MinimumInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Expected Output is 1 here
        //Explanation: The smallest element is 1
        int min=bruteForceMin(arr); // First Approach
        System.out.println("Answer with first appraoch:"+min);  
                
        int min2=optimizedMin(arr); // First Approach
        System.out.println("Answer with Second appraoch:"+min2);    
                        
        }
                        
        private static int optimizedMin(int[] arr) {
            int n = arr.length;
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] < arr[high]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return arr[low];                                       
        }                                   
                
        private static int bruteForceMin(int[] arr) {
            int n = arr.length;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                min = Math.min(min, arr[i]);
               
            }
         return min;
}
}
