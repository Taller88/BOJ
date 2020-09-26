package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintStar5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		//1 3 5 7 9
		//2x-1
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0 ; j--) {
//				System.out.println(j);
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}

			System.out.println();
			}
//		System.out.println(sb.toString().trim());
	}

}
