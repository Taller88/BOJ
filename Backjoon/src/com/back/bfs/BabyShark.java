package com.back.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BabyShark {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][n];
		int x = 0;
		int y = 0;
		int result = 0;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				int el = Integer.parseInt(st.nextToken());
				arr[i][j] = el;
				if(el==9) {
					x = i;
					y=i;
				}else if(el!=9 && el!=0) {
					result = el;
				}
			}
			
		}
		
		if(result == 0) {
			System.out.println(result);
		}else {
			int babySharkSize = 2;
			bfs(arr, x, y, babySharkSize);
			
		}
		

	}

	static class Dot{
		int x,y,size=0;
		public Dot() {
		}
		public Dot(int x, int y, int size) {
			this.x = x;
			this.y=y;
			this.size =size;
			
			
		}
		
	}
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	
	private static void bfs(int[][] arr, int startX, int startY, int babySharkSize) {
		
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(startX, startY, babySharkSize));
		boolean [][]visited = new boolean[arr.length][arr[0].length];
		visited[startX][startY] = true;
		
		while(q.isEmpty()) {
			Dot d = q.poll();
			
			for(int i = 0; i<dx.length; i++) {
				int x = d.x+dx[i];
				int y = d.y+dy[i];
				if(x>=0 && x<arr.length && y>=0 && y<arr.length) {
					// 상어가 물고기를 먹을수 있는 경
					if(arr[x][y]<d.size) {
						q.add(new Dot(x, y, d.size+arr[x][y]));
						arr[x][y]=0;
						//이동만 했을때 : 물고기 사이즈와 상어 사이즈가 동일 /빈칸일 경
					}else if(arr[x][y]==d.size || arr[x][y]==0) {
						q.add(new Dot(x, y, d.size));
						
					}
				}
				
				
			}
			
			
		}
		
	}

}
