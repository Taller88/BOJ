package com.back.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Backsol {
	static int[]arr;
	static ArrayList<Integer> answer=new ArrayList<>();
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		arr=new int[9];
		for(int i=0; i<9; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		boolean[] visited=new boolean[9];
		dfs("",0,0,visited,0);
		Collections.sort(answer);
//		System.out.println("답: "+answer.size());
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
	public static boolean dfs(String result,int s, int weight, boolean[] visited ,int cnt) {
		if(weight==100 && cnt==7) {
//			System.out.println(result);
			String[] tmp=result.split(" ");
			for(int i=0; i<tmp.length;i++) {
				answer.add(Integer.parseInt(tmp[i]));
			}
			return true;
		}
		if(cnt>7) {
			return false;
		}
		if(weight>100) {
			return false;
		}
//		System.out.println("tmp: "+weight+" "+cnt);
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i]=true;
				if(dfs(result+arr[i]+" ", i, weight+arr[i], visited, cnt+1)) {
					return true;
				}
				visited[i]=false;
			}
		}
		return false;
	}

}
