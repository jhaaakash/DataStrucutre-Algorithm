package array;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices));
        System.out.println("Max Profit by second appraoch: " + maxProfit1(prices));
        
            }
        
     public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }


    private static int maxProfit1(int[] prices) {
        int n=prices.length;
        int maxProfit=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]-prices[i]>maxProfit){
                    maxProfit=prices[j]-prices[i];
                }
            }
        }
       
        return maxProfit;

    }
}
