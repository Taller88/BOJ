package com.back.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HiddenFind {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int bro=sc.nextInt();
		if(s>=bro) {
			System.out.println(s-bro);
		}else {
			System.out.println(bfs(s,bro));
		}
}

	public static int bfs(int s, int bro) {
		Queue<Integer> q=new LinkedList<>();
		q.add(s);
		int[] visited=new int[100001];
		visited[s]=1;
		while(!q.isEmpty()) {
			int su=q.poll();
			System.out.println("su: "+su+" bro: "+bro);
			if(su==bro) {
				return visited[su];
			}
			int su_=0;
//			System.out.println(su);
			for(int i=0; i<3; i++) {
				if(i==0) {
					su_=su*2;
					if(su_>=0 & visited[su_]==0){
						visited[su_]=visited[su]+1;
						q.add((su_));
					}
				}else if(i==1) {
					su_=su-1;
					if(su_>=0 && visited[su_]==0){
						visited[su_]=visited[su]+1;
						q.add((su_));
					}
				
				}else {
					su_=su+1;
					if(su_>=0 && visited[su_]==0){
						visited[su_]=visited[su]+1;
						q.add((su_));
					}
				
				}
			}
			
		}
		return visited[bro];
	}
}
