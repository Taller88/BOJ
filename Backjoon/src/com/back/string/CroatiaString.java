package com.back.string;

import java.io.*;

public class CroatiaString {

	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String tmp=br.readLine().trim();
		String arr[]= {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		int cnt=0;
		
		for(int i=0; i<arr.length; i++) {
			if(tmp.contains(arr[i])) {
				tmp=tmp.replace(arr[i],"*");
				System.out.println(tmp);
			}
		}
		bw.write(tmp.length()+"");
		bw.flush();
		bw.close();
		br.close();
		//ljes=njak
	}

}
