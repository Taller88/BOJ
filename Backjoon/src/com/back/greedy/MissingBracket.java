package com.back.greedy;

import java.util.Scanner;

public class MissingBracket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] arr=input.split("-");
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				sum+=calcul(arr[i]);
			}else {
				sum+=(calcul(arr[i])*-1);
			}
		}
		System.out.println(sum);
	}

	public static int calcul(String numString) {
		String[] arr=numString.split("\\+");
		int sum=0;
		for(String tmp: arr) {
			sum+=Integer.parseInt(tmp);
		}
		return sum;
	}

}
