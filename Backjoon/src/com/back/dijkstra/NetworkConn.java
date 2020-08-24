package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NetworkConn {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int com=Integer.parseInt(br.readLine());
		int vex=Integer.parseInt(br.readLine());
		int[][] arr=new int[com+1][com+1];
		StringTokenizer st;
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			int cost=Integer.parseInt(st.nextToken());
			arr[s][d]=cost;
		}
//		6
//		9
//		1 2 5
//		1 3 4
//		2 3 2
//		2 4 7
//		3 4 6
//		3 5 11
//		4 5 3
//		4 6 8
//		5 6 8

	}

}
