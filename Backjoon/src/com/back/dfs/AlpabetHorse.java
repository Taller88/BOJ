package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlpabetHorse {
	static int[]dx= {1,-1,0,0};
	static int[]dy= {0,0,-1,1};
	static int max=0;

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int c=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken());
		String[][] arr=new String[c][r];
		boolean[][] visited=new boolean[c][r];
		for(int i=0; i<c; i++) {
			arr[i]=br.readLine().split("");
		}
		
		dfs(arr, arr[0][0],0,0, visited);
		System.out.println(max);
	}

	public static void dfs(String[][] arr, String result, int x, int y, boolean[][] visited) {
		
		
		
		boolean check=true;
		for(int i=0; i<4; i++) {
			int x_=x+dx[i];
			int y_=y+dy[i];
			if(x_>=0 && y_>=0 && x_<arr.length && y_<arr[0].length) {
				if(!visited[x_][y_] && !result.contains(arr[x_][y_])) {
					visited[x_][y_]=true;
					check=false;
					dfs(arr, result+arr[x_][y_], x_, y_, visited);
					visited[x_][y_]=false;
				}
			}
		}
		if(check) {
			if(result.length()>max) {
				max=result.length();
				return;
			}
		
		}
		
	}

}
