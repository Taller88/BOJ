package com.back.dfsbfs;
import java.util.*;

public class HouseNum {
	static boolean[][] visited;
	static int[][] house;
	static int temp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		visited=new boolean[num][num];
		house=new int[num][num];
		System.out.println();
		for(int i=0; i<num; i++) {
			String[] tmp=sc.next().split("");
			for(int j=0; j<tmp.length; j++) {
				house[i][j]=Integer.parseInt(tmp[j]);
				System.out.print(house[i][j]+" ");
			}
			System.out.println();
		}
		PriorityQueue<Integer> q=new PriorityQueue<>();//오름차순으로 나타내기 위해
		
		for(int i=0; i<house.length; i++) {
			for(int j=0; j<house[0].length; j++) {
				if(!visited[i][j] && house[i][j]==1) {
					temp=0;
					System.out.println("("+(i+1)+", "+(j+1)+")");
					dfs(i,j);
					q.offer(temp);
				}
			}
		}
		System.out.println(q.size());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

	public static void dfs(int x, int y) {
		if(x<0||y<0||x>=house.length ||y>=house.length||visited[x][y] || house[x][y]==0) {
			return;
		}
		visited[x][y]=true;
		temp++;
		System.out.println("    dfs방문: ("+(x+1)+","+(y+1)+")");
		dfs(x+1,y);
		dfs(x,y+1);
		dfs(x-1,y);
		dfs(x,y-1);
//		return dfs(x+1,y,dan);
	}

}
