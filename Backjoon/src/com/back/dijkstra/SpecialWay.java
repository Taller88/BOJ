package com.back.dijkstra;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SpecialWay {
	static ArrayList<Dot>[] arr;
	static boolean[] visited;
	static int n=0;
	static int[]dist;
	static final int INF=200_000_000;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		arr=new ArrayList[n+1];
		dist=new int[n+1];
		visited=new boolean[n+1];
		int vex=Integer.parseInt(st.nextToken());
		for(int i=0; i<=n; i++) {
			arr[i]=new ArrayList<Dot>();
		}
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			arr[s].add(new Dot(a, c));
		}
		st=new StringTokenizer(br.readLine());
		int a1=Integer.parseInt(st.nextToken());
		int a2=Integer.parseInt(st.nextToken());
		
		int path1=dijkstra(1, a1)+dijkstra(a1,a2)+dijkstra(a2, n);
		int path2=dijkstra(1, a2)+dijkstra(a2,a1)+dijkstra(a1, n);
		
		
		if(path1>=INF && path2>=INF) {
			System.out.println(-1);
		}else {
			System.out.println(path1);
			System.out.println(path2);
//			
			System.out.println(Math.min(path1, path2));
		}
		
	}
	
	static class Dot implements Comparable<Dot>{
		int x,y,cost;
		public Dot(int x, int cost) {
			this.x=x;
			this.cost=cost;
		}
		@Override
		public int compareTo(Dot o) {
			return this.cost-o.cost;
		}
		
	}
	private static int dijkstra(int s, int a) {
		PriorityQueue<Dot> pq=new PriorityQueue<>();
		pq.add(new Dot(s, 0));
		Arrays.fill(dist, INF);
		Arrays.fill(visited, false);
		dist[s]=0;
	
		while(!pq.isEmpty()) {
			Dot d=pq.poll();
			if(visited[d.x]) continue;
			visited[d.x] = true;
            
			for(int i=0; i<arr[d.x].size(); i++) {
				if(!visited[i] && dist[i]>dist[d.x]+arr[d.x].get(i).cost) {
					dist[i]=dist[d.x]+arr[d.x].get(i).cost;
					pq.add(new Dot(i, dist[i]));
				}
			}
		}
		
		return dist[a];
	}

}
