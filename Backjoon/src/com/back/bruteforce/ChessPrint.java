package com.back.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.back.dfsbfs.DfsBfs;

public class ChessPrint {
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	static int min=0;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int height=Integer.parseInt(st.nextToken());
		int width=Integer.parseInt(st.nextToken());
		min=height*width;
		String[][] arr=new String[height][width];
		for(int i=0; i<height;i++) {
			String tmp=br.readLine();
			for(int j=0; j<width; j++) {
				arr[i][j]=tmp.charAt(i)+"";
			}
		}
		
		for(int i=0; i<height-8; i++) {
			for(int j=0; j<width-8; j++) {
				dfs(arr,i,j,0);
			}
		}
		
		
	}
	public static void dfs(String[][] arr, int x, int y, int cnt) {
		if(x==x+8 && y==y+8) {
			if(cnt<min) {
				min=cnt;
				return;
			}
			return;
		}
		
		for(int i=0; i<4; i++) {
			int x_=x+dx[i];
			int y_=y+dy[i];
			if(x_>=0 && y_>=0 && x_<x+8 && y_<y+8) {
				
			}
			
		}
		
		
	}

}
