package com.back.tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TreeBFS {
	public static void main(String[] args) throws Exception{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	     StringTokenizer st;
	     int in=Integer.parseInt(br.readLine());
	     int [][]arr=new int [in+1][in+1];
	     
	     for(int i=0; i<in-1; i++) {
	    	 st=new StringTokenizer(br.readLine());
	    	 int a=Integer.parseInt(st.nextToken());
	    	 int b=Integer.parseInt(st.nextToken());
	    	 arr[a][b]=arr[b][a]=1;
	     }
	    
	     for(int i=2; i<arr.length; i++) {
	    	 boolean []visited=new boolean[in+1];
		     bw.write(bfs(arr,i,visited)+"\n");
	     }
	     bw.flush();
	
	}

	public static int bfs(int[][] arr, int target, boolean[] visited) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(1);
		visited[1]=true;
		int result=0;		
		while(!q.isEmpty()) {
			int a=q.poll();
			visited[a]=true;
			for(int i=0; i<arr[a].length; i++) {
				if(arr[a][i]==1 && !visited[i]) {
					if(target==i) {
						result=a;
						break;
					}
					q.offer(i);
				}
			}
			if(result==target) {
				break;
			}
		
		}
		return result;

	}
}
