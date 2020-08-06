package com.back.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OneMaker {
	static int min=0;
	
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		min=n;
		dfs(n,0);
		System.out.println(min);
	}

	public static void dfs(int n,int cnt) {
		if(n==0) {
			return;
		}
		if(n==1) {
			if(cnt<min) {
				min=cnt;
				return;
			}
		}
		
		if(n%3==0) {
			dfs(n/3, cnt+1);
		}
		if(n%2==0) {
			dfs(n/2, cnt+1);
		}
		dfs(n-1, cnt+1);
		
	}

}
