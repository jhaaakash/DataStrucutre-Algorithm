package yt.dur.Array;

import java.util.Scanner;

public class FindMissingElement1toN {
    public static void findingMissingNumber(int number[])
    {
        int n = number.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : number) {
            actualSum += num;
        }

        int missingNumber= expectedSum - actualSum;
        System.out.println("The missing number is "+missingNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in an Array");
        int size= sc.nextInt();
        System.out.println("Enter the " + size +" Elements of the array in a sorted manner with Duplicates");
        int inputNumber[]= new int[size];

        for(int i=0; i<size; i++)
        {
            inputNumber[i]= sc.nextInt();
        }

        System.out.println(" the input number array is");
        for (int i : inputNumber) {
            System.out.print(i+"\t");
        }
        System.out.println();
        findingMissingNumber(inputNumber);
    }
}
