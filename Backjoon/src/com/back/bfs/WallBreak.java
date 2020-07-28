package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WallBreak {
	static int [] dx= {0,0,1,-1};
	static int [] dy= {1,-1,0,0};
	static int min=0;
	public static void main(String[] args) throws Exception{
//		6 4
//		0100
//		1110
//		1000
//		0000
//		0111
//		0000
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int[][] arr=new int[h][w];
		min=h*w;
		boolean[][] visited=new boolean[h][w];
		for(int i=0; i<h; i++) {
			String[]tmp=br.readLine().split("");
			for(int j=0; j<tmp.length; j++) {
				arr[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		visited[0][0]=true;
		dfs(arr,0,0,1,1,visited);
		System.out.println(min+1);
		
	}
	public static void dfs(int[][] arr, int x, int y, int cnt,int breakCnt,boolean[][] visited) {
		
		if(x==arr.length-1 && y==arr[0].length-1) {
//			System.out.println("cnt: "+cnt);
			if(min==-1 || cnt<min) {
				min=cnt;
			}
			return;
		}
		
		if(cnt>arr[0].length*arr.length) {
			min=-1;
			return;
		}
		boolean check=true;
//		System.out.println("x: "+x+ " y_: "+y);
		
		for(int i=0; i<4; i++) {
			int x_=x+dx[i];
			int y_=y+dy[i];
			if(x_>=0 &&y_>=0 &&x_<arr.length && y_<arr[0].length) {
				if(arr[x_][y_]==0 && !visited[x_][y_]) {
					check=false;
					visited[x_][y_]=true;
					dfs(arr, x_, y_, cnt+1,breakCnt, visited);
					visited[x_][y_]=false;
				}
				if(arr[x_][y_]==1 && breakCnt==1) {
//					System.out.println("깬: x: "+x_+ " y_: "+y_);
					arr[x_][y_]=0;
					check=false;
					visited[x_][y_]=true;
					dfs(arr, x_, y_, cnt, breakCnt-1, visited);
				}
			}
			
		}
		if(check && min==arr.length*arr[0].length) {
			min=-1;
			return;
		}
		
		
	}

}
