package com.back.fibonachi;

public class DynamicPrograming {
	/*
	 * Fibonachi를 대부분 재귀로 풀지만 DP를 풀어야 좋은 효율성이 나온다. 
	 * 
	 */
	public static int dp(int first, int sec, int k) {
		int answer=0;
		int[] dp=new int[k+1];
		dp[1]=first;
		dp[2]=sec;
		for(int i=3; i<=k; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[k];
	}
	
	
	public static void main(String[]args){
			System.out.println(dp(5,6,6));
	}
}
