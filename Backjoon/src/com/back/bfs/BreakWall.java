package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BreakWall {
	static boolean[][][]visited;
	static int[][]arr;
	static int[]dx= {0,0,1,-1};
	static int[]dy= {1,-1,0,0};
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		arr=new int[h][w];
		visited=new boolean[h][w][2];
		for(int i=0; i<h; i++) {
			String[] tmp=br.readLine().split("");
			for(int j=0; j<w; j++) {
				arr[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		System.out.println(bfs(0,0));
		
	}
	static class Node{
		int x,y,cnt,breakWall;
		public Node(int x, int y, int cnt, int breakWall) {
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			this.breakWall=breakWall;
		}
		
	}
	
	private static int bfs(int x, int y) {
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(x, y, 0, 0));
		visited[x][y][0]=true;
		while(!q.isEmpty()) {
			Node n=q.poll();
//			System.out.println(n.x+" "+n.y+" "+n.cnt+" "+n.breakWall);
			if(n.x==arr.length-1 && n.y==arr[0].length-1) {
				return n.cnt;
			}
			
			
			for(int i=0; i<4; i++) {
				int xx=n.x+dx[i];
				int yy=n.y+dy[i];
				
				if(isRange(xx, yy)) {
					if(arr[xx][yy]==1) {//
						if(n.breakWall==0 && !visited[xx][yy][1]) {
							visited[xx][yy][1]=true;
							q.add(new Node(xx, yy, n.cnt+1, 1));
						}		
					}else {//벽이 아닐경우
						if(!visited[xx][yy][0]) {
							visited[xx][yy][0]=true;
							q.add(new Node(xx, yy, n.cnt+1, n.breakWall));
						}
					}
				}
			}
		}
		return -1;
	}
	
	public static boolean isRange(int x, int y) {
		if(x>=0 && y>=0 && x<arr.length && y<arr[0].length) {
			return true;
		}
		return false;
	}
}
