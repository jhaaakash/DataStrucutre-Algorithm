package yt.dur.Array;

import java.util.Scanner;

public class CheckifArrayIsSorted {
    public static boolean sortedArray(int[] numbers)
    {
        for(int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]>numbers[i+1])
            {
                return false;
            }
            
        }
        return true;
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
       boolean trueorfalse= sortedArray(numbers);

       if(trueorfalse==true)
       {
        System.out.println("Soted Array");
       }
       else
       System.out.println("Not Sorted array");
    }
}
