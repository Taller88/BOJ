package com.cos.one;

public class Test7 {

	public static int solution(int[]prices) {
		int profit=prices[1]-prices[0];
		
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length; j++) {
				profit=Math.max(profit,prices[j]-prices[i]);
			}
		}
		return profit;
	}
	public static void main(String[]args) {
		int[]prices= {3,1,3};
		System.out.println(solution(prices));
	}
}
