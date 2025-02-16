package array;

import java.util.Arrays;

public class TripletSumProblemWithGivenTarget {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9}; // Example array
        int target = 24; // Example target sum
        
        // Call the function to find triplets
        findTriplets(arr, target);
                
            }
        
            private static void findTriplets(int[] arr, int target) {
                //sort the array
                Arrays.sort(arr);
                //iterate over the array
                for(int i = 0; i < arr.length - 2; i++) {
                    int left = i + 1;
                    int right = arr.length - 1;
                    while(left < right) {
                        if(arr[i] + arr[left] + arr[right] == target) {
                            System.out.println("Triplet is " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                            return;
                        } else if(arr[i] + arr[left] + arr[right] < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
                
            }
}
