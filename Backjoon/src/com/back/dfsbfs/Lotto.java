package com.back.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lotto {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int num=Integer.parseInt(st.nextToken());
		boolean[] visited=new boolean[num+1];
		int[] arr=new int[num];
		for(int i=0; i<num; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
	}

}
