package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPassenger {

	public static void main(String[] args) throws Exception {

		BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[] arr=new int[4];
		int tmpDown=Integer.parseInt(st.nextToken());
		int tmpUp=Integer.parseInt(st.nextToken());
		arr[0]=tmpUp-tmpDown;
		
		for(int i=1; i<4; i++) {
			st=new StringTokenizer(br.readLine());
			int down=Integer.parseInt(st.nextToken());
			int board=Integer.parseInt(st.nextToken());
			arr[i]=arr[i-1]+board-down;
		}
		int max=0;
		for(int i=0; i<arr.length; i++) {
			max=Math.max(max, arr[i]);
		}
		System.out.println(max);
	}

}
