package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Weight {
	static int[][] result;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][]arr=new int[n][n];
		result=new int[n][n];
		
		StringTokenizer st;
		
		for(int i=0; i<arr.length; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				if(arr[i][j]==1) {
					result[i][j]=1;
				}else if(dfs(arr,i,j)){
					result[i][j]=1;
			}
		}
		
	}
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				sb.append(result[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}
	public static boolean dfs(int[][] arr, int start, int target) {
		if(start==target) {
			return true;
		}
		System.out.println(start+ " "+target);
		for(int i=0; i<arr[start].length; i++) {
			if(arr[start][i]==1) {
				dfs(arr, i, target);
			}
		}
		return false;
		
	}
	
	
}
