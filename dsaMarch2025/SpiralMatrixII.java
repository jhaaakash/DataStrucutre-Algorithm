package dsaMarch2025;
import java.util.*;
// Given an integer A, generate a square matrix filled with elements from 1 to A*A in spiral order. The spiral order will be clockwise in nature starting from (0,0)


class SpiralMatrixII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int n) {

        int result[][] = new int[n][n];
        int sr=0, sc=0, er=n-1, ec=n-1;
        int count = 1;
        while(count<=n*n)
        {

            for(int col=sc; col<=ec;col++)
            {
                result[sr][col] = count;
                count++;
            }
            sr++;
            for(int row=sr; row<=er;row++)
            {
                result[row][ec] = count;
                count++;
            }
            ec--;
            for(int col=ec; col>=sc;col--)
            {
                result[er][col] = count;
                count++;
            }
            er--;
            for(int row=er; row>=sr;row--)
            {
                result[row][sc] = count;
                count++;
            }
            sc++;
        }

        return result;


    }
}
