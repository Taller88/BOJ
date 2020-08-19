package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlpabetCnt {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int[] arr=new int[26];
		for(int i=0; i<input.length(); i++) {
			arr[input.charAt(i)-'a']++;
		}
		String out="";
		for(int i=0; i<arr.length; i++) {
			out+=arr[i]+" ";
		}
		System.out.println(out.trim());

	}

}
