package com.back.recrusion;

import java.util.Scanner;

public class Gcf {

	public static int gcd(int m, int n){ 
		if(n == 0) return m; 
		else return gcd(n, m%n); 
	}

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int tmp=sc.nextInt();
		int[]num=new int[tmp-1];
		int first=sc.nextInt();

		for(int i=0; i<tmp-1; i++) {
			num[i]=sc.nextInt();
			System.out.println(first/gcd(first,num[i])+"/"+num[i]/gcd(first,num[i]));
		}
		
	}
}
