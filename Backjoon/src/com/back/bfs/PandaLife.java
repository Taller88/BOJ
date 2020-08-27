package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PandaLife {
	static class Panda{
		int x, y,live,gross;
		boolean[][] visited;
		public Panda(int x, int y, int live, int gross,boolean[][] visited) {
			this.x=x;
			this.y=y;
			this.live=live;
			this.gross=gross;
			this.visited=visited;
		}
	}
	static int[][] dp;
	static int[][] arr;
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		4
//		14 9 12 10
//		1 11 5 4
//		7 15 2 13
//		6 3 16 8
		int n=Integer.parseInt(br.readLine());
		arr=new int[n][n];
		dp=new int[n][n];
		int min=1000001;
		Panda panda = null;
		int max=0;
		for(int i=0; i<n; i++) {
			String[] tmp=br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				arr[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				max=Math.max(dfs(i, j,arr[i][j]),max);
			}
		}
		System.out.println(max);
		
	}

	public static int dfs(int x, int y, int gross) {
		
		if(dp[x][y]!=0) {
			return dp[x][y];
		}
		
		int life=1;
		for(int i=0; i<4; i++) {
			int xx=x+dx[i];
			int yy=y+dy[i];
			if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
				if(arr[xx][yy]>gross ) {
					life=Math.max(dfs(xx, yy, arr[xx][yy])+1,life);
					dp[x][y]=life;
				}
			}
			
		}
		return life;
		
		
	}
	
	
	
//	public static int bfs(int x, int y) {
//		Queue<Panda> q=new LinkedList<Panda>();
//		boolean[][]visited=new boolean[arr.length][arr[0].length];
//		visited[x][y]=true;
//		q.add(new Panda(x, y, 1, arr[x][y], visited));
//		int cnt=0;
//		while(!q.isEmpty()) {
//			Panda p=q.poll();
////			System.out.println(p.gross);
//			if(p.live>cnt) {
//				cnt=p.live;
//			}
//			if(dp[p.x][p.y]!=0) {
//				
//			}
//			for(int i=0; i<4; i++) {
//				int xx=p.x+dx[i];
//				int yy=p.y+dy[i];
//				if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
//					if(arr[xx][yy]>p.gross && !p.visited[xx][yy]) {
//						p.visited[xx][yy]=true;
//						q.add(new Panda(xx, yy, p.live+1, arr[xx][yy],p.visited));
//					}
//				}
//				
//			}
//		}
//		return cnt;
//	}

}
