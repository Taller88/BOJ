package com.back.dfsbfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class BaeChu {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a=Integer.parseInt(br.readLine());
		for(int z=0; z<a; z++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int arr[][]=new int[x][y];
			boolean visited[][]=new boolean[x][y];
			int cnt=Integer.parseInt(st.nextToken());
			for(int i=0; i<cnt; i++) {
				st=new StringTokenizer(br.readLine());
				int p=Integer.parseInt(st.nextToken());
				int q=Integer.parseInt(st.nextToken());
				arr[p][q]=1;
			}
			int result=0;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					if(!visited[i][j] && arr[i][j]==1) {
						dfs(arr,i,j,visited);
						result++;
					}
				}
			}
			System.out.println(result);
			
		}
	}

	public static void dfs(int[][] arr, int x, int y, boolean[][] visited) {
		if( x>=arr.length ||y>=arr[0].length||visited[x][y] || arr[x][y]==0 ) {
			return;
		}
		
//		System.out.println("방문: "+x+","+y);
		visited[x][y]=true;
		if(x<1 && y<1) {
			dfs(arr, x+1, y, visited);
			dfs(arr, x, y+1, visited);
		}else if(x<1) {
			dfs(arr, x+1, y, visited);
			dfs(arr, x, y+1, visited);
			dfs(arr, x, y-1, visited);
	
		}else if(y<1) {
			dfs(arr, x+1, y, visited);
			dfs(arr, x-1, y, visited);
			dfs(arr, x, y+1, visited);
			
		}else {
			dfs(arr, x+1, y, visited);
			dfs(arr, x-1, y, visited);
			dfs(arr, x, y+1, visited);
			dfs(arr, x, y-1, visited);
		}

	}

}
