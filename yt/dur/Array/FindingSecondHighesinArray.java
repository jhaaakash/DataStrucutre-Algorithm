package yt.dur.Array;

import java.util.Scanner;

public class FindingSecondHighesinArray {

    public static void secondLargestnumber(int[] numbers)
    {
        int largest= numbers[0];
        int secendLargest= numbers[1];

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]> largest)
            {   secendLargest=largest;
                largest=numbers[i];
            }
            else if(numbers[i]>secendLargest && numbers[i]<largest)
            {
                secendLargest=numbers[i];
            }
        }
        System.out.println("Second largest number is " +secendLargest);

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
        secondLargestnumber(numbers);
    }
}
