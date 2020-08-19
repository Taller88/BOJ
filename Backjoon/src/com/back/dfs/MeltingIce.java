package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MeltingIce {
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int[][]arr=new int[h][w];
		
		for(int i=0; i<h; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<w; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int year=0;
		while(true) {
			
//			checkArr(arr);
			
			int[][] tmp=new int[arr.length][arr[0].length];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					tmp[i][j]=arr[i][j];
				}
			}
//			arr[0][0]=888;
			
//			System.out.println("This is Tmp!");
//			checkArr(tmp);
			if(islandCount(arr, h, w)>=2) {
				break;
			}
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					if(arr[i][j]>0) {
						melting(arr,tmp,i,j);
					}
				}
			}
			
			if(checkZero(arr)) {
				System.out.println(0);
				return;
			}
			
			year++;
		}
		System.out.println(year);
	}
	public static boolean checkZero(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length ; j++) {
				if(arr[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void melting(int[][] arr,int[][] tmp, int h, int w) {
		
		int cnt=0;
		for(int i=0; i<4; i++) {
			int xx=h+dx[i];
			int yy=w+dy[i];
			if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
				if(tmp[xx][yy]==0) {
					cnt++;
				}
			}
		}
//		System.out.println(h+" "+w+" "+cnt);
		if(arr[h][w]<=cnt) {
//			System.out.println(tmp[h][w]);
			arr[h][w]=0;
		}else {
//			System.out.println(tmp[h][w]);
			arr[h][w]-=cnt;
		}
//		System.out.println("h: "+h + " w:"+w+" = "+cnt);
	}
	public static void checkArr(int[][] arr) {
		System.out.println("------------------------------");
		for(int i=0; i<arr.length; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
	}
	
	public static int islandCount(int[][] arr,int h, int w) {
	
		boolean[][]visited=new boolean[h][w];
		int islandCnt=0;
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(!visited[i][j] && arr[i][j]>0) {
				visited[i][j]=true;
				dfs(arr, i,j,0,visited);
				islandCnt++;
				}
			}
		}
		return islandCnt;
	}
	
	public static void dfs(int[][] arr, int h, int w, int cnt,boolean[][] visited) {
//		System.out.print(arr[h][w]+" ");
		for(int i=0; i<4; i++) {
			int xx=h+dx[i];
			int yy=w+dy[i];
			if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
				if(!visited[xx][yy] && arr[xx][yy]>0) {
					visited[xx][yy]=true;
					dfs(arr, xx, yy, cnt+1,visited);
				}
			}
		}
	}

}
