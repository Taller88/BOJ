package com.back.backTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NandM5 {
	static StringBuilder sb=new StringBuilder();
	static int targetCnt=0;
	static int[] arr;
	static int setCnt=0;
	static HashSet<String> list=new HashSet();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		targetCnt=sc.nextInt();
		arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
			boolean[] visited=new boolean[n];
			dfs(visited,0,"");
		
		ArrayList<String> result=new ArrayList<>();
//		System.out.println("set: "+list.size()+" 실제: "+setCnt);
		for(String k: list) {
			result.add(k);
		}
		
		Collections.sort(result);
		for(String k: result) {
			System.out.println(k);
		}
		
	}
	public static void dfs(boolean[] visited, int cnt, String k) {
		if(cnt==targetCnt) {
			list.add(k);
			setCnt++;
			return;
		}
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(visited, cnt+1, k+arr[i]+" ");
				visited[i]=false;
			}
		}
	}

}
