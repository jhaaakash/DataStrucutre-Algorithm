package yt.dur.Array;

import java.util.Scanner;
//IMORTANT
public class MoveZeroToEnd {

    public static void moveAllZeroToEnd(int number[])
    {
        int left=0;
        int right=number.length-1;
        while (left<right) {
            if(number[left]==0 && number[right]!=0)
            {
                number[left]=number[right];
                number[right]=0;
                left++;
                right--;
            }
            else if(number[left]==0 && number[right]==0)
            {
                right--;
            }
            else if(number[left]!=0 && number[right]!=0)
            {
                left++;
            }
            else{
                left++;
                right--;
            }
            
        }
        System.out.println("the arrya with zero at the end is:");
        for (int i : number) {
            System.out.print(i+"\t");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in an Array");
        int size= sc.nextInt();
        System.out.println("Enter the " + size +" Elements of the array including zeros");
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
        moveAllZeroToEnd(inputNumber);


    }
}
