package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SpecialWay {
	static class Node implements Comparable<Node>{
		int end, weight;
		String before;
		public Node(int end, int weight, String before) {
			this.end=end;
			this.weight=weight;
			this.before=before;
		}
		@Override
		public int compareTo(Node o) {
			return this.weight-o.weight;
		}
	}
	private final static int INF=2_147_483_647;
	static int[]dis;
	
	static List<Node>[] list;
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		4 6
//		1 2 3
//		2 3 3
//		3 4 1
//		1 3 5
//		2 4 5
//		1 4 4
//		2 3
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		dis=new int[n+1];
		Arrays.fill(dis, INF);
		
		list=new ArrayList[n+1];
		for(int i=1; i<=n;i++) {
			list[i]=new ArrayList<Node>();
		}
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			int weight=Integer.parseInt(st.nextToken());
			list[start].add(new Node(end,weight,""));
		}
		st=new StringTokenizer(br.readLine());
		int first=Integer.parseInt(st.nextToken());
		int second=Integer.parseInt(st.nextToken());
		
		int result1=0;
		result1+=dijkstra(1,first);
		result1+=dijkstra(first,second);
		result1+=dijkstra(second,n);
		
		int result2=0;
		result2+=dijkstra(1,second);
		result2+=dijkstra(second,first);
		result2+=dijkstra(first,n);
		
		if(result1>=INF && result2>=INF) {
			System.out.println(-1);
		}else {
			System.out.println(Math.min(result1, result2));
		}
	}

	public static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(start,0, String.valueOf(start)));
		dis[start]=0;
		
		while(!pq.isEmpty()) {
			Node n=pq.poll();
			for(Node node: list[n.end]) {
//				System.out.println("idx: "+n.end+" contacnt: "+node.end+" contact/dis:"+dis[node.end]);
				if(dis[node.end]>dis[n.end]+node.weight) {
					dis[node.end]=dis[n.end]+node.weight;
					pq.add(new Node(node.end, dis[node.end], n.before+" "+node.end));		
				
				}
			}
		}//while
		return dis[end];

}
}
