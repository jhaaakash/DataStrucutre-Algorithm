package array;

import java.util.HashSet;

public class TripletwithZeroSum {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int size = arr.length;// 5
        int target = 0;
        
          //first approach
          for(int i=0;i<=size-3; i++)
          {
         for(int j=i+1;j<=size-2; j++)
          {
          for(int k=j+1;k<=size-1; k++)
          {
          if(arr[i]+arr[j]+arr[k]==0)
          {
          System.out.println("The triplet is:" +arr[i]+ " " +arr[j]+ " "+arr[k]);
          }
          }
          }
          }

        // Second Approach:
        printTriplets(arr,size);
        }
        
    static void printTriplets(int arr[], int n)
    {
        boolean flag = false;
        for(int i =0; i<n-1; i++)
        {
            HashSet<Integer> hashMap= new HashSet<>();
            for(int j=i+1; j<n; j++)
            {
                int thirdElement = -(arr[i]+arr[j]);
                if(hashMap.contains(thirdElement))
                {
                    System.out.println(arr[i]+" "+thirdElement+ " "+arr[j]);
                    flag=true;
                }
                else{
                    hashMap.add(arr[j]);
                }
            }
        }
        if(!flag)
        {
            System.out.println("There is no triplet");
        }
    }

}
