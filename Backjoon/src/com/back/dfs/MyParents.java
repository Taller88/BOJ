package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MyParents {
	static class Pair{
		int a,d;
		public Pair(int a, int d) {
			this.a=a;
			this.d=d;
		}
	}
	static ArrayList<Pair> list=new ArrayList<>();
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			list.add(new Pair(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		for(int i=2;i<=n; i++) {
			boolean visited[]=new boolean[n+1];
			visited[1]=true;
			dfs(1, i,0, visited);
		}
		System.out.println(sb.toString().trim());
	}
	public static void dfs(int start, int target, int parent, boolean[] visited) {
		if(start==target) {
			sb.append(parent+"\n");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(start==list.get(i).a) {
				if(!visited[list.get(i).d]) {
					visited[list.get(i).d]=true;
					dfs(list.get(i).a, target, start, visited);
					visited[list.get(i).d]=false;
				}
			}else if(start==list.get(i).d) {
				if(!visited[list.get(i).a]) {
					visited[list.get(i).a]=true;
					dfs(list.get(i).d, target, start, visited);
					visited[list.get(i).a]=false;
				}
			}
		}
		return;
	}

}
