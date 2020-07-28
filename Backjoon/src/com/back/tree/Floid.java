package com.back.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.back.dfsbfs.DfsBfs;

public class Floid {
	static int[][] cities;
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
//		5(도시)
//		14(버스)
//		1 2 2
		int city=Integer.parseInt(br.readLine());
		int[][]arr=new int[city+1][city+1];
		boolean[][]visited=new boolean[city+1][city+1];
		cities=new int[city+1][city+1];
		
		int bus=Integer.parseInt(br.readLine());
		for(int i=0; i<bus; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int cost=Integer.parseInt(st.nextToken());
			if(arr[s][a]==0 || arr[s][a]>cost) {
				arr[s][a]=cost;
			}
		}
//		for(int i=1; i<arr.length; i++) {
//			for(int j=1; j<arr[0].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[0].length; j++) {
				if(i==j) {
					cities[i][j]=0;
				}else {
					dfs(arr, i,j,visited,arr[i][j]);
				}
			}
		}
		
	}
	public static void dfs(int[][] arr, int targetX, int target, boolean[][] visited, int cost) {
		for(int i=0; i<arr[0].length; i++) {
					}
	}

}
