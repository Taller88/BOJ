package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MostCheapWay {
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
	private final static int INF=2_147_483_647;
	static int[]dist;
	static List<Node>[] list;
	public static void main(String[] args) throws Exception{
//		5
//		8
//		1 2 2
//		1 3 3
//		1 4 1
//		1 5 10
//		2 4 2
//		3 4 1
//		3 5 1
//		4 5 3
//		1 5
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cityNum=Integer.parseInt(br.readLine());
		int busNum=Integer.parseInt(br.readLine());
		dist=new int[cityNum+1];
		list=new ArrayList[cityNum+1];
		StringTokenizer st;
		Arrays.fill(dist, INF);
		for(int i=1; i<=cityNum; i++) {
			list[i]=new ArrayList<Node>();
		}
		for(int i=0; i<busNum; i++) {
			st=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			int weight=Integer.parseInt(st.nextToken());
			list[start].add(new Node(end,weight));
		}
		
		st=new StringTokenizer(br.readLine());
		int k=Integer.parseInt(st.nextToken());
		int end=Integer.parseInt(st.nextToken());
		
		dijkstra(k,end);
		System.out.println(dist[end]);
		
	}
	public  static void dijkstra(int k, int end) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		dist[k]=0;
		pq.add(new Node(k,0));
		while(!pq.isEmpty()) {
			Node node=pq.poll();
			
			for(Node n: list[node.end]) {
				if(dist[n.end]>dist[node.end]+n.weight) {
					dist[n.end]=dist[node.end]+n.weight;
					pq.add(new Node(n.end,dist[n.end]));
				}
			}			
		}
	}

}
