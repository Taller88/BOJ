package com.back.fibonachi;

import java.util.Scanner;

public class FiboZeroOneSolu {
	static int[]dp;
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
			int num=sc.nextInt();
			if(num==0){
				System.out.println("1 0");
			}else if(num==1){
				System.out.println("0 1");
			}else {
				dp=new int[num+1];
				dp[0]=0;
				dp[1]=1;
				fibo(num);
				System.out.println(dp[num-1] +" "+dp[num]);
			}
		}
	}

	public static int fibo(int n) {
		if(n==0) {
			return dp[0];
		}
		if(n==1) {
			return dp[1];
		}
		if(n>=1 && dp[n]!=0) {
			return dp[n];
		}
		return dp[n]=fibo(n-1)+fibo(n-2);
	}
}
