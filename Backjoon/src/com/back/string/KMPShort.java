package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KMPShort {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] arr=br.readLine().split("-");
		String answer="";
		for(int i=0; i<arr.length; i++) {
			answer+=arr[i].charAt(0);
		}
		System.out.println(answer);
	}

}
