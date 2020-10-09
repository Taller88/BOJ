package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Star8 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		for(int i=1; i<=2*num-1; i++) {
			if(i>num) {
				for(int j=0; j<num-(i-num); j++ ) {
					sb.append("*");
				}
				for(int j=0; j<2*num-(num-(i-num))*2; j++ ) {
					sb.append(" ");
				}
				for(int j=0; j<num-(i-num); j++ ) {
					sb.append("*");
				}
			}else {
				for(int j=0; j<i; j++ ) {
					sb.append("*");
				}
				for(int j=0; j<2*num-i*2; j++ ) {
					sb.append(" ");
				}
				for(int j=0; j<i; j++ ) {
					sb.append("*");
				}
				
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
