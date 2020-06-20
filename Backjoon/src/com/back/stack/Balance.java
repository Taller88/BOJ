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
			Stack<Character> big=new Stack<>();
			Stack<Character> small=new Stack<>();
			int i=0;
			while(in.charAt(i)!='.') {
				
				if(in.charAt(i)=='(') {
					small.push('(');
				}else if(!small.isEmpty()&& small.peek()=='(' && in.charAt(i)==')') {
					small.pop();
				}else if(in.charAt(i)=='[') {
					big.push('[');
				}else if(!big.isEmpty() && big.peek()=='[' && in.charAt(i)==']') {
					big.pop();
				}else if(small.isEmpty() && in.charAt(i)==')') {
					small.push(')');
				}else if(big.isEmpty() && in.charAt(i)==']') {
					small.push(']');
				}
				i++;
			}
			if(small.isEmpty() && big.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}

		}
	}

}
