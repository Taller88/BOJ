package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringSetSol {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tmp=br.readLine();
		int[]arr=new int[10];
		for(int i=0; i<tmp.length(); i++) {
			arr[tmp.charAt(i)-'0']++;
		}
		int sum=arr[6]+arr[9];
		if(sum%2==0) {
			arr[6]=sum/2;
			arr[9]=sum/2;
			
		}else {
			arr[6]=sum/2+1;
			arr[9]=sum/2+1;
		}
		int max=0;
		for(int i: arr) {
			max=Math.max(max, i);
		}
		System.out.println(max);
	}

}
