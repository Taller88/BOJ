package com.back.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideAndSeek {

	static int[] arr = null;
	static Queue<Integer> q = new LinkedList();
	
	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[100001];
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Arrays.fill(arr,-1);
		
		q.add(n);
		arr[n] = 0;

		int answer = 0;
		int time = 0;
		while(!q.isEmpty()) {
			int d = q.poll();
			
			
			if(d==k) {
				answer = arr[d];
				break;
			}
			
			
			int[] find = new int[3];
			find[0] = d*2;
			find[1] = d+1;
			find[2] = d-1;
			
			for(int i=0; i<find.length; i++) {
				
				if(find[i]<=arr.length && find[i]>=0) {
					if(arr[find[i]]==-1) {
						arr[find[i]] = arr[d]+1;
						q.add(find[i]);						
					}
				}
			}
			
			
			
			
		}
		System.out.println(answer);
		

	}
}

