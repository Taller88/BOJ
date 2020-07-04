package com.back.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBasic {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		ArrayList<Integer> q=new ArrayList();
		for(int i=0; i<line; i++) {
//			push X: 정수 X를 큐에 넣는 연산이다.
//			pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//			size: 큐에 들어있는 정수의 개수를 출력한다.
//			empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//			front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//			back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			String input=sc.nextLine();
			if(input.contains("push")) {
				int x=Integer.parseInt(input.split(" ")[1]);
				q.add(x);
			}else if(input.equals("pop")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.get(0));
					q.remove(0);
				}
			}else if(input.equals("size")) {
				System.out.println(q.size());
			}else if(input.equals("empty")) {
				if(q.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(input.equals("front")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.get(0));
				}

			}else if(input.equals("back")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.get(q.size()-1));
				}

			}


		}
	}

}
