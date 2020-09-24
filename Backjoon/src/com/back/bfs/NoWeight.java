package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NoWeight {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][]arr=new int[n][n];
		int[][]result=new int[n][n];
		
		StringTokenizer st;
		for(int i=0; i<arr.length; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(bfs(arr, i,j)) {
					result[i][j]=1;
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				sb.append(result[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}

	public static boolean bfs(int[][] arr, int start, int target) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		boolean[]visited=new boolean[arr.length];
		while(!q.isEmpty()) {
			int idx=q.poll();
			for(int i=0; i<arr[idx].length; i++) {
				if(!visited[i] && arr[idx][i]==1) {
					visited[i]=true;
					q.add(i);
					if(i==target) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
