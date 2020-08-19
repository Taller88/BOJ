package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KebinBaicon {
	static int[] result;
	static int minRel=-1;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		result=new int[n+1];
		int vex=Integer.parseInt(st.nextToken());
		int[][]arr=new int[n+1][n+1];
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			arr[s][d]=arr[d][s]=1;
		}
		int[]out=new int[n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i!=j) {
					boolean[]visited=new boolean[n+1];
					int minRel=Integer.MAX_VALUE;
					dfs(arr,i,i,j,0,visited,minRel);
					out[i]+=result[i];
//					System.out.println(i+" "+j +" "+" "+result[i]);
				}
			}
//			System.out.println();
		}
//		Arrays.sort(out);
		int min=Integer.MAX_VALUE;
		int idx=0;
		for(int i=1; i<out.length; i++) {
			if(min>out[i]) {
				min=out[i];
				idx=i;
			}
		}
		System.out.println(idx);
		
	}

	public static void dfs(int[][] arr, int start, int s,int target, int cnt, boolean[] visited, int minRel) {
		if(s==target) {
			if(minRel>cnt) {
				minRel=cnt;
				result[start]=cnt;
			}
			return;

		}
		visited[s]=true;
		for(int i=0; i<arr[s].length; i++) {
			if(!visited[i] && arr[s][i]==1) {
				dfs(arr,start, i, target, cnt+1, visited,minRel);
			}
		}
		
		
	}

}
