package com.back.backTracking;

import java.util.Scanner;

public class NandM2 {
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean[] visited=new boolean[n];
			dfs(0,0,n,m,"",visited);
		System.out.println(sb.toString());
	}
	public static void dfs(int start,int dep, int n, int m,String k,boolean[] visited) {
		if(dep!=0) {
			k+=start+" ";
		}
		
		if(dep==m) {
			sb.append(k.trim()+"\n");
			return;
		}
		for(int i=1;i<n+1; i++ ) {
			if(!visited[i-1] && i>start) {
				visited[i-1]=true;
				dfs(i,dep+1, n, m, k, visited);
				visited[i-1]=false;
				}
		}
	}

}
