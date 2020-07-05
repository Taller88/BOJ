package com.back.stack;

import java.util.Scanner;
import java.util.Stack;

public class Balance {

	
	public static void main(String[] args) {
		
		/**
		 * 	
		 * So when I die (the [first] I will see in (heaven) is a score list).
			[ first in ] ( first out ).
			Half Moon tonight (At least it is better than no Moon at all].
			A rope may form )( a trail in a maze.
			Help( I[m being held prisoner in a fortune cookie factory)].
			([ (([( [ ] ) ( ) (( ))] )) ]).
			 .
			.
		 */
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String in=sc.nextLine();
			if(in.equals(".")) {
				break;
			}
			Stack<Character> stk=new Stack<>();
			int i=0;
			while(in.charAt(i)!='.') {
				if(in.charAt(i)=='(' || in.charAt(i)=='[') {
					stk.push(in.charAt(i));
				}else if(!stk.isEmpty() && in.charAt(i)==')' && stk.peek()!='(') {
					stk.push('*');
					break;
				}else if(!stk.isEmpty() &&in.charAt(i)==']' && stk.peek()!='[') {
					stk.push('*');
					break;
				}else if(!stk.isEmpty() && (in.charAt(i)==')'&& stk.peek()=='(' ) ) {
					stk.pop();
				}else if(!stk.isEmpty() && (in.charAt(i)==']' && stk.peek()=='[') ) {
					stk.pop();
				}else {
					stk.push('*');
					break;
				}
				i++;
			}//while
			if(stk.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");	
			}
			
		}//while
	}

}

