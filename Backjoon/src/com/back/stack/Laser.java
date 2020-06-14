package com.back.stack;
import java.util.*;
public class Laser {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		input=input.replace("()", "0");
		Stack<Character> stk=new Stack<>();
		int cnt=0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='(') {
				stk.push(input.charAt(i));
			}
			if(input.charAt(i)=='0') {
				cnt+=stk.size();
			}
			if(input.charAt(i)==')') {
				cnt+=1;
				stk.pop();
			}
		}
		System.out.println(cnt);
	
	
	}

}
