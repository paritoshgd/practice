package BinarySearch;

public class StockSellProblem {
	
	static void stocksell(int[] arr) {
	
		int buyDateIndex=0;
		int sellDateIndex=0;
		int maxSellPrice=arr[arr.length-1];
		int currentProfit=0;
		int tempDateIndex=0;
		for(int i=arr.length-2;i>0;i--) {
			
			if(maxSellPrice < arr[i]) {
				maxSellPrice=arr[i];
				tempDateIndex=i;
			}
			else if(maxSellPrice > arr[i]) {
				
				if(currentProfit < maxSellPrice - arr[i]) {
					currentProfit= maxSellPrice-arr[i];
					buyDateIndex=i;
					sellDateIndex=tempDateIndex;
				}
				
			}
		}
		 System.out.println("Maximum Profit(DP): " + currentProfit + ", buy date index: " + buyDateIndex +
	                ", sell date index: " + sellDateIndex);
		
	}
	
	public static void main(String[] args) {
		int[] prices = {200, 500, 1000, 700, 30, 400, 900, 400, 50};
		stocksell(prices);
	}

}
