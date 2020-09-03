package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BreakWall {
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	static int answer=-1;
	
	//15
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
		int[][]arr=new int[h][w];
		boolean[][]visited=new boolean[h][w];
		for(int i=0; i<h; i++) {
			String[] tmp=br.readLine().split("");
			for(int j=0; j<tmp.length; j++) {
				arr[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		bfs(arr, visited);
		System.out.println(answer);
	}

	private static void bfs(int[][] arr, boolean[][]visited) {
		Queue<Dot> q=new LinkedList<>();
		visited[0][0]=true;
		q.add(new Dot(arr,1,0, 0, 1, visited));
		
		while(!q.isEmpty()) {
			Dot t=q.poll();
			if(t.x==arr.length-1 && t.y==arr[0].length-1) {
				if(t.cnt>answer || answer==-1) {
					answer=t.dis;
					
				}
			}
//			System.out.println(t.x +" "+t.y+" "+t.dis);
			for(int i=0; i<4; i++) {
				int x_=t.x+dx[i];
				int y_=t.y+dy[i];
				if(x_>=0 && y_>=0 && x_<arr.length && y_<arr[0].length ) {
					if(!t.visited[x_][y_] && t.arr[x_][y_]==0) {
						t.visited[x_][y_]=true;
						q.add(new Dot(t.arr,t.dis+1, x_, y_, t.cnt, t.visited));
					}else if(t.cnt==1 && arr[x_][y_]==1) {
						t.visited[x_][y_]=true;
						t.arr[x_][y_]=0;
						q.add(new Dot(t.arr,t.dis+1, x_, y_, t.cnt-1, t.visited));
					}
				}
			}
			
			
			
		}
		
	}
	static class Dot{
		int dis;
		int x;
		int y; 
		int cnt;
		boolean[][] visited;
		int[][] arr;
		public Dot(int[][] arr,int dis,int x, int y, int cnt, boolean[][]visited) {
			this.arr=arr;
			this.dis=dis;
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			this.visited=visited;
		}
	}
}
