package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato2 {
	static int[]dx= {0,0,1,-1,0,0};
	static int[]dy= {1,-1,0,0,0,0};
	static int[]dz= {0,0,0,0,1,-1};
	static int answer=0;

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		int[][][]arr=new int[h][m][n];
		for(int i=0; i<h; i++) {
			for(int j=0; j<m; j++) {
				st=new StringTokenizer(br.readLine());
				for(int k=0; k<n; k++) {
					arr[i][j][k]=Integer.parseInt(st.nextToken());
				}
			}
		}
		
		bfs(arr);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length ; j++) {
				for(int k=0; k<arr[0][0].length; k++) {
				if(arr[i][j][k]==0) {
					System.out.println(-1);
					return;
				}
				}
			}
		}
		System.out.println(answer);
	}
	static class Node{
		int x,y,z,cnt;
		public Node(int x, int y, int z, int cnt) {
			this.x=x;
			this.y=y;
			this.z=z;
			this.cnt=cnt;
		}
	}
	private static void bfs(int[][][] arr) {
		boolean[][][]visited=new boolean[arr.length][arr[0].length][arr[0][0].length];
		Queue<Node> q=new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				for(int z=0; z<arr[0][0].length; z++) {
					if(arr[i][j][z]==1) {
						q.add(new Node(i, j, z, 0));
						visited[i][j][z]=true;
					}
				}
			}
		}
		while(!q.isEmpty()) {
			Node n=q.poll();
			for(int z=0; z<6; z++) {
				int xx=n.x+dx[z];
				int yy=n.y+dy[z];
				int zz=n.z+dz[z];
				if(xx>=0 && yy>=0 && zz>=0 && xx<arr.length && yy<arr[0].length && zz<arr[0][0].length) {
					if(!visited[xx][yy][zz] && arr[xx][yy][zz]==0) {
						visited[xx][yy][zz]=true;
						arr[xx][yy][zz]=1;
						q.add(new Node(xx, yy, zz, n.cnt+1));
						answer=Math.max(answer,n.cnt+1);
					}
				}
				
			}
		}
	}

}
