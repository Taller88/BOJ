package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandLine {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] arr=new String[n];
		for(int i=0; i<n; i++) {
			arr[i]=br.readLine();
		}
		String out="";
		for(int i=0; i<arr[0].length(); i++) {
			boolean tmp=false;
			for(int j=0; j<n-1; j++) {
				if(arr[j].charAt(i)!=arr[j+1].charAt(i)) {
					tmp=true;
					break;
				}
			}
			if(tmp) {
				out+="?";
			}else {
				out+=arr[0].charAt(i);
			}
		}
		System.out.println(out);
	}

}
