package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BuildingEscape {
	static int[]dx= {0,0,0,0,1,-1};
	static int[]dy= {0,0,1,-1,0,0};
	static int[]dz= {1,-1,0,0,0,0};
	static int answer=0;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true) {
			 StringTokenizer st=new StringTokenizer(br.readLine());
			 int L=Integer.parseInt(st.nextToken());
			 int R=Integer.parseInt(st.nextToken());
			 int C=Integer.parseInt(st.nextToken());
			 if(L==0 && R==0 && C==0) {
				 break;
			 }
			 
			char[][][]arr=new char[L][R][C];
			int x=0;
			int y=0;
			int z=0;
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					char[] tmp=br.readLine().toCharArray();
					for(int k=0; k<tmp.length; k++) {
						arr[i][j][k]=tmp[k];
						if(arr[i][j][k]=='S') {
							x=i;
							y=j;
							z=k;
						}
					}
				}
				br.readLine();
			}
			if(bfs(arr,x,y,z)) {
				sb.append("Escaped in "+ answer +" minute(s).\n");
			}else {
				sb.append("Trapped!\n");
			}
				
		}
		System.out.println(sb.toString().trim());
		
		
	}
	private static boolean bfs(char[][][] arr, int x, int y, int z) {
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(x, y, z, 0));
		boolean[][][]visited=new boolean[arr.length][arr[0].length][arr[0][0].length];
		visited[x][y][z]=true;
		boolean check=false;
		while(!q.isEmpty()) {
			Node n=q.poll();
			if(arr[n.x][n.y][n.z]=='E') {
				answer=n.cnt;
				check=true;
				break;
			}
			for(int i=0; i<6; i++) {
				int xx=n.x+dx[i];
				int yy=n.y+dy[i];
				int zz=n.z+dz[i];
				if(xx>=0 && yy>=0 && zz>=0 && xx<arr.length && yy<arr[0].length&& zz<arr[0][0].length) {
					if(arr[xx][yy][zz]!='#' && !visited[xx][yy][zz]) {
						visited[xx][yy][zz]=true;
						q.add(new Node(xx, yy,zz, n.cnt+1));
					}
				}
			}
		}
		return check;
	}
	static class Node{
		int x,y,z,cnt;
		public Node(int x, int y, int z,int cnt) {
			this.x=x;
			this.y=y;
			this.z=z;
			this.cnt=cnt;
		}
	}
	

}
