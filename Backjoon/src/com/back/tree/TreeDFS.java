package com.back.tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TreeDFS {
//	7
//	1 6
//	6 3
//	3 5
//	4 1
//	2 4
//	4 7
	static  int arr[][];
	static boolean visited[];
	static Queue<Integer> q;
	public static void main(String[] args) throws Exception{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	     q=new LinkedList<>();
	     StringTokenizer st;
	     int in=Integer.parseInt(br.readLine());
	     arr=new int [in+1][in+1];
	     for(int i=0; i<in-1; i++) {
	    	 st=new StringTokenizer(br.readLine());
	    	 int a=Integer.parseInt(st.nextToken());
	    	 int b=Integer.parseInt(st.nextToken());
	    	 arr[a][b]=arr[b][a]=1;
	     }
	     for(int i=2; i<arr.length; i++) {
	    	 visited=new boolean[in+1];
		     dfs(1,0,i);
	     }
	     
	     
	     
//	     for(int i=0;i<arr.length; i++) {
//	    	 for(int j=0; j<arr[0].length; j++) {
//	    		 	 System.out.print(arr[i][j] );
//	    	 }
//	    	 System.out.println();
//	     }
	     while(!q.isEmpty()){
	    	 bw.write(q.poll()+"\n");
	     }
	     bw.flush();
	}

	public static void dfs(int s,int p,int target) {
		if(s==target) {
			q.add(p);
			return;
		}
		visited[s]=true;
		for(int i=0; i<arr.length; i++) {
			System.out.println("s: "+s+" i: "+i+" target: "+target);
			
			if(arr[s][i]==1 && !visited[i]) {
				System.out.println("오냐?");
				visited[i]=true;
				dfs(i,s,target);
				visited[i]=false;
			}
		}
		return;
		
	}

}
