package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class NotSeenListen {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int notSeenNum=Integer.parseInt(st.nextToken());
		int notListenNum=Integer.parseInt(st.nextToken());
		String notSeen="";
		HashSet<String> set=new HashSet<>();
		String name="";
		int num=notSeenNum+notListenNum;
		for(int i=0; i<notSeenNum; i++) {
			set.add(br.readLine());
		}
		ArrayList<String> out=new ArrayList<>();
		for(int i=0; i<notListenNum; i++) {
			String tmp=br.readLine();
			if(set.contains(tmp)) {
				out.add(tmp);
			}
		}
		Collections.sort(out);
		System.out.println(out.size());
		for(int i=0; i<out.size(); i++) {
			System.out.println(out.get(i));
		}
	}

}
