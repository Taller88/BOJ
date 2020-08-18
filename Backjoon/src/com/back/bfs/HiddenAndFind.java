package com.back.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HiddenAndFind {
	static int[]arr=new int[1000000];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int su=sc.nextInt();
		int find=sc.nextInt();
		Arrays.fill(arr, -1);
		bfs(su, find);
		System.out.println(arr[find]);
	}
	public static void bfs(int su, int find) {
		Queue<Integer> q=new LinkedList<>();
		q.add(su);
		arr[su]=0;
		while(!q.isEmpty()) {
			int loc=q.poll();
			
			if(loc==find) {
					break;
			}
			int[] status=new int[3];
			status[0]=loc-1;
			status[1]=loc+1;
			status[2]=loc*2;
			for(int i=0; i<3; i++) {
				if(status[i]<=1000000 && status[i]>=0) {
					if(arr[status[i]]==-1) {
						arr[status[i]]=arr[loc]+1;
						q.add(status[i]);
					}
				}
			}
			
				
		
		}
	}

}
