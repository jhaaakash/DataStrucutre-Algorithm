package array;

public class ContianerWithMostWater {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 }; // Example array
        int result = maxArea(arr);
                System.out.println("Maximum area: " + result);
            }
        
            private static int maxArea(int[] arr) {
                int area=0;
                int maxWidth = arr.length;
                for(int i=0; i< maxWidth-1; i++){

                    for(int j=i+1;j<maxWidth;j++){
                        int height = Math.min(arr[i], arr[j]);
                        int width = j-i;
                        int tempArea = height * width;
                        area = Math.max(area, tempArea);
                    }
                    
                }
              
              
              
              return  area;
                
            }
}
