package com.back.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class XYsort {

	static class Xy{
		int x;
		int y;
		public Xy(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cnt=Integer.parseInt(br.readLine());
		ArrayList<Xy> list=new ArrayList<>();
		StringTokenizer st;
		for(int i=0; i<cnt; i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			list.add(new Xy(x, y));
		}
		list.sort(new Comparator<Xy>() {
			@Override
			public int compare(Xy o1, Xy o2) {
				if(o1.x!=o2.x) {
					return o1.x-o2.x;
				}else {
					return o1.y-o2.y;
				}
			}
		});
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i).x+" "+list.get(i).y+"\n");
		}
		System.out.println(sb.toString());

	}

}
