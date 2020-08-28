package com.back.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.back.bfs.StartLink.Ele;

public class StartLink {
	static int limit=0;
	static int current=0;
	static int target=0;
	static int u=0;
	static int d=0;
	
	public static void main(String[] args) throws Exception{
//		10(전체층) 1( 강호 ) 10(target) 2(U) 1(D)
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		current=sc.nextInt();
		target=sc.nextInt();
		u=sc.nextInt();
		d=sc.nextInt();
		int result=bfs();
		System.out.println(result==0?"use the stairs":result);
	}
	static class Ele{
		int x,cnt;
		public Ele(int x, int cnt) {
			this.x=x;
			this.cnt=cnt;
		}
	}
	private static int bfs() {
		Queue<Ele> q=new LinkedList<Ele>();
		q.add(new Ele(current, 0));
		int answer =0;
		int cnt=0;
		boolean visited[]=new boolean[limit+1];
		while(!q.isEmpty()) {
			Ele e=q.poll();
			cnt++;
//			System.out.println(e.x);
			if(e.x==target) {
				return e.cnt;
			}
			if(e.x+u<=limit) {
				if(!visited[e.x+u]) {
					visited[e.x+u]=true;
					q.add(new Ele(e.x+u, e.cnt+1));
				}
			}
			if(e.x-d>0) {
				if(!visited[e.x-d]) {
					visited[e.x-d]=true;
					q.add(new Ele(e.x-d, e.cnt+1));
				}
			}
		}
		return answer;
	}

}
