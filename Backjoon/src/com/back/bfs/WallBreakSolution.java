package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class WallBreakSolution {
	static int [] dx= {0,0,1,-1};
	static int [] dy= {1,-1,0,0};
	static int min=-1;
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
		boolean[][] visited=new boolean[h][w];
		for(int i=0; i<h; i++) {
			String[]tmp=br.readLine().split("");
			for(int j=0; j<tmp.length; j++) {
				arr[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		bfs(arr,0,0);
		System.out.println(min);
	}
	static class Dot{
		int x;
		int y;
		int cnt;
		int breakCnt;
		public Dot(int x, int y, int cnt, int breakCnt) {
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			this.breakCnt=breakCnt;
		}
		
	}
	public static void bfs(int[][] arr, int x, int y) {
		Queue<Dot> q=new LinkedList<>();
		q.add(new Dot(x,y,1,1));
		while(!q.isEmpty()) {
			Dot t=q.poll();
//			System.out.println("t.x: "+t.x+" t.y: "+t.y+" t.cnt: "+t.cnt+" t.break: "+t.breakCnt);
			if(t.x==arr.length-1 && t.y==arr[0].length-1) {
				if(min==-1 || min>t.cnt) {
					min =t.cnt;
				}
			}
			for(int z=0; z<4; z++) {
				int x_=t.x+dx[z];
				int y_=t.y+dy[z];
				if(x_>=0 && y_>=0 && x_<arr.length && y_<arr[0].length) {
//					System.out.println("x: "+x_+" y: "+y_);
					if(arr[x_][y_]==0) {
						arr[x_][y_]=t.cnt+1;
						q.add(new Dot(x_,y_,t.cnt+1, t.breakCnt));
					}else if(arr[x_][y_]==1 && t.breakCnt==1) {
						arr[x_][y_]=t.cnt+1;
						q.add(new Dot(x_,y_,t.cnt+1, t.breakCnt-1));
					}
				}
				
				
				
			}
		}
	}
	
}
