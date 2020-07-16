package com.back.backTracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sdoku {
	static int[][]arr=new int[9][9];
	static ArrayList<Integer> list;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		for(int i=0; i<9; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		list=new ArrayList<>();
		for(int i=1; i<=9; i++) {
			list.add(i);
		}
		list.contains(1);
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(arr[i][j]==0) {
					ArrayList<Integer> pList=new ArrayList<>();
					dfs(i,j,pList);
				}
			}
		}
		
	}
	
	
	public static void dfs(int x, int y, ArrayList<Integer> pList) {
		if(pList.size()==1) {
			arr[x][y]=pList.get(0);
			return;
		}
		//가로체크
		for(int i=0; i<9; i++) {
		}
		
	}


	

}
