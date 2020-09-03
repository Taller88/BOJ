package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartLink {
		static int u=0;
		static int d=0;
		static int high=0;
		static int target=0;
		static int answer=Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		high=Integer.parseInt(st.nextToken());
		int f=Integer.parseInt(st.nextToken());
		target=Integer.parseInt(st.nextToken());
		u=Integer.parseInt(st.nextToken());
		d=Integer.parseInt(st.nextToken());
		dfs(f,0);
		System.out.println(answer);
	}
	public static void dfs(int f, int cnt) {
		System.out.println(f);
		if(f==target) {
			answer=Math.min(answer, cnt);
			return;
		}
		if(f+u<=high) {
			dfs(f+u, cnt+1);
			return;
		}
		if(f-d>0) {
			dfs(f-d, cnt+1);
			return;
		}
		
	}

}
