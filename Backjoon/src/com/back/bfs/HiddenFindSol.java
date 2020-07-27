package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HiddenFindSol {
	static class Subin{
		int loc;
		int time;
		public Subin(int loc, int time) {
			this.loc=loc;
			this.time=time;
		}
	}
    static int answer=0;
    
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int target=sc.nextInt();
        if(s>target){
            answer=s-target;
        }else{
    		bfs(s,target);
        }
		System.out.println(answer);
		
	}
	
	public static void bfs(int s, int target) {
		Queue<Subin> q=new LinkedList<>();
		q.add(new Subin(s, 0));
		
		while(!q.isEmpty()) {
			Subin su=q.poll();
			int n=su.loc;
			int time=su.time;
			
			if(n==target) {
				answer=time;
				break;
			}
			if(n>1) {
				q.add(new Subin(n-1,time+1));
				q.add(new Subin(n+1,time+1));
				q.add(new Subin(n*2,time+1));
			}else {
				q.add(new Subin(n+1,time+1));
				q.add(new Subin(n*2,time+1));
			}
			answer++;
		}
		
		
	}

}
