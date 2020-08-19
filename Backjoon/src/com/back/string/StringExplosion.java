package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringExplosion {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
		String a1=br.readLine();
		
//		while(a.contains(a1)) {
//			a=a.substring(0,a.indexOf(a1)).concat(a.substring(a.indexOf(a1)+a1.length(),a.length()));
//		}
//		if(a==null||a.equals("")) {
//			System.out.println("FRULA");
//		}else {
//			System.out.println(a);
//		}
		String arr[]=a.split(a1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
