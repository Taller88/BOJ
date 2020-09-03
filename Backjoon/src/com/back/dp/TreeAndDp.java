package com.back.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TreeAndDp {
		static int[] arr;
		static ArrayList<Integer>[] list;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int s=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		arr=new int[n+1];
		list=new ArrayList[n+1];
		for(int i=0; i<=n; i++) {
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			
		}
		
	}

}
