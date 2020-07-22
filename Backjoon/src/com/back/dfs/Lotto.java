package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class Lotto {
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input="";
		
		while(true) {
			input=br.readLine();
//			System.out.println(input);
			if(input.equals("0")) {
				break;
			}
			st=new StringTokenizer(input);
			int cnt=Integer.parseInt(st.nextToken());
			int[]arr=new int[cnt];
			boolean[] visited=new boolean[cnt];
			for(int i=0; i<arr.length; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			int[] sol=new int[6];
			dfs(arr,0,0,"",visited);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

	public static void dfs(int[] arr,int idx ,int cnt, String result,boolean[] visited) {
		if(cnt==6) {
			result=result.trim()+"\n";
			sb.append(result);
			return;
		}
//		System.out.println(result);
		for(int i=0; i<arr.length; i++) {
			if(!visited[i] && idx<=i) {
				visited[i]=true;
				dfs(arr, i, cnt+1, result+arr[i]+" ", visited);
				visited[i]=false;
				
			}
		}
	}

}
