package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpanningTree {

	public static void main(String[] args) throws Exception{
//		3 3
//		1 2 1
//		2 3 2
//		1 3 3
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int[][] arr=new int[n+1][n+1];
		int vex=Integer.parseInt(st.nextToken());
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			arr[s][a]=w;
		}
		dijkstra(arr);
	}

	private static void dijkstra(int[][] arr) {
		// TODO Auto-generated method stub
		
	}

}
