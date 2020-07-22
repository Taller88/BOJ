package com.back.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Island {
//	1 1
//	0
//	2 2
//	0 1
//	1 0
//	3 2
//	1 1 1
//	1 1 1
//	5 4
//	1 0 1 0 0
//	1 0 0 0 0
//	1 0 1 0 1
//	1 0 0 1 0
//	0 0
	static int[]dx= {1,-1,0,0,1,-1,1,-1};
	static int[]dy= {1,-1,1,-1,0,0,-1,1};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true) {
			String input=br.readLine();
			if(input.equals("0 0")) {
				break;
			}
			StringTokenizer st=new StringTokenizer(input);
			int w=Integer.parseInt(st.nextToken());
			int h=Integer.parseInt(st.nextToken());
			
			int[][] arr=new int[h][w];
			boolean[][] visited=new boolean[h][w];
			for(int i=0; i<h; i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0; j<w; j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			int cnt=0;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(arr[i][j]==1 &&!visited[i][j]) {
						dfs(arr,i,j,visited);
						cnt++;
					}
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb.toString());
		
	}

	public static void dfs(int[][] arr, int x, int y, boolean[][] visited) {
	
		visited[x][y]=true;
		for(int i=0; i<8; i++) {
			int x_=dx[i]+x;
			int y_=dy[i]+y;
			if(x_>=0 && y_>=0 && x_<arr.length && y_<arr[0].length) {
				if(arr[x_][y_]==1 && !visited[x_][y_]) {
					dfs(arr, x_, y_, visited);
				}
			}
		}
	
	}

}
