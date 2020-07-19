package com.back.fibonachi;

import java.util.Scanner;

public class FiboZeroOne {
	static int one=0;
	static int zero=0;
	static int[]dp;
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
			int num=sc.nextInt();
			dp=new int[num];
			one=0;
			zero=0;
			fibo(num);
			System.out.println(zero +" "+one);
		}
	}

	public static int fibo(int n) {
		
		if(n==0) {
			zero++;
			return 0;
		}
		if(n==1) {
			one++;
			return 1;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		return fibo(n-1)+fibo(n-2);
	}
}
