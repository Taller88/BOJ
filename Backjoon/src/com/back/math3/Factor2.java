package com.back.math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Factor2 {

	 public static void main(String[]args) throws Exception{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	   
	        int a=Integer.parseInt(br.readLine());
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        
	        int[]arr=new int[a];
	        for(int i=0; i<a; i++) {
	        	arr[i]=Integer.parseInt(st.nextToken());
	        }
	        Arrays.sort(arr);
	        
	        bw.write(arr[0]*arr[a-1]+"");
	        bw.flush();
	        
	}

}
