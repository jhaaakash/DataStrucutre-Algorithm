package array;

public class MergedTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] result = mergeSortedArrays(arr1, arr2);
                
                for (int num : result) {
                    System.out.print(num + " ");
                }

            }
        
     private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int l1=arr1.length;
        int l2=arr2.length;
        int mergedArray[]= new int[l1+l2];

        int i=0,j=0, k=0;
        while (i<l1 && j<l2) {
            if(arr1[i]<arr2[j])
            {
                mergedArray[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                mergedArray[k]=arr2[j];
                k++;
                j++;
            }   
        }

        while (i<l1) {
            mergedArray[k]=arr1[i];
                k++;
                i++;
        }
        while (j<l2) {
            mergedArray[k]=arr2[j];
            k++;
            j++;
            
        }
        return mergedArray;
               }
}
