package com.back.cruskal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NetworkCon {
	static class Node implements Comparable<Node>{
		int s,a,cost;
		public Node(int s, int a, int cost) {
			this.s=s;
			this.a=a;
			this.cost=cost;
		}
		@Override
		public int compareTo(Node o) {
			return this.cost-o.cost;
		}
		
	}
	static int[] parent;
	public static void main(String[] args) throws Exception{
//		6
//		9
//		1 2 5
//		1 3 4
//		2 3 2
//		2 4 7
//		3 4 6
//		3 5 11
//		4 5 3
//		4 6 8
//		5 6 8
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		parent=new int[num+1];
		for(int i=0; i<parent.length; i++) {
			parent[i]=i;
		}
		int vex=Integer.parseInt(br.readLine());
		PriorityQueue<Node> pq=new PriorityQueue<>();
		StringTokenizer st;
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			pq.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		int result=0;
		while(!pq.isEmpty()) {
			Node n=pq.poll();
//			check();
//			System.out.println(n.s+" "+n.a+" "+n.cost);
			int a=find(n.s);
			int b=find(n.a);
			if(a==b) {
				continue;
			}
			union(n.s, n.a);
			result+=n.cost;
		}
		System.out.println(result);
	}
	public static void union(int x, int y) {
		  int aRoot = find(x);
	      int bRoot = find(y);
	        
	        if(aRoot != bRoot) {
	            parent[aRoot] = y;
	        } else {
	            return;
	        }
	}
	public static int find(int s) {
		if(parent[s]==s) {
			return s;
		}
		return parent[s]=find(parent[s]);
	}
	public static void check() {
		for(int i=0; i<parent.length; i++) {
			System.out.print(parent[i]+" ");
		}
		System.out.println();
	}
}
