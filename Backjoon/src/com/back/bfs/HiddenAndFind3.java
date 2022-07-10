package com.back.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class HiddenAndFind3 {

	static class Dot{
		int x, time;
		public Dot(int x, int time) {
			this.x = x;
			this.time = time;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int subin = Integer.parseInt(st.nextToken());
		int sister = Integer.parseInt(st.nextToken());
		int[] visited = new int[100001];
//		Arrays.fill(visited, Integer.MAX_VALUE);
		
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(subin, 0));
		visited[subin] = 0;
		
		int[]dx = {2, 1, -1};
		int result = Integer.MAX_VALUE;
		while(!q.isEmpty()) {
			Dot d = q.poll();
//			System.out.println(d.x);
			if(d.x==sister) {
				if(result>d.time) {
					result=d.time;
					
				}
			}
			
			for(int i = 0; i<dx.length; i++) {
				int x = 0;
				int time = 0;
				if(dx[i]==2) {
					x=d.x*2;
					time = d.time;
				}else {
					x=d.x+dx[i];
					time = d.time+1;
				}
				if(x>=0 && x<=100000) {
					if(visited[x]==0|| visited[x]>time) {
						visited[x] = time;
						q.add(new Dot(x, time));												
					}
				}
			}
					
		}
		
		System.out.println(result);
//		System.out.println(visited[sister]);
	}

}
