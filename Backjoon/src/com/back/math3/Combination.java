package com.back.math3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Combination {
	static int[]dp;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		if(n==k || k==0) {
			System.out.println(1);
			return;
		}
		dp=new int[n+1];
		int result=fac(n)/fac(k)/fac(n-k);
		System.out.println(result);
	}

	public static int fac(int n) {
		if(n==1) {
			return 1;
		}
		
//		System.out.println(n);
		if(dp[n]==0) {
			return n*fac(n-1);
		}
		return dp[n];
	}

}
