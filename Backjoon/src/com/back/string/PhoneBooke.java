package com.back.string;

import java.io.*;
public class PhoneBooke {

	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String a=br.readLine();
		String[] arr=new String[10];
		arr[0]="";
		arr[1]="ABC";
		arr[2]="DEF";
		arr[3]="GHI";
		arr[4]="JKL";
		arr[5]="MNO";
		arr[6]="PQRS";
		arr[7]="TUV";
		arr[8]="WXYZ";
		arr[9]="";
		
		int cnt=0;
		for(int i=0; i<a.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j].contains(a.charAt(i)+"")) {
					cnt+=(j+2);
				}
			}
		}
		bw.write(cnt+"");
		bw.flush();
		
		
	}

}
