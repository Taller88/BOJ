package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

import com.back.bfs.Escape.Spot;

public class Escape {
	static int[]dx= {0,0,-1,1};
	static int[]dy= {1,-1,0,0};
	static String answer="KAKTUS";
	public static void main(String[] args) throws Exception{
//		5 4
//		.D.*
//		....
//		..X.
//		S.*.
//		....
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		String[][]arr=new String[h][w];
		boolean[][]visited=new boolean[h][w];
		for(int i=0; i<h; i++) {
			arr[i]=br.readLine().split("");
		}
		bfs(arr, visited);
		System.out.println(answer);
		
	}
	static class Spot implements Comparable<Spot>{
		int x, y,cnt,prior;
		public Spot(int x, int y, int cnt, int prior) {
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			this.prior=prior;
			
			
		}
		@Override
		public int compareTo(Spot o) {
			if(this.cnt==o.cnt) {
				return this.prior-o.prior;
			}
			//물-1 고슴도치 2
			return this.cnt-o.cnt;
		}
		@Override
		public String toString() {
			return "Spot [x=" + x + ", y=" + y + ", cnt=" + cnt + ", prior=" + prior + "]";
		}
		
	}
	public static void bfs(String[][] arr, boolean[][] visited) {
		PriorityQueue<Spot> g=new PriorityQueue();
		int tX=0;
		int tY=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j].equals("*")) {
					g.add(new Spot(i, j, 0,1));
				}
				if(arr[i][j].equals("S")) {
					visited[i][j]=true;
					g.add(new Spot(i, j, 0,2));
				}
				if(arr[i][j].equals("D")) {
					tX=i;
					tY=j;
				}
				
			}
		}
		System.out.println(tX+" "+tY);
		while(!g.isEmpty()) {
				Spot s=g.poll();
				if(s.prior==2) {
					System.out.println(s.toString());
				}
				if(s.prior==2 && s.x==tX && s.y==tY) {
					answer=s.cnt+"";
				}
				for(int i=0; i<4; i++) {
					int xx=s.x+dx[i];
					int yy=s.y+dy[i];
					if(isRange(arr, xx, yy) && arr[xx][yy].equals(".")) {
						if(arr[s.x][s.y].equals("*")&& !arr[xx][yy].equals("D")&& !arr[xx][yy].equals("X")) {//물일때
							arr[xx][yy]="*";
							g.add(new Spot(xx, yy, s.cnt+1, 1));
						}else if(!visited[xx][yy] && !arr[xx][yy].equals("*")&& !arr[xx][yy].equals("X")){//고슴도치
							visited[xx][yy]=true;
							g.add(new Spot(xx, yy, s.cnt+1, 2));
						}
					}
				}
			}
		
	}
	public static boolean isRange(String[][] arr,int x, int y) {
		if(x<arr.length && x>=0 & y>=0 & y<arr[0].length) {
			return true;
		}
		return false;
	}

}
