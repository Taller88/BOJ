package com.back.backTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EmbededOper {
	static long max=-1000000000;
	static long min=1000000000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		6
//		1 2 3 4 5 6
//		2 1 1 1
		int n=Integer.parseInt(br.readLine());
		long[]arr=new long[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine());
		int[]op=new int[4];
		for(int i=0; i<4; i++) {
			op[i]=Integer.parseInt(st.nextToken());
		}
		backTrack(arr, 0,arr[0],op);
		System.out.println(max);
		System.out.println(min);
	}
	private static void backTrack(long[] arr, int idx, long sum, int[] op) {
		if(idx==arr.length-1) {
			max=Math.max(sum, max);
			min=Math.min(sum, min);
			return;
		}
		
		if(op[0]>0) {
			op[0]--;
			backTrack(arr, idx+1, sum+arr[idx+1], op);
			op[0]++;
		}
		if(op[1]>0) {
			op[1]--;
			backTrack(arr, idx+1, sum-arr[idx+1], op);
			op[1]++;
	
		}
		if(op[2]>0) {
			op[2]--;
			backTrack(arr, idx+1, sum*arr[idx+1], op);
			op[2]++;
			
		}
		if(op[3]>0) {
			op[3]--;
			backTrack(arr, idx+1, sum/arr[idx+1], op);
			op[3]++;
		}
	}
		

}
