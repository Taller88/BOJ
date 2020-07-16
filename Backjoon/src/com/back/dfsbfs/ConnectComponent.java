package com.back.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConnectComponent {
	public static void main(String []args) throws Exception {
		int cnt=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int vec=Integer.parseInt(st.nextToken());
		boolean[] visited=new boolean[n+1];
		int[][] arr=new int[n+1][n+1];
		for(int i=0; i<vec;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			arr[a][b]=arr[b][a]=1;
		}
		
		
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<n+1;j++) {
				if(!visited[i] && arr[i][j]==1) {
				dfs(arr,i,visited);
				cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static void dfs(int[][] arr, int start, boolean[] visited) {

		visited[start]=true;
		for(int i=1; i<arr.length; i++) {
			if(!visited[i] && arr[start][i]==1) {
				dfs(arr, i, visited);
			}
		}
//		visited[]
	}
}
