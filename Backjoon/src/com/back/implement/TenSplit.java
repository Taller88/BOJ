package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TenSplit {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String in=br.readLine();
		int cnt=0;
		String answer="";
		for(int i=0; i<in.length(); i++) {
			cnt++;	
			answer+=in.charAt(i);
			if(cnt==10) {
				cnt=0;
				answer+="\n";
			}
		}
		System.out.println(answer.trim());
	}

}
