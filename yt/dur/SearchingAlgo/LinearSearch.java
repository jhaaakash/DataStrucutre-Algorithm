package yt.dur.SearchingAlgo;

import java.util.Scanner;

public class LinearSearch {

    public static int linerSearchfunction(int array[], int target)
    {
        int index=-1;
        for ( int i=0; i<array.length;i++)
        {
            if(array[i]==target)
            {
                index=i;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thesize of the array:");
        int size= sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the "+size+" numbers");
        for(int i=0; i<size; i++)
        {
            numbers[i]=sc.nextInt();
        }

        System.out.println("Enter the target element now");
        int target= sc.nextInt();

        int foundIndex=linerSearchfunction(numbers, target);
        System.out.println("Element found at index "+foundIndex);

    }
    
}
