package com.back.dp;

import java.util.Scanner;

public class TriangleCnt {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int cnt=sc.nextInt();
		for(int j=0; j<cnt; j++) {
			int num=sc.nextInt();
		long[] dp=new long[101];
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//		1, 1, 1, 2, 2, 3, 4, 5, 7, 9
		
		dp[1]=1;
		dp[2]=1;
		dp[3]=1;
		for(int i=4; i<=num; i++) {
			dp[i]=dp[i-2]+dp[i-3];
		}
		sb.append(dp[num]+"\n");
		}
		System.out.println(sb.toString());
	}

}
