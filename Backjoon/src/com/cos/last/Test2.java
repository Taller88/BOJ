package com.cos.last;

public class Test2 {
	static int[]dx= {0,1,0,-1};
	static int[]dy= {1,0,-1,0};
	
	public int solution(int n) {
		int[][]arr=new int[n][n];
		int answer=0;
		int val=1;
		int x=0;
		int y=0;
		int idx=0;
		while(x>=0 && y>=0 && x<arr.length && y<arr[0].length && arr[x][y]==0) {
			arr[x][y]=val++;
			
			x=x+dx[idx%4];
			y=y+dy[idx%4];
			if(x<0 || y<0 || x>arr.length-1 || y>arr.length-1|| arr[x][y]!=0) {
				x=x-dx[idx%4];
				y=y-dy[idx%4];
				idx++;
				x=x+dx[idx%4];
				y=y+dy[idx%4];
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0 ; j<arr.length; j++) {
				if(i==j) {
					answer+=arr[i][j];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return answer;
	}
	public static void main(String[] args) {
		Test2 sol=new Test2();
		System.out.println(sol.solution(4));
	}

}
