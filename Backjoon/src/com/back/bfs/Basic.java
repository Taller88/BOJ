package com.back.bfs;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Basic {

	static int[][] arr = null;
	static Queue<Integer> q = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[]args) throws Exception{
//		4(노드개수) 5(간선개수) 1(start)
//		1 2
//		1 3
//		1 4
//		2 4
//		3 4
		
//		for(int i=0; i<arr.length; i++) {
//			String temp = "";
//			for(int j=0; j<arr[i].length; j++) {
//				temp+=arr[i][j]+" ";
//			}
//			System.out.println(temp);
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nodeCnt = Integer.parseInt(st.nextToken());
		int vex = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		arr = new int[nodeCnt+1][nodeCnt+1];
		boolean[] visited = new boolean[nodeCnt+1];
		for(int i=0; i<vex; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
			
		}
		bfs(start, visited);
		
		System.out.println(sb.toString());
		
	}
	private static void bfs(int start, boolean[] visited) {
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int el = q.poll();
			System.out.println(el);
			sb.append(el+" ");
			for(int i=1; i<arr[el].length; i++) {
				int poll = arr[el][i];
				if(poll==1 && !visited[i]) {
					q.add(i);
					visited[i] = true;

				}
			}
		}
	}
}
