package com.back.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class LineUp {
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static StringBuilder sb=new StringBuilder();
	static int n=0;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		int[] indegree=new int[n+1];
		for(int i=0; i<n+1; i++) {
			list.add(new ArrayList<>());
		}
		for(int j=0; j<vex; j++) {
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			indegree[d]++;
			list.get(s).add(d);
		}
		
		tropical(indegree);
	}
	private static void tropical(int[] indegree) {
		Queue<Integer> start=new LinkedList<Integer>();
		Queue<Integer> result=new LinkedList<Integer>();
		for(int i=1; i<indegree.length;i++) {
			if(indegree[i]==0) {
				start.add(i);
			}
		}
		while(!start.isEmpty()) {
			int s=start.poll();
			result.add(s);
			for(Integer a: list.get(s)) {
				indegree[a]-=1;
				if(indegree[a]==0) {
					start.add(a);
				}
			}
		}
		while(!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
	}

}
