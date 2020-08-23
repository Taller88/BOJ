package com.back.cruskal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpanningTree {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		3 3
//		1 2 1
//		2 3 2
//		1 3 3
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int[]parent=new int[n];
		int[][] arr=new int[n+1][n+1];
		int vex=Integer.parseInt(st.nextToken());
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			arr[s][d]=w;
			unionParent(parent, s, d);
		}
	}
	public static int getParent(int[] arr, int x) {
		if(arr[x]==x) {
			return x;
		}
		return arr[x]=getParent(arr, arr[x]);
	}
	public static int unionParent(int[] arr, int x, int y) {
		int a=getParent(arr, x);
		int b=getParent(arr, y);
		return a>b?b:a;
	}
	public static boolean findParent(int[] arr, int x, int y) {
		int a=getParent(arr, x);
		int b=getParent(arr, y);
		return a==b?true:false;
	}
	
	
}
