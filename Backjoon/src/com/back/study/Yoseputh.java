package com.back.study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Yoseputh {

	public static void main(String[] args) throws Exception{

		LinkedList<Integer> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int K=sc.nextInt()-1;
		for(int i=1; i<=num; i++) {
			q.add(i);
		}
		int idx=K;
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		while(q.size()!=1) {
			sb.append(q.get(idx)+",");
			q.remove(idx);
			idx=(idx+K)%q.size();
		}
		sb.append(q.get(0)+">");
		System.out.println(sb.toString());
	}

}
