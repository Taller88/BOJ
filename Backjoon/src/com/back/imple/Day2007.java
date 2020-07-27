package com.back.imple;

import java.util.Scanner;

public class Day2007 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mon=sc.nextInt();
		int day=sc.nextInt();
		
		int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] name={"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"};
		
		int sum=0;
		for(int i=0; i<mon; i++) {
			sum+=days[i];
		}
		sum+=day;
		System.out.println(name[(sum-1)%7]);
	}

}
