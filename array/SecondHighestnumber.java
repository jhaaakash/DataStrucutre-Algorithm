package array;

import java.util.Arrays;

public class SecondHighestnumber {
    public static void main(String[] args) {
        int arr[]={3,67,27,86,7,54,33,53,23,78};
        //Approach1: if all number are unique
        Arrays.sort(arr);
        for(int i: arr)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        int secondHighestIndex=arr.length-2;
        System.out.println("Second Highest: "+arr[secondHighestIndex]);

        System.out.println("Second Appraoch");

        int maxNumber = Integer.MIN_VALUE;
        int secondMaxNumber = Integer.MIN_VALUE;
        for(int i: arr)
        {
            if(i>maxNumber)
            {
                secondMaxNumber=maxNumber;
                maxNumber=i;
            }
            else if( i > secondMaxNumber && i!=maxNumber)
            {
                secondMaxNumber=i;
            }
        }

        
        System.out.println("Sexond Approach: "+secondMaxNumber);
    }
}
