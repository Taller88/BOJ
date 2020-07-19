package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,1,-1};
	public static void main(String[] args) throws Exception{
//		6 4
//		0 0 0 0 0 0
//		0 0 0 0 0 0
//		0 0 0 0 0 0
//		0 0 0 0 0 1
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int width=Integer.parseInt(st.nextToken());
		int height=Integer.parseInt(st.nextToken());
		int arr[][]=new int[height][width];
		for(int i=0; i<height; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<width; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		boolean[][]visited=new boolean[height][width];
		bfs(arr);
		
		
	}
	public static class Dot{
		int x;
		int y;
		int day;
		public Dot(int x, int y, int day) {
			this.x=x;
			this.y=y;
			this.day=day;
			
		}
		public Dot() {
		}
	
	}
	public static void bfs(int[][] arr) {
		Queue<Dot> q=new LinkedList<>();
		int day=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==1) {
					q.add(new Dot(i,j,day));
				}
			}
		}
		while(!q.isEmpty()) {
			Dot t=q.poll();
			int x=0;
			int y=0;
			day=t.day;
			for(int i=0; i<4; i++) {
				x=t.x+dx[i];
				y=t.y+dy[i];
				if(x>=0 && y>=0 && x<arr.length && y<arr[0].length) {
					if(arr[x][y]==0) {
						arr[x][y]=1;
						q.add(new Dot(x,y,day+1));
					}
				}
			}
			
		}//while
		boolean check=false;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==0) {
					check=true;
					break;
				}
			}
		}
		if(check) {
			System.out.println(-1);
		}else {
			System.out.println(day);
		}
	}

}
