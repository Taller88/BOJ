package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArraySum {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int aLen=Integer.parseInt(st.nextToken());
		int bLen=Integer.parseInt(st.nextToken());
		int[]arr=new int[aLen+bLen];
		int idx=0;
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<aLen; i++) {
			arr[idx]=Integer.parseInt(st.nextToken());
			idx++;
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<bLen; i++) {
			arr[idx]=Integer.parseInt(st.nextToken());
			idx++;
		}
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]+" ");
		}
		System.out.println(sb.toString().trim());
	}

}
