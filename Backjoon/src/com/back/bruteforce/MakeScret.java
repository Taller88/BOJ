package com.back.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class MakeScret {
	static String[] mo= {"a", "e", "i", "o", "u"};
	static ArrayList<String> answer=new ArrayList<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int cnt=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		String[] arr=new String[n];
		st=new StringTokenizer(br.readLine());
		int moCnt=0;
		int jaCnt=0;
		for(int i=0; i<n; i++) {
			arr[i]=st.nextToken();
//			System.out.println(arr[i]+" "+arr[i].length());
		}
		boolean[] visited=new boolean[arr.length];
		Arrays.sort(arr);
		dfs(cnt,-1,arr,"", visited);
		Collections.sort(answer);
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
//		System.out.println(answer.size());
	}

	public static void dfs(int cnt, int n,String[] arr, String result, boolean[] visited) {
		if(cnt==0) {
			int moCnt=0;
			int jaCnt=0;
			
			for(int i=0; i<result.length();i++) {
				boolean check=false;
				for(int j=0; j<mo.length; j++) {
					if(String.valueOf(result.charAt(i)).equals(mo[j])) {
						moCnt++;
						check=true;
						break;
					}
				}
				if(!check) {
					jaCnt++;
				}
			}
//			System.out.println(result+" mo:"+moCnt+" ja:"+jaCnt);
			if(jaCnt>=2 && moCnt>=1) {
				answer.add(result);
				return;
			}
			return;
		}
		for(int i=0; i<arr.length; i++) {
			if(!visited[i] && i>n) {
				visited[i]=true;
				dfs(cnt-1,i, arr, result+arr[i], visited);
				visited[i]=false;
			}
		}
		
	}

}
