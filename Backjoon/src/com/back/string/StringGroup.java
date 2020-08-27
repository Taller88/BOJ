package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringGroup {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int g=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		String[] group=new String[g];
		for(int i=0; i<g; i++) {
			group[i]=br.readLine();
		}
		int cnt=0;
		for(int i=0; i<n; i++) {
			String tmp=br.readLine();
			for(int j=0; j<group.length; j++) {
				if(group[j].equals(tmp)) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
