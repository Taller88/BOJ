package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NotSubmit {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tmp="";
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1; i<=30; i++) {
			list.add(i);
		}
//		tmp=tmp.trim();
		for(int i=0; i<28; i++) {
			int work=Integer.parseInt(br.readLine());
			if(list.contains(work)) {
				list.remove(list.indexOf(work));
			}
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
