package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VerticalRead {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[][]arr=new String[5][15];
		for(int i=0; i<5; i++) {
			String[] tmp=br.readLine().split("");
			for(int j=0; j<tmp.length; j++) {
				arr[i][j]=tmp[j];
			}
		}

		StringBuilder sb=new StringBuilder();

		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j][i]!=null&&  !arr[j][i].equals(null) &&!arr[j][i].equals("")) {
					sb.append(arr[j][i]);
				}
			}
		}
		System.out.println(sb.toString());
	}

}
