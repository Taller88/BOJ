package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MoumCnt {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char moArr[]= {'a', 'e', 'i', 'o', 'u'};
		String tmp=br.readLine();
		int cnt=0;
		for(int j=0; j<moArr.length; j++) {
			for(int i=0; i<tmp.length(); i++) {
				if(moArr[j]==tmp.charAt(i)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	
	}
	
}