package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LogestSequence {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[]arr=new int[num];
		int[]dp=new int[1001];
		for(int i=0; i<num; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt=1;
		for(int i=0; i<arr.length; i++) {
			if(dp[arr[i]]==0) {
				dp[arr[i]]=cnt++;
			}
		}
		int result=0;
		for(int i=0; i<dp.length; i++) {
			result=Math.max(result, dp[i]);
		}
		System.out.println(result);
//		System.out.println(cnt);
		
	}

}
