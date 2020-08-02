package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShortestWays {
	static int[] dist;
	public static class Dot implements Comparable<Dot>{

		int arrival;
		int weight;
		public Dot(int arrival, int weight) {
			this.arrival=arrival;
			this.weight=weight;
		}
		@Override
		public int compareTo(Dot o) {
				return this.weight-o.weight;
			
		}
		
	}
	static List<List<Dot>> list;
	static int DotCnt;
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		DotCnt=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(br.readLine());
		PriorityQueue<Dot> pq=new PriorityQueue<>();
		list=new ArrayList<List<Dot>>();
		final int INF=987654321;
		list.add(new ArrayList<Dot>());//0번째를 안쓰기 위해서
		for(int i=0; i<vex; i++) {
			list.add(new ArrayList<Dot>());
		}
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int depart=Integer.parseInt(st.nextToken());
			int arrival=Integer.parseInt(st.nextToken());
			int weight=Integer.parseInt(st.nextToken());
			list.get(depart).add(new Dot(arrival, weight));
		}
		dist=new int[DotCnt+1];
		Arrays.fill(dist, INF);
		
			dikjstra(list, dist, start);
			StringBuilder sb=new StringBuilder();
			for(int i=1; i<=DotCnt; i++) {
				if(dist[i]==INF) {
					sb.append("INF\n");
				}else {
					sb.append(dist[i]+"\n");
				}
			}
			System.out.println(sb.toString().trim());
		}
	public static void dikjstra(List<List<Dot>> arr, int[] dist,int start) {
		PriorityQueue<Dot> pq=new PriorityQueue<>();
		boolean[]visited=new boolean[DotCnt+1];
		pq.add(new Dot(start, 0));
		dist[start]=0;
		
		while(!pq.isEmpty()) {
			Dot n=pq.poll();
			if(visited[n.arrival]) {
				continue;
			}
			visited[n.arrival]=true;
			for(Dot tmp: list.get(n.arrival)) {
				if(dist[tmp.arrival]>tmp.weight+dist[n.arrival]) {
					dist[tmp.arrival]=tmp.weight+dist[n.arrival];
					pq.add(new Dot(tmp.arrival,dist[tmp.arrival]));
				}
			}
		}
		
		
	}

}
