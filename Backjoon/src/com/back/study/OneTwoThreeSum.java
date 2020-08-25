package com.back.study;

import java.util.Scanner;

public class OneTwoThreeSum {
	static int answer=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			int target=sc.nextInt();
			answer=0;
			dfs(target, 0);
			System.out.println(answer);
		}
	}
	public static void dfs(int target, int sum) {
		if(sum==target) {
			answer++;
			return;
		}
		if(sum>target) {
			return;
		}
		dfs(target, sum+3);
		dfs(target, sum+2);
		dfs(target, sum+1);
		
	}

}
