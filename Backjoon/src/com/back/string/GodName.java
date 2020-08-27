package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GodName {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		5
//		baek joon
//		koo sa ga
//		ac ka
//		yu ka ri ko
//		ke sa ki yo
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[] arr=br.readLine().split(" ");
			String result="god";
			for(int j=1; j<arr.length; j++) {
				result+=arr[j];
			}
			System.out.println(result);
		}
	}

}
