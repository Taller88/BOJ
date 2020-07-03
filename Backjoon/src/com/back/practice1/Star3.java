package com.back.practice1;

import java.util.Scanner;

public class Star3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		for(int i=0; i<cnt*2; i++) {
			if(i%2==0) {
				for(int j=0; j<cnt;j++) {
					if(j%2==0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
				
			}else {
				for(int j=0; j<cnt;j++) {
					if(j%2==0) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
					
				}

			}
			System.out.println();
		}
		
	}
}
