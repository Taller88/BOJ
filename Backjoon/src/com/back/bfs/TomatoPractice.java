package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TomatoPractice {
	static class Dot{
		int x;
		int y;
		int cnt;
		public Dot() {
		}
		public Dot(int x, int y , int cnt) {
			this.x =x ;
			this.y = y;
			this.cnt = cnt;
		}
		
	}
	public static void checkArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			String temp = "";
			for(int j=0; j<arr[i].length; j++) {
				temp += arr[i][j]+" ";
			}
			System.out.println(temp);
		}
	}
	static Queue<Dot> q = new LinkedList<>();
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	
	public static void main(String[] args) throws Exception{
//		6 4
//		0 0 0 0 0 0
//		0 0 0 0 0 0
//		0 0 0 0 0 0
//		0 0 0 0 0 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int width = Integer.parseInt(st.nextToken());
		int height= Integer.parseInt(st.nextToken());
		int[][] arr = new int[height][width];
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<arr[i].length; j++) {
			 arr[i][j] = Integer.parseInt(st.nextToken());	
			}
		}
		
		
		System.out.println(bfs(arr));
		
		
		
		
	}
	
	private static int bfs(int[][] arr) {
		int day =0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==1) {
					q.add(new Dot(i, j,day));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Dot d = q.poll();
			for(int i=0; i<dx.length; i++) {
				int x = dx[i]+d.x;
				int y = dy[i]+d.y;
				day= d.cnt;
				if(x>=0 && x<arr.length && y>=0 && y<arr[0].length) {
					if(arr[x][y]==0) {
						q.add(new Dot(x,y,day+1));
						arr[x][y] =1;
						
					}
				}
			}
					
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==0) {
					return -1;
				}
			}
		}
		return day;
	}

}
