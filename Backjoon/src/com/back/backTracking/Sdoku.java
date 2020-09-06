package com.back.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sdoku {
	static class Dot{
		int x,y;
		public Dot(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	static int[][]arr=new int[9][9];

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Dot> list=new ArrayList<>();
		for(int i=0; i<9; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(arr[i][j]==0) {
					list.add(new Dot(i, j));
				}
			}
		}
		dfs(list,0);
		
	}

	private static void dfs(ArrayList<Dot> list, int cnt) {
		if(cnt==list.size()) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9 ; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			return;
		}
		Dot d=list.get(cnt);
		for(int i=1; i<10; i++) {
			if(checkWidth(d.x, d.y,i) &&checkHeight(d.x, d.y,i) &&checkSquare(d.x, d.y,i)) {
//				System.out.println(d.x+" "+d.y+" "+" "+i);
				arr[d.x][d.y]=i;
				dfs(list, cnt+1);
				if(i==9) {
					arr[d.x][d.y]=0;
				}
			}
		}
	}

	private static boolean checkSquare(int x, int y, int num) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(x==(x/3)*3+i && y==(y/3)*3+j) {
					continue;
				}
//				System.out.println("square: "+((x/3)*3+i)+" "+((x/3)*3+j)+" "+num+" "+x+" "+y);
				if(arr[(x/3)*3+i][(y/3)*3+j]==num) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkHeight(int x, int y, int num) {
		for(int i=0; i<arr.length; i++) {
			if(x==i) {
				continue;
			}
			if(arr[i][y]==num) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkWidth(int x, int y, int num) {
		for(int i=0; i<arr[0].length; i++) {
			if(y==i) {
				continue;
			}
			if(arr[x][i]==num) {
				return false;
			}
		}
		return true;
	}
	
}
