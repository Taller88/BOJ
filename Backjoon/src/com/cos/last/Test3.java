package com.cos.last;

public class Test3 {

	public int solution(String pos) {
		int answer=0;
		int[] dx= {2,-2,1,-1,-2,2,1,-1};
		int[] dy= {1,1,2,2,-1,-1,-2,-2};
		int[][]arr=new int[8][8];
		int x=pos.charAt(1)-'1';
		int y=pos.charAt(0)-'A';
		for(int i=0; i<8; i++) {
			int xx=x+dx[i];
			int yy=y+dy[i];
			if(xx>=0 && yy>=0 && xx<arr.length && yy<arr.length) {
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Test3 sol=new Test3();
		System.out.println(sol.solution("A7"));
		
	}

}
