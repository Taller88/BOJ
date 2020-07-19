package com.back.dequeue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DequePrac {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> dq=new LinkedList<>();
		StringBuilder sb=new StringBuilder();
		int cnt=Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String operation=st.nextToken();
			if(operation.equals("push_front")) {
//				push_front X: 정수 X를 덱의 앞에 넣는다.
				int x=Integer.parseInt(st.nextToken());
				dq.addFirst(x);
			}else if(operation.equals("push_back")) {
//				push_back X: 정수 X를 덱의 뒤에 넣는다.
				int x=Integer.parseInt(st.nextToken());
				dq.addLast(x);
			}else if(operation.equals("pop_front")) {
//				pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				sb.append(dq.isEmpty()?"-1\n":dq.pollFirst()+"\n");
			}else if(operation.equals("pop_back")) {
//				pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				sb.append(dq.isEmpty()?"-1\n":dq.pollLast()+"\n");
			}else if(operation.equals("size")) {
				sb.append(dq.size()+"\n");
			}else if(operation.equals("empty")) {
//				empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
				sb.append(dq.isEmpty()?"1\n":0+"\n");
			}else if(operation.equals("front")) {
//				front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				sb.append(dq.isEmpty()?"-1\n":dq.peekFirst()+"\n");
			}else if(operation.equals("back")) {
//				back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				sb.append(dq.isEmpty()?"-1\n":dq.peekLast()+"\n");
			}
		}


		System.out.println(sb.toString());




		
		
	}

}
