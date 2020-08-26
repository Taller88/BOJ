package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Hacking {
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		arr=new int[n+1];
		int vex=Integer.parseInt(st.nextToken());
		for(int i=0; i<n+1; i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int child=Integer.parseInt(st.nextToken());
			int parent=Integer.parseInt(st.nextToken());
			list.get(parent).add(child);
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).size()>0) {
				visited=new boolean[n+1];
				arr[i]=dfs(i)+1;
				System.out.println(i+" "+arr[i]);
			}
		}
		int max=0;
		for(int i:arr) {
			max=Math.max(max, i);
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			if(max==arr[i]) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
	public static int dfs(int s) {
		visited[s]=true;
		for(int linked:list.get(s)) {
			if(!visited[linked]) {
				return dfs(linked)+1;
				
			}
		}
		return 0;
	}

}
