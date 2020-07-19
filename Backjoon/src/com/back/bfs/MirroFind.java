package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MirroFind {

	static int[] dx= {0,1,0,-1};
	static int[] dy= {1,0,-1,0};
	static int[][]arr;
	static boolean[][] visited;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
//		4(세로) 6(가로)
//		101111
//		101010
//		101011
//		111011		
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		arr=new int[h][w];
		visited=new boolean[h][w];
		
		for(int i=0; i<h; i++) {
			String[] tmp=br.readLine().split("");
			for(int j=0; j<tmp.length; j++) {
				arr[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		bfs(0, 0);
		System.out.println("정답: "+arr[h-1][w-1]);
		
		
	}
	public static void bfs(int h, int w) {
		Queue<Integer> qx=new LinkedList<>();
		Queue<Integer> qy=new LinkedList<>();
		qx.add(h);
		qy.add(w);
		System.out.println("h: "+h+" w: "+w);
		System.out.println("x: "+qx.isEmpty() +" y: "+ qy.isEmpty());
		while(!qx.isEmpty() && !qy.isEmpty()) {
			int x=qx.poll();
			int y=qy.poll();
			visited[x][y]=true;
			System.out.println("x: "+x+" y: "+y);
			for(int i=0; i<4; i++) {
				int x_=x+dx[i];
				int y_=y+dy[i];
				if(x_>=0&&y_>=0 && x_<arr.length && y_<arr[0].length ) {
					if(arr[x_][y_]==1 && !visited[x_][y_]) {
						qx.add(x_);
						qy.add(y_);
						visited[x_][y_]=true;
						arr[x_][y_]=arr[x][y]+1;
						
					}
				}
				
			}
		}//while
		
		
	}
	public static void mirroPrint(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
