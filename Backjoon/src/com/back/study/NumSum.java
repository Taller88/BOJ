package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumSum {
	static int[] arr;
	static int answer=0;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//10 5
		//1 2 3 4 2 5 3 1 1 2
		StringTokenizer st=new StringTokenizer(br.readLine());
		int num=Integer.parseInt(st.nextToken());
		int target=Integer.parseInt(st.nextToken());
		
		arr=new int[num];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<arr.length; i++) {
			dfs(i, target,arr[i]);
		}
		System.out.println(answer);
	}
	public static void dfs(int start, int target, int sum) {
		if(sum==target) {
			answer++;
			return;
		}
		if(sum>target) {
			return;
		}
		if(start+1<arr.length) {
			dfs(start+1, target, sum+arr[start+1]);
		}
		
		
	}

}
