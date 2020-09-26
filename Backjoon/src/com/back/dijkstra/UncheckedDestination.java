package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class UncheckedDestination {
	static int[][]arr;
	static int[]dist;
	static final int INF=10_000_000;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCnt=Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		for(int z=0; z<testCnt; z++) {
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int t=Integer.parseInt(st.nextToken());
			arr=new int[n+1][n+1];
			dist=new int[n+1];
			for(int i=0; i<arr.length; i++) {
				Arrays.fill(arr[i], INF);
			}
			Arrays.fill(dist, INF);
			
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int g=Integer.parseInt(st.nextToken());
			int h=Integer.parseInt(st.nextToken());
			for(int i=0; i<m; i++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int d=Integer.parseInt(st.nextToken());
				arr[a][b]=arr[b][a]=d*2;
			}
			arr[h][g]=arr[g][h]=arr[h][g]-1;

			ArrayList<Integer> answer=new ArrayList<>();
			for(int i=0; i<t; i++) {
				answer.add(Integer.parseInt(br.readLine()));
			}
			
			dijkstra(s);
			Collections.sort(answer);
			for(int a: answer) {
				if(dist[a]%2==1) {
					sb.append(a+" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}
	
	static class Node implements Comparable<Node>{
		int x,cost;
		public Node(int x, int cost) {
			this.x=x;
			this.cost=cost;
		}
		@Override
		public int compareTo(Node o) {
			return this.cost-o.cost;
		}
	}
	private static void dijkstra(int s) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		boolean[]visited=new boolean[arr.length];
		pq.add(new Node(s, 0));
		dist[s]=0;
		
		while(!pq.isEmpty()) {
			Node n=pq.poll();
			if(visited[n.x]) {
				continue;
			}
			visited[n.x]=true;
			for(int i=0; i<arr[0].length; i++) {
				if(!visited[i] && dist[i]>dist[n.x]+arr[n.x][i] ) {
					
					dist[i]=dist[n.x]+arr[n.x][i];
					pq.add(new Node(i, dist[i]));
				}
			}
		}
	}
}
