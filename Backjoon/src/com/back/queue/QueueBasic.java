package com.back.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBasic {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		
		while(sc.hasNext()) {
		String test=sc.nextLine();
			/**
			 * 	push X: 정수 X를 큐에 넣는 연산이다.
				pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				size: 큐에 들어있는 정수의 개수를 출력한다.
				empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
				front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			 */
/**
 * 15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front			
 */
			if(test.contains("push")) {
				String []tmp=test.split(" ");
				q.add(Integer.parseInt(tmp[1]));
			}else if(test.contains("pop")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.poll());
				}
			}else if(test.contains("size")) {
				System.out.println(q.size());
			}else if(test.contains("empty")) {
				if(q.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(test.contains("front")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.peek());
				}
			}else if(test.contains("back")) {
				if(q.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(q.toArray()[q.size()-1]);
				}
				
			}
		}
	}

}
