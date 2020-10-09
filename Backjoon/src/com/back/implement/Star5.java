package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Star5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		for(int i=1; i<=num*2-1; i++) {
			if(i>num) {
				for(int j=0; j<i-num; j++) {
					sb.append(" ");
				}
				for(int j=0; j<2*(num-i+num)-1; j++) {
					sb.append("*");
				}
			}else {
				for(int j=0; j<num-i; j++) {
					sb.append(" ");
				}
				for(int j=0; j<2*i-1; j++) {
					sb.append("*");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
