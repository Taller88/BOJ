package com.back.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SdokuSolution {
	static int[]width= {1,2,3,4,5,6,7,8,9};
	static int[]height= {1,2,3,4,5,6,7,8,9};
	static int[]square= {1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) throws Exception{
		StringBuilder sb=new StringBuilder();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][]arr=new int[9][9];
		boolean[][]visited=new boolean[9][9];
		for(int i=0; i<9; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<9;i++) {
			for(int j=0; j<9; j++) {
				if(arr[i][j]==1) {
					dfs(arr,i,j);
				}
			}
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
	public static void dfs(int[][] arr, int i, int j) {
		
	}

}
