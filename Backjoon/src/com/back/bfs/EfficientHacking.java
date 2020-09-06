package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class EfficientHacking {
	static ArrayList<Integer>[]arr;
	static int[]cntArr;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int num=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		arr=new ArrayList[num+1];
		for(int i=0; i<=num; i++) {
			arr[i]=new ArrayList<>();
		}
		cntArr=new int[num+1];
		
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int c=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			
			arr[p].add(c);

		}
		int max=0;
		for(int i=1; i<num+1; i++) {
			bfs(i);
			max=Math.max(cntArr[i],max);
//			System.out.println(cntArr[i]);
		}
		StringBuilder sb=new StringBuilder();
		
		for(int i=1; i<cntArr.length; i++) {
			if(max==cntArr[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb.toString());
	}

	private static void bfs(int start) {
		Queue<Integer> q=new LinkedList<>();
		boolean[]visited=new boolean[arr.length];
		q.add(start);
		visited[start]=true;
		while(!q.isEmpty()) {
			int s=q.poll();
			for(int a:arr[s]) {
				if(!visited[a]) {
					q.add(a);
					visited[a]=true;
					cntArr[start]++;
				}
			}
		}
		return;
	}

}
