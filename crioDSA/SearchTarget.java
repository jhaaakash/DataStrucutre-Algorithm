package crioDSA;

import java.util.Scanner;

class SearchTarget{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//accepting number of integer or length of array
        int X = sc.nextInt();//accepting target value
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        A[i] = sc.nextInt();
        int res = searchTarget(N,A,X);
        System.out.println(res);
    }

    static int searchTarget(int N,int A[],int X){ 
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A[mid] == X) {
                return mid;
            } else if (A[mid] < X) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}

/*
 * 
 * Problem Description
Given a sorted array of N distinct integers and a target value X, return the index if the target is found. If not found then return -1.
Note - Try implementing with O(logN) runtime complexity.
Input format
First line contains N, the number of distinct integers. Second line contains N space separated integers.
Output format
Print the index of target element if found else return -1.
Sample Input 1
5 7
1 3 5 7 13
Sample Output 1
3
Explanation
Target integer 7 is at index 3.

 */