package com.back.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SdokuSolution {
	static class Dot{
		int x;
		int y;
		public Dot(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	static int[][]result=new int[9][9];
	static ArrayList<Dot> list=new ArrayList<>();
	public static void main(String[] args) throws Exception{
		StringBuilder sb=new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][]arr=new int[9][9];
		
		boolean[][]visited=new boolean[9][9];
		for(int i=0; i<9; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int tmp=Integer.parseInt(st.nextToken());
				if(tmp==0) {
					System.out.println("i: "+i +" j:"+j);
					list.add(new Dot(i, j));
				}
				arr[i][j]=tmp;
			}
		}
		
		dfs(arr,0);
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static boolean checkWidth(int[][] arr,int idx, int a){
		for(int i=0;i<9; i++) {
			if(arr[idx][i]==a) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkHeight(int[][] arr,int idx, int a){
		for(int i=0;i<9; i++) {
			if(arr[i][idx]==a) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkBox(int[][] arr,int x,int y, int a){
		x=x/3;
		y=y/3;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(a==arr[i+(3*x)][j+(3*y)]) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean checkZero(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void dfs(int[][] arr, int idx) {
		if(idx>=list.size()) {
			return;
		}
		if(checkZero(arr)) {
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					result[i][j]=arr[i][j];
				}
			}
		}
		
				Dot t=list.get(idx);
				int i=t.x;
				int j=t.y;
					for(int z=1;z<10; z++) {
						if(checkBox(arr, i, j, z)&&checkWidth(arr, i, z) && checkHeight(arr, j, z)) {
							System.out.println("x: "+i+ " y: "+j+" z: "+z);
							
							arr[i][j]=z;
							dfs(arr, idx+1);
							arr[i][j]=0;
						}
					}
					
			
				
		
	}

}
