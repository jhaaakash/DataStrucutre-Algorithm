package crioDSA;

import java.util.*;


class ReduceArray{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int reduceArray(int n, int a[]){
        while(n>1){

        for(int i=0; i<a.length; i++)
        {
            a[i]=a[i]-a[i+1];
        }  
        n--;  
    }
        return n;
    }
}