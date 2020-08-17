package com.back.priorityQue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQuePrac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer> q=new PriorityQueue<>();
		PriorityQueue<Integer> q2=new PriorityQueue<>(Collections.reverseOrder());
		int student=sc.nextInt();
		int cnt=sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			
		int first=sc.nextInt();
		int sec=sc.nextInt();
			if(first>sec) {
				q2.add(first);
				q2.add(sec);
			}else {
				q.add(first);
				q.add(sec);
			}
		}
		
		if(!q.isEmpty()) {
			System.out.println("일반");
			for(int i=0;i<student; i++) {
				System.out.println(q.poll());
			}
			
		}else {
			System.out.println("내림차순");
			for(int i=0;i<student; i++) {
				System.out.println(q2.poll());
			}
			
		}
	
	
	}

}
