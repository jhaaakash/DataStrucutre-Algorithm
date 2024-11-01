package yt.dur.Array;

public class LargestElementinArray {
    public static void main(String[] args) {
        int numbers[]={103,5,7,8,2,67,56,37,98,77,99};

        int max=numbers[0];
        for(int i=1; i<numbers.length; i++)
        {
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
        }
        System.out.println("The maximum number in the arrya is "+max);
    }
    
}
