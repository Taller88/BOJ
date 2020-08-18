package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SpecialWay {
	static int[][] arr;
	public static void main(String[]args) throws Exception{
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
		arr=new int[n+1][n+1];
		int vex=Integer.parseInt(st.nextToken());
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int a=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			arr[s][a]=c;
			arr[a][s]=c;
			
		}
		st=new StringTokenizer(br.readLine());
		int mid1=Integer.parseInt(st.nextToken());
		int mid2=Integer.parseInt(st.nextToken());
	
		int a1=dijkstra(1,mid1);
		int a2=dijkstra(mid1,mid2);
		int a3=dijkstra(mid2,n);
		int a=0;
		if(a1==-1 ||a2==-1 ||a3==-1 ) {
			a=-1;
		}else {
			a=a1+a2+a3;
		}
		int	b1=dijkstra(1,mid2);
		int b2=dijkstra(mid2,mid1);
		int b3=dijkstra(mid1,n);
		int b=0;
		if(b1==-1 ||b2==-1 ||b3==-1 ) {
			b=-1;
		}else {
			b=b1+b2+b3;
		}
		
		if(a==-1 && b==-1) {
			System.out.println(-1);
		}else if(a==-1 && b!=-1) {
			System.out.println(b);
		}else if(a!=-1 && b==-1) {
			System.out.println(a);
		}else if(a!=-1 && b!=-1 && a<=b) {
			System.out.println(a);
		}else if(a!=-1 && b!=-1 && a>b) {
			System.out.println(b);
		} 
				
	}
	public static int dijkstra(int s, int target) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		boolean[]visited=new boolean[arr.length];
		pq.add(new Node(s,0));
		int answer=0;
		while(!pq.isEmpty()) {
			Node n=pq.poll();
			if(n.x==target) {
//				System.out.println("s: "+s+" target:"+target+" ="+n.cnt);
				return n.cnt;
			}
			
			for(int i=0; i<arr[n.x].length; i++) {
				if(arr[n.x][i]!=0 && !visited[i]) {
					visited[i]=true;
					pq.add(new Node(i,n.cnt+arr[n.x][i]));
				}
			}
		}
		return -1;
		
	}
	static class Node implements Comparable<Node>{
		int x;
		int cnt;
		public Node(int x, int cnt) {
			this.x=x;
			this.cnt=cnt;
		}
		@Override
		public int compareTo(Node o) {
			return this.cnt-o.cnt;
		}
		
	}
	
}
