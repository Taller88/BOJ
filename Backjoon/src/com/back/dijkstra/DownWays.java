package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DownWays {
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	static int answer=0;
	static int[][] arr;
	static int[][] dp;
	public static void main(String[] args) throws Exception{
//		4 5
//		50 45 37 32 30
//		35 50 40 20 25
//		30 30 25 17 28
//		27 24 22 15 10
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		arr=new int[h][w];
		dp=new int[h][w];
		for(int i=0; i<h; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<w; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				dp[i][j]=-1;
			}
		}
//		dp[0][0]=0;
		System.out.println(dfs(0,0));
	}

	public static int dfs(int h, int w) {		
		if(h==arr.length-1 && w==arr[0].length-1) {
			return 1;
		}
		if(dp[h][w]>=0) {
			return dp[h][w];
		}
		dp[h][w]=0;
		for(int i=0; i<4; i++) {
			int xx=h+dx[i];
			int yy=w+dy[i];
			if(isRange(xx, yy)) {
				if(arr[xx][yy]<arr[h][w]) {
					dp[h][w]+=dfs(xx, yy);
				}
			}
		}
		return dp[h][w];
	}

	public static boolean isRange(int xx, int yy) {
		if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
			return true;
		}else {
			return false;
		}
	}
	


}
