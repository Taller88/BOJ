package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tiling {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int[]dp=new int[1001];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		for(int i=3; i<=n; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		System.out.println(dp[n]);
		
	}

}
