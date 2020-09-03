package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB {

	public static void main(String[] args) throws Exception {
//		3
//		26 40 83
//		49 60 57
//		13 89 99
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int house=Integer.parseInt(br.readLine());
		int[][]color=new int[house][3];
		int[][]dp=new int[house][3];
		StringTokenizer st;
		for(int i=0; i<house; i++) {
			st=new StringTokenizer(br.readLine());
			color[i][0]=Integer.parseInt(st.nextToken());
			color[i][1]=Integer.parseInt(st.nextToken());
			color[i][2]=Integer.parseInt(st.nextToken());
		}
		dp[0][0]=color[0][0];
		dp[0][1]=color[0][1];
		dp[0][2]=color[0][2];
		for(int i=1; i<dp.length; i++) {
			dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+color[i][0];
			dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+color[i][1];
			dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1])+color[i][2];
		}
		System.out.println(Math.min( Math.min(dp[house-1][0],dp[house-1][1]),dp[house-1][2]));
	}

}
