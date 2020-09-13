package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Escape {
	static int max=100000;
	static boolean[]visited=new boolean[max];
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int t=Integer.parseInt(st.nextToken());
		int g=Integer.parseInt(st.nextToken());
		
		bfs(n,t,g);
	}

	static class Node{
		int x,cnt;
		public Node(int x, int cnt) {
			this.x=x;
			this.cnt=cnt;
		}
	}
	private static void bfs(int s, int t, int g) {
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(s, 0));
		while(!q.isEmpty()) {
			Node n=q.poll();
			
			if(n.cnt>t) {
				break;
			}
			if(n.x==g) {
				System.out.println(n.cnt);
				return;
			}
			if(n.x+1<max && !visited[n.x+1]) {
				visited[n.x+1]=true;
				q.add(new Node(n.x+1, n.cnt+1));
			}
			
			if(n.x*2<max) {
				String[] tmp=String.valueOf(n.x*2).split("");
				tmp[0]=String.valueOf(Integer.parseInt(tmp[0])-1<0?0:(Integer.parseInt(tmp[0])-1));
				String result="";
				for(int i=0; i<tmp.length; i++) {
					result+=tmp[i];
				}
				if(!visited[Integer.parseInt(result)]) {
					q.add(new Node(Integer.parseInt(result), n.cnt+1));
				}
			}
			
		}
		System.out.println("ANG");
		return;
		
	}

}
