package com.back.dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestWay {
//	5 6
//	1
//	5 1 1
//	1 2 2
	static StringBuilder sb=new StringBuilder();
	static int[] result;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int nodeCnt=Integer.parseInt(st.nextToken());
		int vex=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(br.readLine());
		result=new int[nodeCnt+1];
		int[][] arr=new int[nodeCnt+1][nodeCnt+1];
		boolean[]visited=new boolean[nodeCnt+1];
		for(int i=0; i<vex; i++) {
			st=new StringTokenizer(br.readLine());
			int depart=Integer.parseInt(st.nextToken());
			int arrival=Integer.parseInt(st.nextToken());
			int weight=Integer.parseInt(st.nextToken());
			arr[depart][arrival]=weight; 
		}
		for(int i=1; i<arr.length; i++) {
			if(i==start) {
				continue;
			}
				bfs(arr,start, i,0, visited);
		}
		for(int i=1; i<result.length; i++) {
			if(i==start) {
				sb.append(result[i]+"\n");
			}else if(result[i]==0){
				sb.append("INF\n");
			}
			else {
				sb.append(result[i]+"\n");
			}
		}
		System.out.println(sb.toString());
	}

	public static void bfs(int[][]arr,int start, int target, int weight, boolean[]visited) {
		if(start==target) {
			if(result[start]==0 || result[start]>weight) {
//				System.out.println("start: "+start+" target: "+target+ " weight: "+weight);
				result[start]=weight;
//				sb.append(weight+"\n");
				return;
			}
		}
		
		for(int i=0; i<arr[0].length; i++) {
			if(!visited[i]&&arr[start][i]!=0) {
				visited[i]=true;
//				System.out.println("i: "+i+" start: "+start+" target: "+target+ " weight: "+weight);
				bfs(arr, i, target, weight+arr[start][i], visited);
				visited[i]=false;
				
			}
		}
		
	}

}
