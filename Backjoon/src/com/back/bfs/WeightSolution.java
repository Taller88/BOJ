package com.back.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.xml.sax.InputSource;

public class WeightSolution {

	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][]arr=new int[n][n];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0 ; j<n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
		
		
		}
//			3
//			0 1 0
//			0 0 1
//			1 0 0
	

}
