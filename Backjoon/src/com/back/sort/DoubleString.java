package com.back.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DoubleString {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cnt=Integer.parseInt(br.readLine());
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0; i<cnt; i++) {
			arr.add(br.readLine());
		}
		arr.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()!=o2.length()) {
					return o1.length()-o2.length();
				}else {
					return o1.compareTo(o2);
				}
			}
		});
		StringBuilder sb=new StringBuilder();
		sb.append(arr.get(0)+"\n");
		for(int i=1; i<arr.size(); i++) {
			if(!arr.get(i-1).equals(arr.get(i))) {
				sb.append(arr.get(i)+"\n");
			}
		}
		System.out.println(sb.toString());
	}

}
