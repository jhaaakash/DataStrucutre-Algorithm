package yt.dur.SearchingAlgo;

import java.util.Scanner;

public class BinarySearch {
    
    public static int binarySearchMethos(int arr[], int target)
    {
        int low=0;
        int high= arr.length-1;
        while (low<=high) {
            int mid=low+((high-low)/2);         
            if(arr[mid]==target)
            {
                return mid;
            }
            if(target<arr[mid])
            {
                high=mid-1;
            }
            if(target>arr[mid])
            {
                low=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thesize of the array:");
        int size= sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the "+size+" numbers in sorted order");
        for(int i=0; i<size; i++)
        {
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the target element now");
        int target= sc.nextInt();
        int targetElementIndex=binarySearchMethos(numbers, target);
        System.out.println("Element is foundat index " +targetElementIndex);

    }
    
}
