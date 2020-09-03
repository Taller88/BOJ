package com.back.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IntegerTriangle {

	public static void main(String[] args) throws IOException{
//		5
//		7
//		3 8
//		8 1 0
//		2 7 4 4
//		4 5 2 6 5
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		int[][]arr=new int[line+1][line+1];
		int sum=0;
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=i; j++ ) {
				arr[i][j]=sc.nextInt();
				if(j==1) {
					arr[i][j]=arr[i-1][j]+arr[i][j];
				}else if(i==j) {
					arr[i][j]=arr[i-1][j-1]+arr[i][j];
				}else {
					arr[i][j]=Math.max(arr[i-1][j-1],arr[i-1][j])+arr[i][j];
				}
				if(arr[i][j]>sum) {
					sum=arr[i][j];
				}
			}
			
		
		}
		System.out.println(sum);
	}

}
