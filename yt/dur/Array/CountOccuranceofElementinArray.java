package yt.dur.Array;

public class CountOccuranceofElementinArray {
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8,9,0,8,5,4,3,3,3,3,3,3,};
        int target=3;
        int count=0;

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==target)
            {
                count++;
            }
        }
        System.out.println("the count of "+target+ " in the given array is "+count);;
    }
    
}
