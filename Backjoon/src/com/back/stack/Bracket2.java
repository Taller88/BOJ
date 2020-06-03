package com.back.stack;

import java.util.*;

public class Bracket2 {

	/*
	 * ()가 알맞게 잘 들어갔는지 Check 하는 문제
	 * - Stack을 활용하여 구현
	 *  1. '('가 나오면 Stack에 저장 
	 *  2. ')'가 나오면 Stack pop()
	 *   * Stack이 비어있는데 ')' 나오면 "No" 반환 
	 *  3. for문을 다 돌았는데 Stack에 값이 남아있는 것은 '('의 개수와 ')'의 개수가 맞지 않다는 것 -> No 반환!
	 */
	public static String check(String test) {
		Stack<Character> stk=new Stack<>();
		for(int j=0; j<test.length(); j++) {
			char tmp=test.charAt(j);
			if(tmp=='(') {
				stk.push(tmp);
			}else {
				if(stk.isEmpty()) {
					return "NO";
				}else {
					stk.pop();
				}
				
			}
		}
		if(!stk.isEmpty())
			return "NO";
		return "YES";
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int cnt=sc.nextInt();
	for(int i=0; i<cnt; i++) {
		
		String test=sc.next();
		System.out.println(check(test));
	}
		
	}

}
