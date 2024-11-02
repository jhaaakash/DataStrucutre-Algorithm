package yt.dur.Array;

import java.util.Scanner;

public class RotateArrayByKElements {
//IMORTANT
    private static void rotateByKNumber(int[] inputNumber, int rotateFactor) {

        if(inputNumber==null || inputNumber.length==0 )
        {
            return;
        }
        int n= inputNumber.length;
        rotateFactor=rotateFactor%n;
        reverse(inputNumber, 0, n-1);
        reverse(inputNumber, 0, rotateFactor-1);
        reverse(inputNumber, rotateFactor, n-1);
         }


         public static void reverse(int num[], int start, int end)
         {
            while (start<end)
             {
                int temp=num[start];
                num[start]= num[end];
                num[end]=temp;
                start++;
                end--;

            }
         }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in an Array");
        int size= sc.nextInt();
        System.out.println("Enter the " + size +" number");
        int inputNumber[]= new int[size];

        for(int i=0; i<size; i++)
        {
            inputNumber[i]= sc.nextInt();
        }

        System.out.println(" the input number array is");
        for (int i : inputNumber) {
            System.out.print(i+"\t");
        }
        int rotateFactor=2;
        rotateByKNumber(inputNumber,rotateFactor);
        System.out.println(" After shifting the array is");
        for (int i : inputNumber) {
            System.out.print(i+"\t");
        }

    }

    
    
}
