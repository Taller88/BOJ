package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Scret {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		Baekjoon Online Judge
		
		String[] arr=br.readLine().split(" ");
		String[]result=new String[arr.length];
		for(int i=0; i<result.length; i++) {
			result[i]="";
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				
				if( (arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z') || (arr[i].charAt(j)+0>='A' && arr[i].charAt(j)<='Z')) {
				
					if(arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z') {//소문자
						if(arr[i].charAt(j)+13>'z') {
							result[i]+=(char)('a'+arr[i].charAt(j)+12-'z');
						}else {
							result[i]+=(char)(arr[i].charAt(j)+13);
						}
					
					}else {// 대문자
						if(arr[i].charAt(j)+13>'Z') {
							result[i]+=(char)('A'+arr[i].charAt(j)+12-'Z');
						}else {
							result[i]+=(char)(arr[i].charAt(j)+13);
						}
					}
				}else {//소문자나 대문자가 아닐때 
					result[i]+=arr[i].charAt(j);
				}
			}
		}
		String tmp="";
		for(int i=0; i<result.length; i++) {
			tmp+=result[i]+" ";
		}
		System.out.println(tmp.trim());
		
		//알파벳 대문자 65-90
		//숫자 48-57
		//알파벳 고문자 97-122
		
		
		

	}

}
