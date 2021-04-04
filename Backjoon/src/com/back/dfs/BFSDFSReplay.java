package com.back.dfs;

import java.util.*;


public class BFSDFSReplay {
	static int[][] array;
	static boolean[] visited;
	static String bfsResult = ""; 
	static String dfsResult = "";
	
	public static void main(String[]args) {
//		4 5 1
//		1 2
//		1 3
//		1 4
//		2 4
//		3 4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();
		
		array = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i =0; i<m; i++) {
			int first = sc.nextInt();
			int sec = sc.nextInt();
//			System.out.println(first +" "+sec);
			array[first][sec] = array[sec][first] = 1;
		}
		
		dfs(start);
		System.out.println(dfsResult.trim());
		visited = new boolean[n+1];
		
		bfs(start);
		System.out.println(bfsResult.trim());

		
	
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		dfsResult += start +" ";
		for(int i=0; i<array.length; i++) {
			if(array[start][i]==1 && !visited[i]) {
				//System.out.println("i: "+ i);
				dfs(i);
			}
		}
		
	}
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(start);
		visited[start] = true;
		
		while(!que.isEmpty()) {
			int temp = que.poll();
			bfsResult += temp+ " ";
			for(int i=0; i<array.length; i++) {
				if(array[temp][i] == 1 && !visited[i] ) {
					que.add(i);
					visited[i] = true;
				}
			}
		}
		
		
	}
	
	
}
