package com.back.unionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GroupExpression {

	static int[]arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int oper = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(oper==0) {
				union(a,b);
			}else {
				int parentA = find(a);
				int parentB = find(b);
				if(parentA==parentB) {
					System.out.println("Yes");
				}else {
					System.out.println("No");	
				}
			}
		}
		// TODO Auto-generated method stub

	}
	private static int find(int b) {
		if(b==arr[b]) {
			return b;
		}
		return find(arr[b]);
	}
	private static void union(int a, int b) {
		int parentA = find(a);
		int parentB = find(b);
		if(parentA!=parentB) {
			arr[b] = parentA;
		}
		
	}

}
