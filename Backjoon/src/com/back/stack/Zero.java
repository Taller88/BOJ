package com.back.stack;

import java.util.Scanner;
import java.util.Stack;

public class Zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		Stack<Integer> stk=new Stack<>();
		for(int i=0; i<cnt; i++) {
			int tmp=sc.nextInt();
			if(tmp==0) {
				if(!stk.isEmpty()) {
					System.out.println("out: "+stk.peek());
					stk.pop();
					
				}
			}else {
				stk.push(tmp);
			}
		}
		int answer=0;
		while(!stk.isEmpty()) {
			answer+=stk.pop();
		}
		System.out.println(answer);
	}

}
