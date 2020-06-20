package com.back.recrusion;

import java.util.Scanner;

public class Factorial {

	public static long fac(long n) {
		int result=1;
		if(n==1) {
			return 1;
		}else {
			result*=n*fac(n-1);
			return result;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long in=sc.nextLong();
		System.out.println(fac(in));
		
	}
}
