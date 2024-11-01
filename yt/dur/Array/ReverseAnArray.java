package yt.dur.Array;

import java.util.Scanner;

public class ReverseAnArray {

    public static void reverseOfAnArray(int numbers[])
    {
        int left=0;
        int temp=0;
        int right= numbers.length-1;
        while (left<right) {
           temp= numbers[left];
            numbers[left]=numbers[right];
            numbers[right]=temp; 
            left++;
            right--;
        }

        for (int i : numbers) {
            System.out.print(i);
        }


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

        reverseOfAnArray(numbers);


    }
}
