package crioDSA;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
    public static int partition(int[] arr, int beg, int end) {
        int pivot=end, low=beg, high=end-1;
        while(low<=high) {
            if(arr[low]<arr[pivot]) {
                low++;
            }
            else {
                swap(arr, low, high);
                high--;
            }
        }
        swap(arr, low, pivot);
        return low;
    }
    public static void quickSort(int[] arr, int beg, int end) {
        if (beg==end) {
            debug(arr, beg, end, "Skipping single element array");
        }
        if (beg<end) {
            debug(arr, beg, end, "Starting to sort");
            int p = partition(arr, beg, end);
            debug(arr, beg, end, "After Partition");
            quickSort(arr, beg, p-1);
            quickSort(arr, p+1, end);
            debug(arr, beg, end, "After Sorting");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,8,3,1,5,4};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
    
    public static void debug(int[] arr, int beg, int end, String step) {
        System.out.println(String.format("%s (%d, %d): %s", step, beg, end, subArray(arr, beg, end)));
    }
    public static String subArray(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder("[");
        for (int i=start; i<=end; i++) {
            sb.append(arr[i]+", ");
        }
        sb.setLength(sb.length()-2);
        sb.append("]");
        return sb.toString();
    }
    
}
