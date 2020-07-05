package com.back.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=1; i<=a; i++) {
			q.add(i);
		}
		while(q.size()>1) {
			int b=q.poll();
			int c=q.poll();
			q.add(c);
		}
		System.out.println(q.poll());
	}
}
