package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Marko {
	static long max=0;
	static String[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		arr=br.readLine().split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("0")) {
				continue;
			}
			boolean[]visited=new boolean[arr.length];
			visited[i]=true;
			dfs(i, arr[i], visited,1);
			
		}
		System.out.println(max==0?-1:max);
	}

	public static void dfs(int start, String sum ,boolean[]visited,int cnt) {
		if(Long.parseLong(sum)%30==0) {
			max=Math.max(max, Long.parseLong(sum));
//			System.out.println(max);
			return;
		}
		if(cnt>arr.length) {
			return;
		}
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(i, sum+arr[i], visited, cnt+1);
				visited[i]=false;
			}
		}
	}

}
