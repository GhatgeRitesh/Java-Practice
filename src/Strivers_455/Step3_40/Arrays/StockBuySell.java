//package Strivers_455.Step3_40.Arrays;
//
//public class StockBuySell {
//    // program to gain maximum profit by the stocks
//    public static void main(String[] args) {
//         int max=0;
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<prices.length;i++){
//          min=Math.min(min,prices[i]);
//          max=Math.max(max,prices[i]-min);
//        }
//        return max;
//    }
//    public
//}
//class Solution {
//    public int maxProfit(int[] prices) {
//        int max=0;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i;j<prices.length;j++){
//                max=Math.max(prices[j]-prices[i],max);
//            }
//        }
//        return max;
//    }
//}