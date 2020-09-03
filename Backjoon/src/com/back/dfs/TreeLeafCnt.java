package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TreeLeafCnt {

	public static void main(String[]args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][]arr=new int[n][n];
		String[] in=br.readLine().split(" ");
		int start=0;
		for(int i=0; i<in.length; i++) {
			if(Integer.parseInt(in[i])==-1) {
				start=i;
				continue;
			}else {
				arr[i][Integer.parseInt(in[i])]=1;
			}
		}
		int del=Integer.parseInt(br.readLine());
		for(int i=0; i<arr[del].length; i++) {
			arr[del][i]=0;
		}
		dfs(arr,start,0);
		
	}

	public static void dfs(int[][] arr, int start, int cnt) {
		for(int i=0; i<arr[0].length; i++) {
		
		}
	}

}
