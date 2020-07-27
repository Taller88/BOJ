package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Area {

	static int[]dx= {0,0,1,-1};
	static int[]dy= {1,-1,0,0};
	static ArrayList<Integer> list=new ArrayList<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int t=Integer.parseInt(st.nextToken());
		int[][] arr=new int[h][w];
		for(int z=0; z<t; z++) {
			st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
//			System.out.println("arr: "+arr.length+" arr[]: "+arr[0].length);
			for(int i=y1; i<y2; i++) {
				for(int j=x1; j<x2; j++) {
					arr[i][j]++;
				}
			}
			
			
		}
		//살아 있는 상자 찾기
//		System.out.println();
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[0].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		int answer=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==0) {
					answer++;
					bfs(arr, i,j);
				}
			}
		}
		
		sb.append(answer+"\n");
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i)+" ");
		}
		System.out.println(sb.toString());
	}

	public static void bfs(int[][] arr, int x, int y) {
		Queue<Dot> q=new LinkedList<>();
		q.add(new Dot(x, y));
		int cnt=0;
		arr[x][y]=1;
		while(!q.isEmpty()) {
			Dot d=q.poll();
			x=d.x;
			y=d.y;
			cnt++;
//			System.out.println("x: "+x+" y:"+y+" cnt: "+cnt);
			int x_=0;
			int y_=0;
			for(int i=0; i<4; i++) {
				x_=x+dx[i];
				y_=y+dy[i];
				if(x_>=0 && y_>=0 && x_<arr.length && y_<arr[0].length) {
					if(arr[x_][y_]==0) {
						arr[x_][y_]=2;
						q.add(new Dot(x_, y_));
					}
				}
				
			}
			
		}
		list.add(cnt);
	}
	static class Dot{
		int x;
		int y;
		public Dot(int x, int y) {
			this.x=x;
			this.y=y;
			
		}
	}
}
