package leetcode;

public class BestTimetoBuyandSellStockII {
	public static void main(String[] args){
		
	}
	
	public int maxProfit(int[] prices) {
		int count=0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]>prices[i-1]){
				count+= prices[i]-prices[i-1];
			}
			
		}
		return count;
    }

}
