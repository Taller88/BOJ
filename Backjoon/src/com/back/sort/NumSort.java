package com.back.sort;

import java.util.Scanner;

public class NumSort {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		char[]input=sc.next().toCharArray();
		for(int i=0; i<input.length; i++) {
			for(int j=0;j<input.length-i-1;j++) {
				char tmp=0;
				if(input[j]<input[j+1]) {
					tmp=input[j+1];
					input[j+1]=input[j];
					input[j]=tmp;
				}
			}
		}
		String answer="";
		for(int i=0; i<input.length; i++) {
			answer+=input[i]+"";
		}
		System.out.println(answer);
	}
}
