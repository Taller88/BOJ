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
			String []idx=arr[i].split("");
			int cnt=0;
			while(idx.length>1 && cnt<idx.length-1) {
				String tmp="";
				for(int j=cnt+1; j<idx.length; j++) {
					tmp+=idx[j];
				}
//				System.out.println(idx[cnt]);
				if(tmp.contains(idx[cnt])) {
					String tmp2=tmp.charAt(0)+"";
					if(!tmp2.equals(idx[cnt])) {
						num--;
						break;
					}
				}
				cnt++;
			}
			
		}
		System.out.println(num);
		
		
	}
}