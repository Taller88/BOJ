package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class KnightMove {
	static int[]dx= {-1,1,2,-2,1,-1,-2,-2};
	static int[]dy= {2,2,1,1,-2,-2,-1,1};
	static int[]dx1= {2,-2};
	static int[]dy2= {-2,2};
	static StringBuilder sb=new StringBuilder();
	

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int z=0; z<n; z++) {
			int width=Integer.parseInt(br.readLine());
			int[][]arr=new int[width][width];
			boolean[][]visited=new boolean[width][width];
			st=new StringTokenizer(br.readLine());
			int sX=Integer.parseInt(st.nextToken());
			int sY=Integer.parseInt(st.nextToken());
			
			st=new StringTokenizer(br.readLine());
			int aX=Integer.parseInt(st.nextToken());
			int aY=Integer.parseInt(st.nextToken());
			bfs(arr, sX, sY, aX, aY, visited);
		
		
		}
		System.out.println(sb.toString().trim());
	}
	static class Dot{
		int x;
		int y; 
		int cnt;
		boolean[][]visited;
		public Dot(int x, int y,boolean[][]visited, int cnt) {
			this.x=x;
			this.y=y;
			this.visited=visited;
			this.cnt=cnt;
					
		}
	}


	public static void bfs(int[][] arr, int sX, int sY, int aX, int aY, boolean[][] visited) {
		Queue<Dot> q=new LinkedList<>();
		visited[sX][sY]=true;
		q.add(new Dot(sX, sY, visited,0));
		while(!q.isEmpty()) {
			Dot t=q.poll();
			if(t.x==aX && t.y==aY) {
				sb.append(t.cnt+"\n");
			}
			
			for(int i=0; i<8; i++) {
				int x_=t.x+dx[i];
				int y_=t.y+dy[i];
				if(x_>=0 && y_>=0 && x_<arr.length && y_<arr[0].length) {
					if(!t.visited[x_][y_]) {
						t.visited[x_][y_]=true;
						q.add(new Dot(x_, y_, t.visited, t.cnt+1));
					}
				}
			}//for
		}
	}

}
