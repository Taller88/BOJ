package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WineDrink {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[]arr=new int[10000];
		int[]dp=new int[10000];
		for(int i=0; i<num; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		dp[0]=arr[0];
		dp[1]=arr[0]+arr[1];
		dp[2]=Math.max(dp[1], Math.max(arr[1]+arr[2],arr[0]+arr[2]));
		
		for(int i=3; i<num; i++) {
			dp[i]=Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		}
		System.out.println(dp[num-1]);
		
	}

}
