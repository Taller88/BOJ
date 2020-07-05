package com.back.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Yoseputh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		String result="<";
		while(!q.isEmpty()) {
			for(int i=1; i<=k; i++) {
				if(i==k) {
					result+=q.poll()+", ";
				}else {
					int a=q.poll();
					q.add(a);
				}
			}
		}
		result=result.substring(0,result.lastIndexOf(", "));
		result+=">";
		System.out.println(result);
	}

}
