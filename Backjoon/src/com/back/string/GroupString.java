package com.back.string;
import java.io.*;
import java.util.Arrays;

public class GroupString {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		/**
		 * 
		 * 4
	aba
	abab
	abcabc
	a
	
	3
	happy
	new
	year
	
		 */
		
		int tmp=Integer.parseInt(br.readLine());
		String[] arr=new String[tmp];

		for(int i=0; i<tmp; i++) {
			arr[i]=br.readLine();
		}
		Arrays.sort(arr);
		
		
		
		
		
	}

}
