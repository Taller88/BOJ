package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HedgehogEscape2 {
	static char[][] arr;
	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
	static Queue<Dot> hed=new LinkedList<>();
	static Queue<Dot> water=new LinkedList<>();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		arr=new char[h][w];
		String tmp="";
		for(int i=0; i<h; i++) {
			tmp=br.readLine();
			for(int j=0; j<tmp.length(); j++) {
				arr[i][j]=tmp.charAt(j);
			}
		}
		
		int answer=bfs();
		System.out.println(answer==0?"KAKTUS":answer);
	}
	static class Dot{
		int x, y;
		public Dot(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static int bfs() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]=='*') {
					water.add(new Dot(i, j));
				}else if(arr[i][j]=='S') {
					hed.add(new Dot(i, j));
				}
			}
		}
		int answer=0;
		int day=0;
		while(!hed.isEmpty()) {
			System.out.println();
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			day++;
			extendWater();
			if(moveHed()) {
				return day;
			}
		}
		return answer;
	}
	public static boolean moveHed() {
		int size=hed.size();
		for(int z=0; z<size; z++) {
			Dot d=hed.poll();
			for(int i=0; i<4; i++) {
				int xx=dx[i]+d.x;
				int yy=dy[i]+d.y;
				if(isRange(xx, yy)) {
					if(arr[xx][yy]=='.') {
						arr[xx][yy]='S';
						hed.add(new Dot(xx, yy));
					}else if(arr[xx][yy]=='D') {
						hed.add(new Dot(xx, yy));
						return true;
					}
				}
				
			}
		}
		return false;
	}
	private static boolean isRange(int x, int y) {
		if(x>=0 && y>=0 && x<arr.length && y<arr[0].length) {
			return true;
		}
		return false;
	}
	private static void extendWater() {
		int size=water.size();
		for(int z=0; z<size; z++) {
			Dot d=water.poll();
			for(int i=0; i<4; i++) {
				int xx=d.x+dx[i];
				int yy=d.y+dy[i];
				if(isRange(xx, yy)) {
					if(arr[xx][yy]=='.') {
						arr[xx][yy]='*';
						water.add(new Dot(xx, yy));
					}
				}
			}
		}
	}
}
