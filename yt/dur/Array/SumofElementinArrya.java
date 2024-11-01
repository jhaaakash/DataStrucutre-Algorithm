package yt.dur.Array;

import java.util.Scanner;

public class SumofElementinArrya {

    public static void sumofAllElement(int[] numbers)
    {
        int sum=numbers[0];
        for(int i=1; i<numbers.length; i++)
        {
            sum= sum+ numbers[i];
        }
        System.out.println("The sum of all the element in arrya is " +sum);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the "+size+" numbers");
        for(int i=0; i<size; i++)
        {
            numbers[i]=sc.nextInt();
        }

        sumofAllElement(numbers);
    }
}
