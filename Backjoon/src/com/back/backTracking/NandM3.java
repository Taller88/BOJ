package com.back.backTracking;

import java.util.Scanner;

public class NandM3 {
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		dfs(0,0,n,m,"");
		System.out.println(sb.toString());
	}
	public static void dfs(int start,int dep, int n, int m,String k) {
		if(dep!=0) {
			k+=start+" ";
		}
		
		if(dep==m) {
			sb.append(k.trim()+"\n");
			return;
		}
		for(int i=1;i<n+1; i++ ) {
				dfs(i,dep+1, n, m, k);
		}
	}

}
