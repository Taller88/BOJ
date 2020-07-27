package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GroupStringSolution {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String[]arr=new String[num];
		for(int i=0; i<arr.length; i++) {
			arr[i]=br.readLine();
		}
		for(int i=0; i<arr.length; i++) {
			boolean temp=false;
			String tmp=arr[i];
			if(tmp.length()==1) {
				continue;
			}
			for(int j=0; j<arr[i].length(); j++) {
				for(int z=j+1; z<arr[i].length(); z++) {
					if(arr[i].charAt(j)==arr[i].charAt(z)) {
						System.out.println("j: "+arr[i].charAt(j)+ " z:"+arr[i].charAt(z));
						temp=true;
						break;
					}
				}
			}
			if(temp) {
				num--;
				continue;
			}
		}
		System.out.println(num);
	}

}
