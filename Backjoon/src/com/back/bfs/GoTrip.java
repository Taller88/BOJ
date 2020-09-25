package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GoTrip {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int nodeCnt=Integer.parseInt(br.readLine());
		int trip=Integer.parseInt(br.readLine());
		
		int[][]arr=new int[nodeCnt+1][nodeCnt+1];
		int[]tripArr=new int[trip];
		StringTokenizer st;
		for(int i=1; i<arr.length; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=1; j<arr[0].length; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<tripArr.length; i++) {
			tripArr[i]=Integer.parseInt(st.nextToken());
		}
		String answer="YES";
		for(int i=0; i<tripArr.length-1; i++) {
			if(!bfs(arr,tripArr[i],tripArr[i+1])) {
				answer="NO";
				break;
			}
		}		
		System.out.println(answer);
	}

	private static boolean bfs(int[][] arr, int s, int t) {
		Queue<Integer> q=new LinkedList<>();
		boolean[]visited=new boolean[arr.length];
		q.add(s);
		visited[s]=true;
		boolean check=false;
		while(!q.isEmpty()) {
			int n=q.poll();
			if(n==t) {
				check=true;
				break;
			}
			for(int i=1; i<arr[n].length; i++) {
				if(arr[n][i]==1 && !visited[i]) {
					visited[i]=true;
					q.add(i);
				}
			}
			
		}
		return check;
	}

}
