package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BfsPrac {
	static Queue<Integer> q=new LinkedList<>();
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
//		4(노드 개수) 5(간선의 갯수) 1(시작점) 
//		1 2
//		1 3
//		1 4
//		2 4
//		3 4
		int num=Integer.parseInt(st.nextToken());
		int arr[][]=new int[num+1][num+1];
		boolean visited[]=new boolean[num+1];
		int vex=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(st.nextToken());
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			arr[a][b]=arr[b][a]=1;
		}
		bfs(arr, start,visited);
		System.out.println(sb.toString());
	}

	public static void bfs(int[][] arr, int start, boolean[] visited) {
		System.out.println("여기는?");
		q.add(start);
		visited[start]=true;
		while(!q.isEmpty()) {
			int s=q.poll();
			System.out.println(s);
			sb.append(s+" ");
			for(int i=1; i<arr.length; i++) {
				if(!visited[i] &&arr[s][i]==1) {
					q.add(i);
					visited[i]=true;
					
					System.out.println("s: "+s+" i:"+i);
				}
			}
		}
		
		
		
	}

}
