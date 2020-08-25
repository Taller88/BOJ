package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Nnumber {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int nTh=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<nTh; i++) {
			int[]arr=new int[10];
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<10;j++) {
				arr[j]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			System.out.println(arr[arr.length-3]);
		}
	}

}
