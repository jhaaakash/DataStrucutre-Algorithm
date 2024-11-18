import java.util.Scanner;

public class ProductOfArrayExceptSelf {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++)
        A[i] = sc.nextInt();
        int[] ans = productOfArrayExceptSelf(A);
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]);
            System.out.print(" ");
        }
    }

    static int[] productOfArrayExceptSelf(int[] A){
        int length=A.length;

        int[] leftProduct = new int[length];
        int[] rightProduct = new int[length];
        int[] result = new int[length];
        // Initialize leftProduct and rightProduct
        leftProduct[0] = 1;
        rightProduct[length - 1] = 1;
        // Fill leftProduct array
        for (int i = 1; i < length; i++) {
            leftProduct[i] = A[i - 1] * leftProduct[i - 1];
        }
        // Fill rightProduct array
        for (int i = length - 2; i >= 0; i--) {
            rightProduct[i] = A[i + 1] * rightProduct[i + 1];
        }

        // Calculate result array 
        for (int i = 0; i < length; i++) 
        { 
            result[i] = leftProduct[i] * rightProduct[i]; 
        } 
        return result;

    }
    
}
