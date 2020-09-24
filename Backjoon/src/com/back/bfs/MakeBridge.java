package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MakeBridge {
	static int islandCnt=0;
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][]arr=new int[n][n];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		boolean[][]visited=new boolean[n][n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]!=0 && !visited[i][j]) {
					findIsland(arr,i,j,++islandCnt,visited);
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]!=0 ) {
					makeBridge(arr,i,j,arr[i][j]);
				}
			}
		}
		
		System.out.println(min);
	}
	private static void makeBridge(int[][] arr, int x, int y, int v) {
		Queue<Dot> q=new LinkedList<>();
		boolean[][]visited=new boolean[arr.length][arr[0].length];
		q.add(new Dot(x, y,0));
		visited[x][y]=true;
		while(!q.isEmpty()) {
			Dot d=q.poll();
			if(arr[d.x][d.y]!=0 && arr[d.x][d.y]!=v ) {
				min=Math.min(min, d.cnt-1);
				return;
			}
			for(int i=0; i<4; i++) {
				int xx=d.x+dx[i];
				int yy=d.y+dy[i];
				if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
					if((arr[xx][yy]!=v || arr[xx][yy]==0) && !visited[xx][yy]) {
						visited[xx][yy]=true;
						q.add(new Dot(xx, yy, d.cnt+1));
					}
				}
				
			}
		}
		
	}

	static class Dot{
		int x,y,cnt;
		public Dot(int x, int y,int cnt) {
			this.x=x;
			this.y=y;
			this.cnt=cnt;
		}
	}
	static int[]dx= {0,0,1,-1};
	static int[]dy= {1,-1,0,0};
	
	public static void findIsland(int[][] arr, int x, int y, int v,boolean[][]visited) {
		Queue<Dot> q=new LinkedList<>();
		q.add(new Dot(x, y,0));
		visited[x][y]=true;
		arr[x][y]=v;
		while(!q.isEmpty()) {
			Dot d=q.poll();
			for(int i=0; i<4; i++) {
				int xx=d.x+dx[i];
				int yy=d.y+dy[i];
				if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
					if(arr[xx][yy]==1 &&!visited[xx][yy]) {
						visited[xx][yy]=true;
						arr[xx][yy]=v;
						q.add(new Dot(xx, yy,0));
					}
				}
				
			}
		}
	}

}
