package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ShortestWay {

	static class Node implements Comparable<Node>{
		int end, weight;
		public Node(int end, int weight) {
			this.end=end;
			this.weight=weight;
		}
		@Override
		public int compareTo(Node o) {
			return this.weight-o.weight;
		}
		
	}
	private final static int INF=100_000_000;
	static int[]dist;
	static List<Node>[] list;
	public static void main(String[] args) throws Exception{
//		5 6
//		1
//		5 1 1
//		1 2 2
//		1 3 3
//		2 3 4
//		2 4 5
//		3 4 6

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int num=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(br.readLine());
		dist=new int[num+1];
		list=new ArrayList[num+1];
		Arrays.fill(dist, INF);
		for(int i=1 ;i<=num; i++) {
			list[i]=new ArrayList<Node>();
		}
		
		
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			int weight=Integer.parseInt(st.nextToken());
			list[start].add(new Node(end, weight));
		}
		
		dijkstra(k);
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<dist.length; i++) {
			if(dist[i]==INF) {
				sb.append("INF\n");
			}else {
				sb.append(dist[i]+"\n");
			}
		}
		System.out.println(sb.toString().trim());
		
		
	}
	public static void dijkstra(int k) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		dist[k]=0;
		pq.add(new Node(k,0));
		while(!pq.isEmpty()) {
			Node n=pq.poll();
			for(Node node: list[n.end]) {
				if(dist[node.end]>dist[n.end]+node.weight) {
					dist[node.end]=dist[n.end]+node.weight;
					pq.add(new Node(node.end,dist[node.end]));
				}
			}
			
		}
	}

}
