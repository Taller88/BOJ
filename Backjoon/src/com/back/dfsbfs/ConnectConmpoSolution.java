package com.back.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ConnectConmpoSolution {
	static ArrayList<ArrayList<Integer>> list;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int vec=Integer.parseInt(st.nextToken());
		list=new ArrayList<>();
		int cnt=0;
		for(int i=0; i<n+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		boolean[] visited=new boolean[n+1];
		for(int i=0; i<vec;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
			
		}
		for(int i=1; i<n+1; i++) {
			if(!visited[i]) {
				cnt++;
				dfs(visited,i);
			}
		}
		System.out.println(cnt);
	}

	public static void dfs(boolean[] visited, int i) {
		visited[i]=true;
		for(int value: list.get(i)) {
			if(!visited[value]) {
				dfs(visited, value);
			}
		}
	}

}
