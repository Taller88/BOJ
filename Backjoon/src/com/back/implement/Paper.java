package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Paper {


	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] arr=new int[100][100];
		StringTokenizer st;
		int cnt=0;
		
		for(int z=0; z<n; z++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			for(int i=x; i<x+10; i++) {
				for(int j=y; j<y+10; j++) {
//					System.out.println("i: "+i +" j: "+j);
					if(arr[i][j]!=1) {
						arr[i][j]=1;
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		
	}

}
