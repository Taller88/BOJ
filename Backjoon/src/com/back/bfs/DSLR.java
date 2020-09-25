package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DSLR {
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int z=0; z<n; z++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			boolean[]visited=new boolean[10000];
			bfs(s,d,visited);
		}
		System.out.println(sb.toString().trim());
		
	}
//	D: D 는 n을 두 배로 바꾼다. 결과 값이 9999 보다 큰 경우에는 10000 으로 나눈 나머지를 취한다. 그 결과 값(2n mod 10000)을 레지스터에 저장한다.
//	S: S 는 n에서 1 을 뺀 결과 n-1을 레지스터에 저장한다. n이 0 이라면 9999 가 대신 레지스터에 저장된다.
	static class Node{
		String op;
		int x;
		public Node(int x, String op) {
			this.x=x;
			this.op=op;
		}
	}
//	L: L 은 n의 각 자릿수를 왼편으로 회전시켜 그 결과를 레지스터에 저장한다. 이 연산이 끝나면 레지스터에 저장된 네 자릿수는 왼편부터 d2, d3, d4, d1이 된다.
//	R: R 은 n의 각 자릿수를 오른편으로 회전시켜 그 결과를 레지스터에 저장한다. 이 연산이 끝나면 레지스터에 저장된 네 자릿수는 왼편부터 d4, d1, d2, d3이 된다.

	public static void bfs(int s, int d, boolean[]visited) {
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(s, ""));
		visited[s]=true;
		while(!q.isEmpty()) {
			Node n=q.poll();
			if(n.x==d) {
				sb.append(n.op+"\n");
				return;
			}
			if(!visited[n.x*2%10000]) {
				visited[n.x*2%10000]=true;
				q.add(new Node(n.x*2%10000, n.op+"D"));
			}
			
			 int S=n.x==0?9999:n.x-1;
			 if(!visited[S]) {
				 q.add(new Node(S, n.op+"S"));
			 }
			 int L = (n.x % 1000) * 10 + n.x/1000;
             int R = (n.x % 10) * 1000 + n.x/10;

			
			if(!visited[L]) {
				visited[L]=true;
				q.add(new Node(L, n.op+"L"));
			}
			
			
			if(!visited[R]) {
				q.add(new Node(R, n.op+"R"));
			}
			
		}
	}

}
