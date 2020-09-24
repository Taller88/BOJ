package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LongestSeq {
	static final int INF=Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[]dp=new int[1001];
		Arrays.fill(dp, INF);
		int[]arr=new int[n];
		int max=0;
		int len=0;
		for(int i=0; i<n; i++) {
			int tmp=Integer.parseInt(st.nextToken());
			if(dp[tmp]!=INF) {
				arr[i]=dp[tmp];
			}else {
				if(tmp>max) {
					max=tmp;
					arr[i]=++len;
					dp[tmp]=len;
				}
			}
		}
		int answer=0;
		for(int i=0; i<arr.length; i++) {
			answer=Math.max(answer, arr[i]);
		}
		System.out.println(answer);
	}

}
