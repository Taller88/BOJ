package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuitySum {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cnt=Integer.parseInt(br.readLine());
		int[]dp=new int[cnt];
		int[]arr=new int[cnt];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		dp[0]=arr[0];
		for(int i=1; i<dp.length; i++) {
			dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
		}
		int max=arr[0];
		for(int i=0; i<dp.length; i++) {
			max=Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
