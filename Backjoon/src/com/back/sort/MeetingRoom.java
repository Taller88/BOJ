package com.back.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MeetingRoom {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cnt=Integer.parseInt(br.readLine());
		int[][]arr=new int[cnt][2];
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<cnt; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			map.put(a, b);
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i][0] +" "+arr[i][1]);
		}
	}

}
