package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Escape {
	static int[]dx= {0,0,-1,1};
	static int[]dy= {1,-1,0,0};

	public static void main(String[] args) throws Exception{
//		3 3
//		D.*
//		...
//		.S.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		String[][] arr=new String[h][w];
		for(int i=0; i<h; i++) {
			arr[i]=br.readLine().split("");
		}
		int day=bfs(arr);
		System.out.println(day==0?"KAKTUS":day);
	}
	public static boolean isRange(String[][] arr, int x, int y) {
		if(x>=0 && y>=0 && x<arr.length&& y<arr[0].length) {
			return true;
		}
		return false;
	}
	public static int bfs(String[][] arr) {
		Queue<Dot> s=new LinkedList<>();
		Queue<Dot> w=new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j].equals("*")) {
					w.add(new Dot(i, j,0));
				}else if(arr[i][j].equals("S")) {
					s.add(new Dot(i,j,0));
				}
			}
		}
		int day=0;
		while(!s.isEmpty()) {
			int wCnt=w.size();
			for(int j=0; j<wCnt; j++) {//물 퍼트리기
				Dot w1=w.poll();
				for(int i=0; i<4; i++) {
					int hh=w1.x+dx[i];
					int ww=w1.y+dy[i];
					if(isRange(arr, hh, ww) && arr[hh][ww].equals(".")) {
						arr[hh][ww]="*";
						w.add(new Dot(hh, ww,0));
					}
				}
			}//물 for
			
			int sCnt=s.size();
			for(int i=0; i<sCnt; i++) {
				Dot d=s.poll();
				for(int j=0; j<4; j++) {
					int xx=d.x+dx[j];
					int yy=d.y+dy[j];
					if(isRange(arr, xx, yy) && arr[xx][yy].equals(".")) {
						s.add(new Dot(xx, yy, d.day+1));
					}else if(isRange(arr, xx, yy) && arr[xx][yy].equals("D")) {
						day=d.day+1;
						return d.day+1;
					}
					
				}
			}
			
		}
		return day;
	}
	static class Dot{
		int x,y,day;
		public Dot(int x, int y, int day) {
			this.x=x;
			this.y=y;
			this.day=day;
		}
	}


}
