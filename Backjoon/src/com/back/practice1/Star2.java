package com.back.practice1;

import java.util.Scanner;

public class Star2 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		int b=cnt;
		int j=0;
		int a=0;
		boolean check=true;
		while(b<=cnt) {
			a++;
			System.out.print("a: "+a);
			for(int i=0; i<j; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<2*b-1;i++) {
				System.out.print("*");
			}
			System.out.println();
			if(b==1) {
				check=false;
			}
			if(check) {
				b--;
				j++;
			}else {
				b++;
				j--;
			}
			
	  }//while
	}
}
