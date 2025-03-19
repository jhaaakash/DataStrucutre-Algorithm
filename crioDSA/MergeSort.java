package crioDSA;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int beg, int mid, int end) {
        int p1=beg, p2=mid+1, i=0;
        int[] merged = new int[end-beg+1];
        
        while(p1<=mid && p2<=end) {
            if (arr[p1]<=arr[p2]) {
                merged[i++] = arr[p1++];
            }
            else {
                merged[i++] = arr[p2++];
            }
        }
        while(p1<=mid) {
            merged[i++] = arr[p1++];
        }
        while(p2<=end) {
            merged[i++] = arr[p2++];
        }
        i=0;
        for (int j=beg; j<=end; j++) {
            arr[j] = merged[i++];
        }
    }
    public static void mergeSort(int[] arr, int beg, int end) {
        System.out.println(String.format("Starting to sort: (%s, %s) -> %s", beg, end, display(arr, beg, end)));
        if (beg<end) {
            int mid = (beg+end)/2;
            mergeSort(arr, beg, mid); // left subpart
            mergeSort(arr, mid+1, end); // right subpart
            merge(arr, beg, mid, end);
        }
        System.out.println(String.format("Ending sort for: (%s, %s) -> %s", beg, end, display(arr, beg, end)));
    }
    
    public static String display(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder("[");
        for (int i=start; i<=end; i++) {
            sb.append(arr[i]+", ");
        }
        sb.setLength(sb.length()-2);
        sb.append("]");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {4,2,8,3,1,5};
        mergeSort(arr, 0, arr.length-1);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
}
