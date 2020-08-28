package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HedgehogEscape {
	static char[][] arr;
	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
	
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
		int x,y,cnt,type;
		public Dot(int x, int y, int cnt, int type) {
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			this.type=type;
		}
	}
	public static boolean isRange(int x, int y) {
		if(x>=0 && y>=0 && x<arr.length && y<arr[0].length) {
			return true;
		}
		return false;
	}
	
	public static int bfs() {
		Queue<Dot> q=new LinkedList<Dot>();
		int dX=0;
		int dY=0;
		
		//눈 먼저 넣기
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]=='*') {
					q.add(new Dot(i, j, 0, 1));//눈 type 1
				}else if(arr[i][j]=='D') {
					dX=i;
					dY=j;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]=='S') {
					q.add(new Dot(i, j, 0, 0));//고슴도치 type 0
				}
			}
		}
		int result=0;
		while(!q.isEmpty()) {
			Dot d=q.poll();
//			System.out.println("x:"+dX+" y:"+dY);
//			for(int i=0; i<arr.length; i++) {
//				for(int j=0; j<arr[0].length; j++) {
//					System.out.print(arr[i][j]);
//				}
//				System.out.println();
//			}
			if(d.x==dX && d.y==dY && d.type==0) {
				result=d.cnt;
				return result;
			}
			if(d.type==1) {//눈인 경우
				for(int z=0; z<4; z++) {
					int xx=dx[z]+d.x;
					int yy=dy[z]+d.y;
					if(isRange(xx, yy) ) {
						if(arr[xx][yy]=='.'|| arr[xx][yy]=='S') {
							arr[xx][yy]='*';
							q.add(new Dot(xx, yy, d.cnt, 1));
						}
					}
				}
			}else {
				
//				3 3
//				D.*
//				...
//				.S.
				for(int z=0; z<4; z++) {
					int xx=dx[z]+d.x;
					int yy=dy[z]+d.y;
					if(isRange(xx, yy)) {
						if(arr[xx][yy]=='.' || arr[xx][yy]=='D') {
							q.add(new Dot(xx, yy, d.cnt+1, 0));
						}
					}else if(isRange(xx, yy) && xx==dX && yy==dY) {
						result=d.cnt+1;
						
						return result;
					}
				}
				
			}
		}
		return result;
	}

}
