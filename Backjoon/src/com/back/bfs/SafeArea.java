package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SafeArea {
	static int cnt=0;
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	static int result=0;
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int w=Integer.parseInt(br.readLine());
		int[][]arr=new int[w][w];
		
		StringTokenizer st;
		int max=0;
		for(int i=0; i<w; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<w; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		for(int i=0; i<=max; i++) {
			int[][]tmp=arr.clone();
			boolean [][]visited=new boolean[w][w];
			
			rain(i, tmp);
			int cnt=0;
			for(int k=0; k<arr.length; k++) {
				for(int j=0; j<arr[0].length; j++) {
					if(!visited[k][j] && tmp[k][j]!=0) {
//						System.out.println("비의 양: "+i );
						bfs(k, j, arr, i, visited);
						cnt++;
					}
				}
			if(result<cnt) {
				result=cnt;
			}
			
			}
		}
		
		System.out.println(result);
		
	}
	public static void rain(int rain, int[][] tmp) {
		for(int i=0; i<tmp.length; i++) {
			for(int j=0; j<tmp[0].length; j++) {
				if(tmp[i][j]<=rain) {
					tmp[i][j]=0;
				}
			}
		}
	}
	static class Island{
		int x;
		int y;
		public Island(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void bfs(int x, int y,int[][] arr, int rain, boolean[][] visited) {
		Queue<Island> q=new LinkedList<>();
		q.add(new Island(x, y));
		
		while(!q.isEmpty()) {
			Island xy=q.poll();
			for(int i=0; i<4; i++) {
				int x_=xy.x+dx[i];
				int y_=xy.y+dy[i];
				if(x_>=0 && y_>=0 && x_<arr.length && y_<arr.length) {
					if(arr[x_][y_]!=0 && !visited[x_][y_]) {
						visited[x_][y_]=true;
//							System.out.println(x_+" "+y_);
						q.add(new Island(x_, y_));
					}
				}
			}
		}
		
		
	}

}
