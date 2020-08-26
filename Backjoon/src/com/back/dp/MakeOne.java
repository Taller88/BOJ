package com.back.dp;

import java.util.Scanner;

public class MakeOne {
	static int dp[];
	static int answer=Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		dp=new int[a+1];
		dp(a);
		System.out.println(dp[a]);
	}
	public static int dp(int n) {
		if(n==1) {
			return 0;
		}
		if(dp[n]>0) {
			return dp[n];
		}
		dp[n]=dp(n-1)+1;
		if(n%2==0) {
			int tmp=dp(n/2)+1;
			if(dp[n]>tmp) {
				dp[n]=tmp;
			}
		}
		if(n%3==0) {
			int tmp=dp(n/3)+1;
			if(dp[n]>tmp) {
				dp[n]=tmp;
			}
		}
		return dp[n];
	}
}
