package com.back.dp;

import java.util.Scanner;

public class Tile01Solution {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		long[] dp=new long[1000001];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		for(int i=3; i<=num; i++) {
			dp[i]=dp[i-1]+dp[i-2];
			dp[i]%=15746;
		}
		System.out.println(dp[num]);
		
	}

}
