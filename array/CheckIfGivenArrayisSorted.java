package array;

public class CheckIfGivenArrayisSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7 };
        System.out.println(isSorted(arr));
            }
        
            private static String isSorted(int[] arr) {
                for(int i=0;i<arr.length-1;i++)
                {
                    if(arr[i]>arr[i+1])
                    {
                        return "No";
                    }
                }
                return "Yes";
            }
}
