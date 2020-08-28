package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindTresure {
	static char[][] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		arr=new char[h][w];
		String tmp="";
		for(int i=0; i<h; i++) {
			tmp=br.readLine();
			for(int j=0; j<w; j++) {
				arr[i][j]=tmp.charAt(j);
			}
		}
		int answer=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]=='L') {
					answer=Math.max(bfs(i,j),answer);
				}
			}
		}
		System.out.println(answer);
	}
	static class Dot{
		int x,y,cnt;
		boolean[][]visited;
		public Dot(int x, int y, int cnt, boolean[][]vistied) {
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			this.visited=vistied;
		}
	}
	static int[] dx= {0,0,1,-1};
	static int[] dy= {1,-1,0,0};
	
	private static int bfs(int x, int y) {
		Queue<Dot> q=new LinkedList<Dot>();
		boolean[][] visited=new boolean[arr.length][arr[0].length];
		visited[x][y]=true;
		q.add(new Dot(x, y, 0, visited));
		int result=0;
		while(!q.isEmpty()) {
			Dot d=q.poll();
			result=d.cnt;
//			if(x==4 && y==1) {
//				System.out.println(d.x+" "+d.y);
//			}

			boolean check=true;
			for(int i=0; i<4; i++) {
				int xx=d.x+dx[i];
				int yy=d.y+dy[i];
				if(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length) {
					if(!d.visited[xx][yy] && arr[xx][yy]=='L') {
						d.visited[xx][yy]=true;
						check=false;
						q.add(new Dot(xx, yy, d.cnt+1,d.visited));
					}
				}
			}
//			if(check) {
//				System.out.println("x: "+x+" y: "+y+" xx:"+d.x+" yy:"+d.y+" cnt:"+(d.cnt+1));
//				return d.cnt+1;
//			}
		}
		return result;
	}

}


//5 7
//WLLWWWL
//LLLWLLL
//LWLWLWW
//LWLWLLL
//WLLWLWW


