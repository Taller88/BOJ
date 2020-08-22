package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordBack {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int z=0; z<n; z++) {
			String[] tmp=br.readLine().split(" ");
			
			for(int i=0; i<tmp.length; i++) {
//				System.out.println(tmp[i]);
				for(int j=tmp[i].length()-1; j>=0 ; j--) {
					sb.append(tmp[i].charAt(j)+"");
				}
				sb.append(" ");
			}
			sb.append("\n");
				
		}
		System.out.println(sb.toString().trim());
	}

}
