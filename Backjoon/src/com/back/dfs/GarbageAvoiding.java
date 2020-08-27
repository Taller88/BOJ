package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GarbageAvoiding {
	static int[][]arr;
	static int[] dx= {0,0,-1,1};
	static int[] dy= {1,-1,0,0};
	static boolean[][]visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		arr=new int[n+1][m+1];
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			arr[x][y]=1;
		}
		visited=new boolean[n+1][m+1];
		int max=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==1 && !visited[i][j]) {
					visited[i][j]=true;
//					System.out.println();
					max=Math.max(dfs(i,j,1),max);
//					System.out.println(i+" "+j+" max: "+max);
				}
			}
		}
		System.out.println(max);

	}

	public static int dfs(int x, int y, int cnt) {
//		System.out.println(x+" "+y);
		for(int i=0; i<4; i++) {
			int xx=x+dx[i];
			int yy=y+dy[i];
			if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
				if(arr[xx][yy]==1 && !visited[xx][yy]) {
					visited[xx][yy]=true;
					cnt=dfs(xx, yy,cnt+1);
				}
			}
			
		}
		return cnt;
	}

}
