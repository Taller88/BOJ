package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThisisSaw {
	static int min=Integer.MAX_VALUE;
	static int limit=0;
	static boolean[]visited=new boolean[100000];
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());//1
		limit=Integer.parseInt(st.nextToken());//7
		int target=Integer.parseInt(st.nextToken());//10
		try {
			dfs(n,0,target);
		}catch(StackOverflowError e) {
			System.out.println("ANG");
			return;
		}
		
		System.out.println(min==Integer.MAX_VALUE?"ANG":min);
	}

	public static void dfs(int n, int cnt, int target) {
		if(n==target) {
			min=Math.min(min, cnt);
			return;
		}
		if(cnt>limit || n>99999) {
			return;
		}
		
		//if(!visited[n]) {
			//visited[n]=true;
			dfs(n+1, cnt+1, target);
			
		
		if(n*2<99999) {
			String[] tmp=String.valueOf(n*2).split("");
			//System.out.println(tmp[0]);
			int f=Integer.parseInt(tmp[0]);
			if(f==0) {
				tmp[0]="0";
			}else {
				tmp[0]=String.valueOf(--f);	
			}
			
			String btn="";
			for(int i=0; i<tmp.length; i++) {
				btn+=tmp[i];
			}
			if(Integer.parseInt(btn)<100000) {
				dfs(Integer.parseInt(btn), cnt+1, target);
			}
			
		}
		
		
	

	}
}
