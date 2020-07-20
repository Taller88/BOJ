package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {
//	7 7
//	2 0 0 0 1 1 0
//	0 0 1 0 1 2 0
//	0 1 1 0 1 0 0
//	0 1 0 0 0 0 0
//	0 0 0 0 0 1 1
//	0 1 0 0 0 0 0
//	0 1 0 0 0 0 0
	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
	static int max=0;
	public static void checkArr(int [][]arr) {
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==0) {
					cnt++;
				}
			}
		}
		if(cnt>max) {
			max=cnt;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("0의 개수:"+cnt);
		}
	}
	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		int [][]arr=new int[w][h];
		boolean[][]visited=new boolean[w][h];
		for(int i=0; i<w; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<h; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		dfs(arr, 0,0,3,visited);
//		bfs();
//		checkArr();

	}

		public static void dfs(int[][] arr,int startX, int startY, int cnt,boolean[][]visited) {
			if(cnt==0) {
				int copyA[][]=new int[arr.length][arr[0].length];
				for(int i=0; i<arr.length; i++) {
					for(int j=0;j<arr[0].length; j++) {
						copyA[i][j]=arr[i][j];
					}
				}
				bfs(copyA);
				checkArr(copyA);
				return;
			}
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(!visited[i][j] && arr[i][j]==0) {
						visited[i][j]=true;
						arr[i][j]=8;
						dfs(arr,i, j, cnt-1, visited);
						arr[i][j]=0;
						visited[i][j]=false;
					}
				}
			}
			
			
		}
		public static void bfs(int[][] arr) {
			Queue<Dot> q=new LinkedList<>();
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(arr[i][j]==2) {
						q.add(new Dot(i,j));
					}
				}
			}
			while(!q.isEmpty()) {
				Dot d=q.poll();
				for(int i=0; i<4; i++) {
					int x=d.x+dx[i];
					int y=d.y+dy[i];
					if(x>=0 && y>=0 & x<arr.length && y<arr[0].length) {
						if(arr[x][y]==0) {
							arr[x][y]=2;
							q.add(new Dot(x,y));
						}
					}
					
				}
			}
			
		}
		static class Dot {
			int x;
			int y;
			public Dot(int x, int y) {
				this.x=x;
				this.y=y;
			}
			public Dot() {
			}
		}
}
