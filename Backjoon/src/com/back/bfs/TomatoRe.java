package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TomatoRe {

	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static boolean[][] visited;
	public static class Dot {
		int x; 
		int y;
		int day; 
		public Dot(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
		public Dot() {}
		
	}
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int arr[][]= new int[height][width];
		visited = new boolean[height][width];
		for(int i= 0; i<height; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<width; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());				
			}
				
		}
		
		int result = bfs(arr);
			System.out.println(result);		
		
		
	}
	private static int bfs(int[][] arr) {
		Queue<Dot> q = new LinkedList<TomatoRe.Dot>();
		
		for(int i=0; i< arr.length; i++) {
			for(int j= 0; j<arr[0].length; j++) {
				if(arr[i][j]== 1) {
					q.add(new Dot(i,j,0));
					visited[i][j] = true;
				}
			}
		}
		int max = 0;
		while(!q.isEmpty()) {
			Dot d = q.poll();
			int day = d.day;
			if(max<day) {
				max = day;
			}
			
			for(int i=0; i<4; i++) {
				int x = d.x + dx[i];
				int y = d.y + dy[i];
//				System.out.println("x: "+x+ " y: "+y+ " arr[0].length: "+arr[0].length+ " arr.length: "+arr.length);
				if(x<arr.length && y<arr[0].length && x>-1 && y> -1) {
//					System.out.println("x: "+x+ " y: "+y+ "arr[y][x]: "+arr[y][x] + " visited[y][x]: "+visited[y][x]);
					
					if( arr[x][y]== 0 && !visited[x][y])
					{
						
						q.add(new Dot(x,y,day+1));
						arr[x][y] = day+1;
						visited[x][y]= true;
					}	
				}
				
						
			}
			
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(" "+arr[i][j]);
				if(arr[i][j]==0) {
					System.out.println("i: "+ i + " j: "+j);
					return -1;
				}
			}
			System.out.println();
		}
		return max;
		
	}

}
