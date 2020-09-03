package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Knapsack {
	
	static class Knap{
		int w,v;
		public Knap(int w, int v) {
			this.w=w;
			this.v=v;
		}
	}
	static Knap[] arr;
	static int max=0;
	static int limitation=0;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		arr=new Knap[n];
		limitation=Integer.parseInt(st.nextToken());
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			arr[i]=new Knap(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		boolean[]visited=new boolean[n];
		dfs(arr,0,0,visited);
		
		
		System.out.println(max);
	}
	private static void dfs(Knap[] knap, int weight, int value,boolean[] visited) {
		if(max<value) {
			max=value;
			return;
		}
		for(int i=0; i<knap.length; i++) {
			if(!visited[i] && weight+arr[i].w<=limitation) {
				visited[i]=true;
				dfs(knap, weight+arr[i].w,value+arr[i].v, visited);
				visited[i]=false;
			}
		}
		
	}

}
