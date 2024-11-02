package yt.dur.Array;

import java.util.Scanner;

public class RemoveDuplicateInSortedArrya {

    public static void removingDuplicateEntry(int number[])
    {
        int size=number.length;
        int temp[]= new int[size];
        int j=0;

        for(int i=0; i<size-1; i++)
        {
            if(number[i] != number[i+1])
            {
                temp[j]=number[i];
                j++;
            }
        }
        temp[j++]=number[size-1];
        System.out.println("Unique element array is");

        for(int k=0;k<j; k++)
        {
            System.out.println(temp[k]);
        }
        


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
        removingDuplicateEntry(inputNumber);
    }
}
