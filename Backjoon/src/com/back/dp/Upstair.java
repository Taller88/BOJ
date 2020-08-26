package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Upstair {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		6
//		10
//		20
//		15
//		25
//		10
//		20
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num+1];
		long[] dp=new long[num+1];
		for(int i=1; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		dp[1]=arr[1];
		dp[2]=arr[1]+arr[2];
		dp[3]=Math.max(arr[1]+arr[3], arr[2]+arr[3]);
		for(int i=4; i<dp.length; i++) {
			dp[i]=Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
		}
		System.out.println(dp[num]);
		
	}

}
