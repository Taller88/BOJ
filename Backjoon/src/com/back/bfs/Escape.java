package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Escape {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int t=Integer.parseInt(st.nextToken());
		int g=Integer.parseInt(st.nextToken());
		bfs(n,g,t);
		
	}
	static class Button{
		int x,cnt;
		public Button(int x, int cnt) {
			this.x=x;
			this.cnt=cnt;
		}
	}
	private static void bfs(int n, int g, int t) {
	
		Queue<Button> q=new LinkedList<>();
		q.add(new Button(n, 0));
		while(!q.isEmpty()) {
			Button b=q.poll();
			if(b.x==g) {
				System.out.println(b.cnt);
				return;
			}
			if(b.cnt>t) {
				continue;
			}
			if(b.x+1<99999) {
				q.add(new Button(b.x+1, b.cnt+1));
			}
			if(b.x*2<99999) {
				String[] tmp=String.valueOf(b.x*2).split("");
//				System.out.println(Integer.parseInt(tmp[0])-1);
				tmp[0]=String.valueOf((Integer.parseInt(tmp[0])-1)<0?0:(Integer.parseInt(tmp[0])-1));
				String t1="";
				for(int i=0; i<tmp.length; i++) {
					t1+=tmp[i];
				}
				q.add(new Button(Integer.parseInt(t1),b.cnt+1));
				
			}
		}
		System.out.println("ANG");
		return;
	}

}
