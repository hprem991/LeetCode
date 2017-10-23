package Arrays;
import java.util.*;
import java.lang.*;


//Question : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
//Solution : https://discuss.leetcode.com/topic/107977/c-concise-solution-o-n-time-o-1-space

public class StockBuySellTransction {
	 public int maxProfit(int[] prices, int fee) {
		 int sellOrHold = 0 ; // sell earlier purchase
		 int buyOrHold = Integer.MIN_VALUE; // Buy this stock
		 
		 for(int p: prices){
			 int tempHold = sellOrHold;
			 sellOrHold = Math.max(sellOrHold, buyOrHold + fee);  // what is profitable to sell if retain the last purchase
			 buyOrHold = Math.max(buyOrHold, sellOrHold - fee - p); // should I buy this stock or leave it
		 }
		 return sellOrHold;
	 }
}
