package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class GoParty {
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
	static ArrayList<Node>[] list;
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int x=Integer.parseInt(st.nextToken());
		int[]arr=new int[n+1];
		list=new ArrayList[n+1];
		for(int i=0; i<list.length; i++) {
			list[i]=new ArrayList<Node>();
		}
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int cost=Integer.parseInt(st.nextToken());
			list[s].add(new Node(a, cost));
		}

		for(int i=1; i<arr.length; i++) {
			arr[i]=dijkstra(i,x)+dijkstra(x,i);
		}
		int max=0;
		for(int i=1; i<arr.length; i++) {
			System.out.println("arr[i]: "+arr[i]);
			max=Math.max(max, arr[i]);
		}
		System.out.println(max);
	}
	public static int dijkstra(int start, int x) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(start, 0));
		boolean[]visited=new boolean[list.length];
//		visited[start]=true;
		int answer=0;
		while(!pq.isEmpty()) {
			Node n=pq.poll();
			if(n.x==x) {
				answer=n.cost;
				break;
			}
			if(visited[n.x]) {
				continue;
			}
			visited[n.x]=true;
			for(Node node: list[n.x]) {
				pq.add(new Node(node.x, n.cost+node.cost));
			}
		}
		return answer;
	}

}
