package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiboDP {
	static int[]arr=new int[46];
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int result=dp(n);
		arr[0]=0;
		arr[1]=1;
		System.out.println(arr[n]);
	}

	public static int dp(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(arr[n]!=0) {
			return arr[n];
		}
		return arr[n]=dp(n-1)+dp(n-2);
	}

}
