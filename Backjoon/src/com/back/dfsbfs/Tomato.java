package com.back.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tomato {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int y=Integer.parseInt(st.nextToken());
		int x=Integer.parseInt(st.nextToken());
		int arr[][]=new int[x][y];
		boolean visited[][]=new boolean[x][y];
		
		for(int i=0; i<arr.length; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==1) {
					dfs(arr,i,j,visited);
				}
			}
		}
		
//		6 4
//		0 0 0 0 0 0
//		0 0 0 0 0 0
//		0 0 0 0 0 0
//		0 0 0 0 0 1
	}

	public static void dfs(int[][] arr, int x, int y, boolean[][] visited) {
		if(x>=arr.length ||y>=arr[0].length ||arr[x][y]!=-1 || visited[x][y]) {
			return;
		}
		if(x==arr.length-1 && y==arr[0].length) {
			dfs(arr, x-1, y, visited);
			dfs(arr, x, y-1, visited);
		}else if(x==arr.length-1) {
			dfs(arr, x, y+1, visited);
			dfs(arr, x-1, y, visited);
			dfs(arr, x, y-1, visited);
		}else if(y==arr[0].length-1) {
			dfs(arr, x+1, y, visited);
			dfs(arr, x-1, y, visited);
			dfs(arr, x, y-1, visited);
		}else if(x<1 && y<1) {
			dfs(arr, x+1, y, visited);
			dfs(arr, x, y+1, visited);
		}
		if(x<1) {
			dfs(arr, x+1, y, visited);
			dfs(arr, x, y+1, visited);
			dfs(arr, x, y-1, visited);
		}
		if(y<1) {
			dfs(arr, x+1, y, visited);
			dfs(arr, x-1, y, visited);
			dfs(arr, x, y+1, visited);
		}
		
		
	}

}
