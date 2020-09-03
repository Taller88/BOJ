package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class EfficientHacking {
	static int[] arr;
	static ArrayList<Integer>[] list;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		list=new ArrayList[n+1];
		arr=new int[n+1];
		for(int i=1; i<=n; i++) {
			list[i]=new ArrayList<Integer>();
		}
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			list[a].add(s);
		}
		int max=0;
		for(int i=1; i<=n; i++) {
			boolean[] visited=new boolean[n+1];
			visited[i]=true;
			arr[i]=dfs(i,visited);
//			System.out.println(i+" "+arr[i]);
			max=Math.max(max, arr[i]);
		}
		String result="";
		for(int i=1; i<=n; i++) {
			if(arr[i]==max) {
				result+=i+" ";
			}
		}
		System.out.println(result.trim());
		
	}
	private static int dfs(int s,boolean[] visited) {
		int cnt=0;
		for(int a:list[s]) {
			if(!visited[a]) {
				visited[a]=true;
				cnt+=dfs(a,visited)+1;
				
			}
		}
		
		return cnt;
	}

}
