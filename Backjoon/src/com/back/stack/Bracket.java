package com.back.stack;
import java.util.*;
public class Bracket {
/**
 * 개수로만 Check 한 것 당연히 안됨 
 * )( -> 이것도 Yes로 나옴
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		
		Stack<Character> stk=new Stack<Character>();
		
		
		for(int i=0; i<cnt; i++) {
			int leftCnt=0;
			int rightCnt=0;
			String test=sc.next();
			for(int j=0; j<test.length(); j++) {
				if(test.charAt(j)==')') {
					rightCnt++;
				}else {
					leftCnt++;
				}
			}//j For
			System.out.println("R: "+rightCnt +" L: "+leftCnt);
			System.out.println(rightCnt==leftCnt?"Yes":"No");
		}
		
		
	}

}
