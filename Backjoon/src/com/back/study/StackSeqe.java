package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class StackSeqe {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		8
//		4
//		3
//		6
//		8
//		7
//		5
//		2
//		1
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Stack<Integer> stk=new Stack<>();
		ArrayList<String> list=new ArrayList<>();
		int j=0;
			for(int i=1; i<=num; i++) {
				stk.add(i);
				list.add("+");
				while(!stk.isEmpty() && stk.peek()==arr[j]) {
					stk.pop();
					list.add("-");
					j++;
				}
			}
		if(!stk.isEmpty()) {
			System.out.println("NO");
		}else {
			for(String a: list) {
				System.out.print(a+" ");
			}
		}
	}

}
