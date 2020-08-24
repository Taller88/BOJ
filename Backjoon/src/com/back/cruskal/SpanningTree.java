package com.back.cruskal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SpanningTree {
	static int[]parent;
	static class Node implements Comparable<Node>{
		int s, a,cost;
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
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		3 3
//		1 2 1
//		2 3 2
//		1 3 3
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		parent=new int[n+1];
		for(int i=0; i<parent.length; i++) {
			parent[i]=i;
		}
		int vex=Integer.parseInt(st.nextToken());
		PriorityQueue<Node> pq=new PriorityQueue<>();
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int cost=Integer.parseInt(st.nextToken());
			pq.add(new Node(s, a, cost));
		}
		int result=0;
		for(int i=0; i<vex; i++) {
			Node node=pq.poll();
			if(find(node.s)==find(node.a)) {
				continue;
			}
			unionParent(node.s, node.a);
			result+=node.cost;
		}
		System.out.println(result);
		
	}
	public static void unionParent(int x, int y) {
		int aRoot = find(x);
        int bRoot = find(y);
        
        if(aRoot != bRoot) {
            parent[aRoot] = y;
        } else {
            return;
        }
		
	}
	public static int find(int a) {
		if(a == parent[a]) return a;
        parent[a] = find(parent[a]);
        return parent[a];
    }
}
