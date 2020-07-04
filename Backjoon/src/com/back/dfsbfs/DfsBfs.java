package com.back.dfsbfs;
import java.util.*;

public class DfsBfs {
	static boolean[] visit;
	static int[][] graph;
	static String dfs="";
	static String bfs="";
	
	
//	4 5 1
//	1 2
//	1 3
//	1 4
//	2 4
//	3 4
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int node=sc.nextInt();
		int rel=sc.nextInt();
		int start=sc.nextInt();
		visit=new boolean[node+1];
		graph=new int[node+1][node+1];
		for(int i=0; i<rel;i++) {
			int p=sc.nextInt();
			int c=sc.nextInt();
			graph[p][c]=graph[c][p]=1;
		}
		dfs(start);
		System.out.println(dfs.trim());
		visit=new boolean[node+1];
		bfs(start);
		System.out.println(bfs.trim());

		//아래는 그래프 모양을 check하기 위한 코드
		
		for(int i=0; i<graph.length; i++) {
			for(int j=0; j<graph[0].length; j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void bfs(int start) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		visit[start]=true;
		
		while(!q.isEmpty()) {
			int tmp=q.poll();//노드 번호를 추출
			bfs+=tmp+" ";
			for(int i=1; i<graph[tmp].length; i++) {
				if(graph[tmp][i]==1 && !visit[i]) {
					q.offer(i);
					visit[i]=true;
				}
			}
		}
		
		
	}

	public static void dfs(int start) {
		visit[start]=true;
		dfs+=start+" ";
		for(int i=1; i<graph[start].length;i++) {
			if(graph[start][i]==1 && !visit[i]) {
				dfs(i);
			}
		}
	}
}
