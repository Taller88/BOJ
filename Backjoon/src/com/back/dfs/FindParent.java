package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FindParent {
	static ArrayList<Integer>[] list;
	static int[]result;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		list=new ArrayList[n+1];
		result=new int[n+1];
		for(int i=1; i<list.length; i++) {
			list[i]=new ArrayList<Integer>();
		}
		StringTokenizer st;
		for(int i=0; i<n-1; i++) {
			st=new StringTokenizer(br.readLine());
			int c=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			list[c].add(p);
			list[p].add(c);
		}
		boolean[]visited=new boolean[n+1];
		dfs(1,visited,0);
		for(int i=2; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static void dfs(int s, boolean[] visited, int parent) {
		for(int a: list[s]) {
			if(!visited[a]) {
				visited[a]=true;
				result[a]=s;
				dfs(a, visited, s);
				visited[a]=false;
			}
		}
	}

}
