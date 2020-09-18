package com.cos.last;
import java.util.*;

public class Bfs {
	static class Node{
		int x, y,cnt;
		public Node(int x, int y, int cnt) {
			this.x=x;
			this.y=y;
			this.cnt=cnt;
		}
	}
	static int[]dx= {0,0,1,-1};
	static int[]dy= {1,-1,0,0};
	
	public int solution(int num, int[][]garden) {
		int answer=0;
		Queue<Node> q=new LinkedList<>();
		for(int i=0; i<garden.length; i++) {
			for(int j=0; j<garden[0].length; j++) {
				if(garden[i][j]==1) {
					q.add(new Node(i,j,0));
				}
			}
		}
		boolean[][]visited=new boolean[num][num];
		while(!q.isEmpty()) {
			Node n=q.poll();
			for(int i=0; i<4; i++) {
				int xx=n.x+dx[i];
				int yy=n.y+dy[i];
				if(xx>=0 &&yy>=0 && xx<num&& yy<num) {
					if(garden[xx][yy]==0) {
						garden[xx][yy]=1;
						q.add(new Node(xx,yy,n.cnt+1));
						answer=n.cnt+1;
					}
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Bfs sol=new Bfs();
		int n=2;
		int garden[][]= {{1, 1}, {1, 1}};
		System.out.println(sol.solution(n, garden));
	}

}
