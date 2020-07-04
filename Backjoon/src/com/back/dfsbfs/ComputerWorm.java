package com.back.dfsbfs;
import java.util.*;
public class ComputerWorm {
	static int[][] graph;
	static boolean[] visited;
	static int result=0;
//	7
//	6
//	1 2
//	2 3
//	1 5
//	5 2
//	5 6
//	4 7
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int rel=sc.nextInt();
		graph=new int[c+1][c+1];
		visited=new boolean[c+1];
		
		for(int i=0; i<rel; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			graph[x][y]=graph[y][x]=1;
		}
		dfs(1);
		System.out.println(result);
		
	}

	public static void dfs(int s) {
		visited[s]=true;
		for(int i=1; i<graph[s].length; i++) {
			if(!visited[i] && graph[s][i]==1) {
				result++;
				dfs(i);
			}
			
			
		}
	
		
	}
}
