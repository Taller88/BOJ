package com.back.math;

import java.io.BufferedReader;
import java.util.Scanner;

public class UclidGCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]arr=sc.nextLine().split(":");
		long f=Long.parseLong(arr[0]);
		long h=Long.parseLong(arr[1]);
		long a=0;
		long b=0;
		if(f<h) {
			a=h;
			b=f;
		}else {
			a=f;
			b=h;
		}
		long gcd=gcd(a, b);
		System.out.println(f/gcd+ ":"+h/gcd);
	}
	public static long gcd(long num1, long num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
