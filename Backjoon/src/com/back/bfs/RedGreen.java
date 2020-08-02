package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class RedGreen {
	static int[]dx= {0,0,1,-1};
	static int[]dy= {1,-1,0,0};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		5
//		RRRBB
//		GGBBB
//		BBBRR
//		BBRRR
//		RRRRR
		int n=Integer.parseInt(br.readLine());
		String[][]arr=new String[n][n];
		String[][]arr2=new String[n][n];
		
		for(int i=0; i<arr.length; i++) {
			String tmp=br.readLine();
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=tmp.charAt(j)+"";
				if(tmp.charAt(j)=='G') {
					arr2[i][j]="R";
				}else {
					arr2[i][j]=tmp.charAt(j)+"";
				}
			}
		}
		int cnt=0;
		int pCnt=0;
		boolean[][] visited=new boolean[n][n];
		boolean[][] pVisited=new boolean[n][n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[0].length; j++) {
				if(!visited[i][j]) {
					cnt++;
					bfs(visited, arr,i,j);
				}
				if(!pVisited[i][j]) {
					pCnt++;
					bfs(pVisited, arr2,i,j);
				}
			}
		}
		System.out.println(cnt+" "+pCnt);
		
	}
	static class Dot{
		int x; 
		int y;
		public Dot(int x, int y) {
			this.x=x;
			this.y=y;
			
		}
	}
	public static void bfs(boolean[][] visited, String[][] arr, int x, int y) {
		Queue<Dot> q=new LinkedList<>();
		q.add(new Dot(x,y));
		visited[x][y]=true;
		while(!q.isEmpty()) {
			Dot t=q.poll();
			x=t.x;
			y=t.y;
			for(int i=0; i<4;i++) {
				int x_=x+dx[i];
				int y_=y+dy[i];
				if(x_>=0 && y_>=0 && x_<arr.length && y_<arr.length) {
					if(arr[x_][y_].equals(arr[x][y]) && !visited[x_][y_]) {
						visited[x_][y_]=true;
						q.add(new Dot(x_,y_));
					}
				}
			}	
		}
		
	}
	
}
