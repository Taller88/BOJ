package com.back.stack;

import java.util.Scanner;
import java.util.*;
public class StackImple {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		for(int i=0; i<cnt; i++) {
			String input=sc.next();
		if(input.contains("push")) {
			int pushInt=Integer.parseInt(sc.next());
			stk.push(pushInt);
		}
		if(input.contains("pop")) {
			if(stk.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(stk.pop());
			}
		}
		if(input.contains("top")) {
			if(stk.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(stk.peek());
			}
		}
		if(input.contains("size")) {
			System.out.println(stk.size());
		}
		if(input.contains("empty")) {
			if(stk.isEmpty()) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
		}
	}

}
