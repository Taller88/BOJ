package com.cos.one;

public class Test3_Knight {
	static int[] dx= {2,2,-2,-2,1,-1,1,-1};
	static int[] dy= {1,-1,1,-1,2,2,-2,-2};
	
	public static int solution(String pos) {
		int cnt=0;
		int x=pos.charAt(0)-'A'+1;
		int y=pos.charAt(1)-'0';
		for(int i=0; i<dx.length; i++) {
			int xx=x+dx[i];
			int yy=y+dy[i];
			if(xx>=1 && yy>=1 && xx<=8 && yy<=8) {
				System.out.println(xx+" "+yy);
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("A7"));
	}

}
