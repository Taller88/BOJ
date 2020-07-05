package com.back.fibonachi;

import java.util.Scanner;

public class DynamicPrograming {
	/*
	 * Fibonachi를 대부분 재귀로 풀지만 DP를 풀어야 좋은 효율성이 나온다. 
	 * 
	 */
	public static long dp(int k) {
		long[] arr=new long[k+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2; i<=k; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr[k];
	}
	
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(dp(a));
	}
}
