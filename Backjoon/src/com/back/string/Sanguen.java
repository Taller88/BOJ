package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sanguen {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[][] arr=new String[2][];
		StringTokenizer st=new StringTokenizer(br.readLine());
		arr[0]=st.nextToken().split("");
		arr[1]=st.nextToken().split("");
		
		String fMin="";
		String fMax="";
		
		String sMin="";
		String sMax="";

		for(int i=0; i<arr[0].length; i++) {
			if(arr[0][i].equals("5")) {
				fMax+="6";
				fMin+="5";
						
			}else if(arr[0][i].equals("6")) {
				fMin+="5";
				fMax+="6";
			}else {
				fMin+=arr[0][i];
				fMax+=arr[0][i];
			}
		}
		for(int i=0; i<arr[1].length; i++) {
			if(arr[1][i].equals("5")) {
				sMax+="6";
				sMin+="5";
						
			}else if(arr[1][i].equals("6")) {
				sMin+="5";
				sMax+="6";
			}else {
				sMin+=arr[1][i];
				sMax+=arr[1][i];
			}
		}
		
		System.out.println(Integer.parseInt(fMin)+Integer.parseInt(sMin)+" "+ (Integer.parseInt(fMax)+Integer.parseInt(sMax)));
		
		
		
	}

}
