package com.back.math;

import java.util.Scanner;

public class HoneybeeHouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		int tmp=2;
		int x=1;
		while(tmp<=num) {
			tmp+=6*x;
			x++;
		}
		System.out.println(x);
	}

}
