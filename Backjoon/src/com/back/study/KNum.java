package com.back.study;

import java.util.Arrays;
import java.util.Scanner;

public class KNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		5 2
//		4 1 2 3 5
		int k=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}

}
