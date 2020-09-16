package com.cos.two;

public class Test6 {

	public static String solution(String op) {
		
		int x=0;
		int y=0;
		for(int i=0; i<op.length(); i++) {
			char o=op.charAt(i);
			if(o=='L') {
				x-=1;
			}else if(o=='R') {
				x+=1;
			}else if(o=='U') {
				y+=1;
			}else {
				y-=1;
			}
		}
		String pos="["+x+","+y+"]";
		return pos;
	}
	public static void main(String[] args) {
		System.out.println(solution("URDDL"));
	}

}
