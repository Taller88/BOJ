package com.back.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Age {
//	3
//	21 Junkyu
//	21 Dohyun
//	20 Sunyoung
	static class ageSort{
		int age;
		String name;
		public ageSort(int age, String name) {
			this.age=age;
			this.name=name;
		}
	}
	public static void main(String[]args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        ArrayList<ageSort> list=new ArrayList<>();
        int cnt=Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
        	st=new StringTokenizer(br.readLine());
        	list.add(new ageSort(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        list.sort(new Comparator<ageSort>() {
			@Override
			public int compare(ageSort o1, ageSort o2) {
				return o1.age-o2.age;
			}
		});
        for(int i=0; i<list.size(); i++) {
        	ageSort as=list.get(i);
        	sb.append(as.age+" "+as.name+"\n");
        }
        System.out.println(sb.toString());
    }
}
