package com.back.bruteforce;

import java.util.Scanner;

public class MovieMakeShom {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=666;
		int tmp=1;
		
		while(tmp!=n) {
			start++;
			if(String.valueOf(start).contains("666")) {
				tmp++;
			}
			
		}
		System.out.println(start);
	}

}
